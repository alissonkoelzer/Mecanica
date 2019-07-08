/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aliso
 */
public abstract class GereniarBanco implements Banco {

    public String nomeTabela;
    public String InicioCampo;
    public String pkField;
    public  Class cls;
    public Connection connection;
    public Map<String, Object> dados = new HashMap<String, Object>();

    {

        connection = new connection.ConnectionFactory().getConnection();

    }

    @Override
    public Integer salvar() {
        Integer lastId = 0;

        List<Field> fields = getAllModelFields(cls);

        try {
            for (Field field : fields) {

                field.setAccessible(true);

                Object value = field.get(this);
                dados.put(field.getName(), value);
                System.out.println(field.getName());

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            String campos = "";
            String values = "";
            Object[] toArray = dados.keySet().toArray();
            for (int i = 0; i < toArray.length; i++) {
                if (toArray[i] != pkField) {
                    campos += InicioCampo + "" + toArray[i];
                    if (dados.get(toArray[i]) instanceof GereniarBanco) {
                        GereniarBanco Objeto = (GereniarBanco) dados.get(toArray[i]);

                        values += "'" + Objeto.salvar() + "'";
                    } else if (dados.get(toArray[i]) instanceof LocalDate) {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        values += "'" + ((LocalDate) dados.get(toArray[i])).format(formatter) + "'";

                    } else if (dados.get(toArray[i]) instanceof String) {
                        values += "'" + (String) dados.get(toArray[i]) + "'";

                    } else {
                        values += "" + dados.get(toArray[i]) + "";
                    }

                    if (i + 1 != toArray.length) {
                        campos += ",";
                        values += ",";
                    }

                }
                System.out.println(toArray[i]);
            }
            String sql = "";
            System.out.println(((Integer) dados.getOrDefault(pkField, -1)));
            if (((Integer) dados.getOrDefault(pkField, -1)) > 0) {
                sql = "UPDATE " + nomeTabela + " SET ";
                boolean laddvirgula = false;
                for (Map.Entry<String, Object> entry : dados.entrySet()) {
                    if (laddvirgula) {
                        sql += " , ";
                    }
                    if (entry.getValue() instanceof GereniarBanco) {

                        sql += " " + InicioCampo + "" + entry.getKey() + " = " + ((GereniarBanco) entry.getValue()).salvar() + "";
                    } else if (entry.getValue() instanceof LocalDate) {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        sql += " " + InicioCampo + "" + entry.getKey() + " = " + "'" + ((LocalDate) entry.getValue()).format(formatter) + "'";

                    } else if (entry.getValue() instanceof String) {

                        sql += " " + InicioCampo + "" + entry.getKey() + " = '" + entry.getValue() + "'";

                    } else {
                        sql += " " + InicioCampo + "" + entry.getKey() + " = " + entry.getValue() + " ";
                    }
                    laddvirgula = true;
                }
                sql += " WHERE " + InicioCampo + "" + pkField + " =" + ((Integer) dados.getOrDefault(pkField, -1)) + " ;";
            } else {
                sql = "insert into " + nomeTabela + " "
                        + "(" + campos + ") "
                        + "values (" + values + ")";
            }
            System.out.println(sql);

            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.execute();
            final ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                lastId = rs.getInt(1);

                for (Field field : fields) {

                    if (field.getName() == pkField) {
                        field.set(this, lastId);
                    }
                }

            }

            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lastId;
    }

    @Override
    public void delete() {
        try {
            Integer lastId = 0;

            List<Field> fields = getAllModelFields(cls);

            try {
                for (Field field : fields) {

                    field.setAccessible(true);

                    Object value = field.get(this);
                    dados.put(field.getName(), value);
                    System.out.println(field.getName());

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            String sql = "delete from " + nomeTabela + " WHERE " + InicioCampo + "" + pkField + " =" + ((Integer) dados.getOrDefault(pkField, -1)) + " ;";
            System.out.println(sql);

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(GereniarBanco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Object carregadadosID(Integer ID) throws SQLException {
        Connection connection = new connection.ConnectionFactory().getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs;

        rs = stmt.executeQuery("select * from " + nomeTabela + " WHERE " + InicioCampo + "" + pkField + " =" + (ID) + " ;");
        while (rs.next()) {
            this.carregadados(rs);
        }

        return this;
    }

    @Override
    public Object carregadados(ResultSet rs) {
        List<Field> fields = getAllModelFields(cls);
        try {
            for (Field field : fields) {

                field.setAccessible(true);
                if (field.getType().equals(String.class)) {
                    field.set(this, (rs.getString(InicioCampo + field.getName())));

                } else if (field.getType().equals(LocalDate.class)) {

                    field.set(this, new java.sql.Date((rs.getDate(InicioCampo + field.getName())).getTime()).toLocalDate());
                } else if (field.getType().equals(Integer.class)) {
                    field.set(this, (rs.getObject(InicioCampo + field.getName())));
                } else {

                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this;
    }

    public static List<Field> getAllModelFields(Class aClass) {
        List<Field> fields = new ArrayList<>();
        do {
            if (aClass != GereniarBanco.class) {

                Collections.addAll(fields, aClass.getDeclaredFields());
            }
            aClass = aClass.getSuperclass();
        } while (aClass != null);
        return fields;
    }
}
