public class Fatura {
    private double valor;
    private String dataVencimento;
    Cliente cliente;

    public Fatura() {
    }

    public Fatura(double valor, String dataVencimento, Cliente cliente) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    @Override
    public String toString () {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Valor: R$" +valor);
        retorno.append("Data de Vencimento: " +dataVencimento);
        return retorno.toString();
    }
}
