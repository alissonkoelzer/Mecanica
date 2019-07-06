package POJO;

public class ModeloVeiculo {
/*atributo*/
    private int Codigo;
    private String Desricao;
    /*construdor*/

    public ModeloVeiculo() {
    }

    public ModeloVeiculo(int Codigo, String Desricao) {
        this.Codigo = Codigo;
        this.Desricao = Desricao;
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDesricao() {
        return Desricao;
    }

    public void setDesricao(String Desricao) {
        this.Desricao = Desricao;
    }
    
}
