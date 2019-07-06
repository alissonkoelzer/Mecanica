package POJO;

public class Veiculo {
/*atributo*/
    private int Codigo;
    private String Placa;
    private String Ano;
    private String Cor;
    /*construdor*/

    public Veiculo() {
    }

    public Veiculo(int Codigo, String Placa, String Ano, String Cor) {
        this.Codigo = Codigo;
        this.Placa = Placa;
        this.Ano = Ano;
        this.Cor = Cor;
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
}
