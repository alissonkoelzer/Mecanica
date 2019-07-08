/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aliso
 */
public interface Banco {

    public Integer salvar();

    public void delete();

    public Object carregadados(ResultSet rs);

       public Object carregadadosID(Integer ID) throws SQLException;
}
