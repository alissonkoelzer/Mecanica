package POJO;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pessoa extends GereniarBanco {

    {
        nomeTabela = "tb_pessoa";
        InicioCampo = "pes_";
        pkField = "codigo";
        cls = Pessoa.class;
    }
    /*Atributos*/
    private Integer codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate data_nascimento;
    private Endereco codendereco;
    private String sexo;
    private String RG;
    private String email;

    /*Construtor*/
    public Pessoa() {
    }

    public void Pessoa(int codigo, String nome, String cpf, String telefone, LocalDate datadenascimento, Endereco endereco, String sexo, String RG, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nascimento = datadenascimento;
        this.codendereco = endereco;
        this.sexo = sexo;
        this.RG = RG;
        this.email = email;
    }

    /*Minhas Funções*/
    public boolean validarcpf() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean validarRG() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void notivicarAniver() {
    }

    /*Gets and Sets*/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDatadenascimento() {
        return data_nascimento;
    }

    public void setDatadenascimento(LocalDate datadenascimento) {
        this.data_nascimento = datadenascimento;
    }

    public Endereco getEndereco() {
        return codendereco;
    }

    public void setEndereco(Endereco endereco) {
        this.codendereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public Object getfiled(Field field) throws Exception {
        return field.get(this);
    }

    @Override
    public Object carregadados(ResultSet rs) {
        try {
            super.carregadados(rs); //To change body of generated methods, choose Tools | Templates.
            this.codendereco = new Endereco();
            this.codendereco.carregadadosID(rs.getInt("pes_codendereco"));

        } catch (SQLException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }

}
