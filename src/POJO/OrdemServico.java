package POJO;

import java.time.Duration;
import java.time.LocalDate;

public class OrdemServico {
/*atributo*/
    private int Codigo;
    private LocalDate DataEntrada;
    private LocalDate DataSaida;
    private Cliente cliente;
    private Funcionario funcionario;
    private Veiculo veiculo;
    private String fomaPagamento;
    private Duration tempoPrevisto;
    private Estoque pecasUsadas;
    /*construdor*/

    public OrdemServico() {
    }

    public OrdemServico(int Codigo, LocalDate DataEntrada, LocalDate DataSaida, Cliente cliente, Funcionario funcionario, Veiculo veiculo, String fomaPagamento, Duration tempoPrevisto, Estoque pecasUsadas) {
        this.Codigo = Codigo;
        this.DataEntrada = DataEntrada;
        this.DataSaida = DataSaida;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.fomaPagamento = fomaPagamento;
        this.tempoPrevisto = tempoPrevisto;
        this.pecasUsadas = pecasUsadas;
    }
    /*funçao*/
    public void Imprimir() {
    }

    public float calculcarValorPrevisto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public float calculcarValorFinal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Duration calcularTempoGasto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void untitledMethod() {
    }

    public float calcucarValorPecas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void gerarNotaFinal() {
    }
     /*Gets and Sets*/

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public LocalDate getDataEntrada() {
        return DataEntrada;
    }

    public void setDataEntrada(LocalDate DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

    public LocalDate getDataSaida() {
        return DataSaida;
    }

    public void setDataSaida(LocalDate DataSaida) {
        this.DataSaida = DataSaida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getFomaPagamento() {
        return fomaPagamento;
    }

    public void setFomaPagamento(String fomaPagamento) {
        this.fomaPagamento = fomaPagamento;
    }

    public Duration getTempoPrevisto() {
        return tempoPrevisto;
    }

    public void setTempoPrevisto(Duration tempoPrevisto) {
        this.tempoPrevisto = tempoPrevisto;
    }

    public Estoque getPecasUsadas() {
        return pecasUsadas;
    }

    public void setPecasUsadas(Estoque pecasUsadas) {
        this.pecasUsadas = pecasUsadas;
    }
    
}
