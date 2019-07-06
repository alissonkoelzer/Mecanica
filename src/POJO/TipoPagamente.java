package POJO;

public enum TipoPagamente {

    CARTAO_CREDITO("Cartão de Credito"), 
    CARTAO_DEBITO("Cartão de debito"), 
    DINHEIRO("Dinheiro"), 
    BOLETO("Boleto"), 
    CHEQUE("Cheque");
    
    private String tipoPagamento;

    private TipoPagamente(String pagamento) {
        this.tipoPagamento = pagamento; 
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

  
    
    
    
}