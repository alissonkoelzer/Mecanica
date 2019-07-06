package POJO;

public class Fornecedor {
/*atributo*/
    private int Codigo;
    private int CNPJ;
    private int Telefone;
    private String NomeRazaoSocial;
    private String NomeFantasia;
    private String DataCadastro;
    private String Email;
    private int Contato;
    private Endereco endereco;
    /*construtor*/

    public Fornecedor() {
    }

    public Fornecedor(int Codigo, int CNPJ, int Telefone, String NomeRazaoSocial, String NomeFantasia, String DataCadastro, String Email, int Contato, Endereco endereco) {
        this.Codigo = Codigo;
        this.CNPJ = CNPJ;
        this.Telefone = Telefone;
        this.NomeRazaoSocial = NomeRazaoSocial;
        this.NomeFantasia = NomeFantasia;
        this.DataCadastro = DataCadastro;
        this.Email = Email;
        this.Contato = Contato;
        this.endereco = endereco;
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getNomeRazaoSocial() {
        return NomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String NomeRazaoSocial) {
        this.NomeRazaoSocial = NomeRazaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(String DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getContato() {
        return Contato;
    }

    public void setContato(int Contato) {
        this.Contato = Contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
   
}
