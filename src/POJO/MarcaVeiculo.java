package POJO;

public class MarcaVeiculo {
/*atributo*/
    private int Codigo;
    private String Descrao;
/*construtor*/

    public MarcaVeiculo() {
    }

    public MarcaVeiculo(int Codigo, String Descrao) {
        this.Codigo = Codigo;
        this.Descrao = Descrao;
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescrao() {
        return Descrao;
    }

    public void setDescrao(String Descrao) {
        this.Descrao = Descrao;
    }
    
}
