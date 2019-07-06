package POJO;

import java.time.LocalDate;

public class Pessoa{

    /*Atributos*/
    private int codigo;
    private String nome;
    private int cpf;
    private int telefone;
    private LocalDate datadenascimento;
    private Endereco endereco;
    private String sexo;
    private int RG;

    
    /*Construtor*/    
    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, int cpf, int telefone, LocalDate datadenascimento, Endereco endereco, String sexo, int RG) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.datadenascimento = datadenascimento;
        this.endereco = endereco;
        this.sexo = sexo;
        this.RG = RG;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(LocalDate datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }
    
    
}
