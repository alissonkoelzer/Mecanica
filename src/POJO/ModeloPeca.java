package POJO;

public class ModeloPeca {
/*atributo*/
    private int codigo;
    private String marcar;
    private String nome;
    private float porcentagem;
    private float valorentrada;
    /*construdor*/

    public ModeloPeca() {
    }

    public ModeloPeca(int codigo, String marcar, String nome, float porcentagem, float valorentrada) {
        this.codigo = codigo;
        this.marcar = marcar;
        this.nome = nome;
        this.porcentagem = porcentagem;
        this.valorentrada = valorentrada;
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    public float getValorentrada() {
        return valorentrada;
    }

    public void setValorentrada(float valorentrada) {
        this.valorentrada = valorentrada;
    }
    
}
