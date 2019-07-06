package POJO;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
/*atributo */
    private int CTPS;
    private float Salario;
    private String Senha;
    private float custoporhora;
    private float porcetagemComicao;
    private float comissao;
    /*construdo*/

    public Funcionario() {
    }

    public Funcionario(int CTPS, float Salario, String Senha, float custoporhora, float porcetagemComicao) {
        this.CTPS = CTPS;
        this.Salario = Salario;
        this.Senha = Senha;
        this.custoporhora = custoporhora;
        this.porcetagemComicao = porcetagemComicao;
    }

    public Funcionario(int CTPS, float Salario, String Senha, float custoporhora, float porcetagemComicao, int codigo, String nome, int cpf, int telefone, LocalDate datadenascimento, Endereco endereco, String sexo, int RG) {
        super(codigo, nome, cpf, telefone, datadenascimento, endereco, sexo, RG);
        this.CTPS = CTPS;
        this.Salario = Salario;
        this.Senha = Senha;
        this.custoporhora = custoporhora;
        this.porcetagemComicao = porcetagemComicao;
        
    }
    /*funçao*/

    public void CadastrasFuncionario() {
    }

    public boolean validarCTPS() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public float calcularComicao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     /*Gets and Sets*/

    public int getCTPS() {
        return CTPS;
    }

    public void setCTPS(int CTPS) {
        this.CTPS = CTPS;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public float getCustoporhora() {
        return custoporhora;
    }

    public void setCustoporhora(float custoporhora) {
        this.custoporhora = custoporhora;
    }

    public float getPorcetagemComicao() {
        return porcetagemComicao;
    }

    public void setPorcetagemComicao(float porcetagemComicao) {
        this.porcetagemComicao = porcetagemComicao;
    }
    
}
