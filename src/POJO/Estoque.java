package POJO;

public class Estoque {
/*atributo*/
    private int codigo;
    private int NomedoLote;
    private String NomePeca;
    private int QuantidadePeca;
    private ModeloPeca modelo;
/*construtor*/
    public Estoque() {
    }

    public Estoque(int codigo, int NomedoLote, String NomePeca, int QuantidadePeca, ModeloPeca modelo) {
        this.codigo = codigo;
        this.NomedoLote = NomedoLote;
        this.NomePeca = NomePeca;
        this.QuantidadePeca = QuantidadePeca;
        this.modelo = modelo;
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNomedoLote() {
        return NomedoLote;
    }

    public void setNomedoLote(int NomedoLote) {
        this.NomedoLote = NomedoLote;
    }

    public String getNomePeca() {
        return NomePeca;
    }

    public void setNomePeca(String NomePeca) {
        this.NomePeca = NomePeca;
    }

    public int getQuantidadePeca() {
        return QuantidadePeca;
    }

    public void setQuantidadePeca(int QuantidadePeca) {
        this.QuantidadePeca = QuantidadePeca;
    }

    public ModeloPeca getModelo() {
        return modelo;
    }

    public void setModelo(ModeloPeca modelo) {
        this.modelo = modelo;
    }
    
}
