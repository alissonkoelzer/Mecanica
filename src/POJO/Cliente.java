package POJO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends Pessoa {



    public void addServiso() {

    }

public String convDataBanco(String dataSistema) {
    java.util.Date dataFormatada;
    String dataBanco = "";//variavel que vai receber a data para o banco
    try {//Conversão da data do sistema para formato da data do Banco
        dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(dataSistema);
        dataBanco = new SimpleDateFormat("yyyy-MM-dd").format(dataFormatada);
    } catch (ParseException ex) {
        Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    return dataBanco;
}


  
}
