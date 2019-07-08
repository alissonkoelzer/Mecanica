/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

//   Atributos
    final private String SERVIDOR = "localhost";
    final private String PORT = "3306";
    final private String DRIVER = "com.mysql.jdbc.Driver";
    final private String DATABASE = "oficina_mecanica";
    final private String USER = "root";
    final private String PASS = "";
    final private String URL = "jdbc:mysql://" + SERVIDOR + ":" + PORT + "/" + DATABASE;
    private static  Connection conexao;

    public Connection getConnection() {

        try {
            if (conexao == null) {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL, USER, PASS);

            }
            return conexao;
        } catch (ClassNotFoundException | SQLException erro) {
            throw new RuntimeException("ERROR! Conexão não efetuada: ", erro);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stsm) {

        closeConnection(con);

        try {
            if (stsm != null) {
                stsm.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stsm, ResultSet rs) {

        closeConnection(con, stsm);

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
