package POJO;

public class Endereco {
/*atributo*/
    private int codigo;
    private String descricao;
    private String UF;
    private String bairro;
    private String cidade;
    private String numero;
    /*construtor*/

    public Endereco() {
    }

    public Endereco(int codigo, String descricao, String UF, String bairro, String cidade, String numero) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.UF = UF;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
