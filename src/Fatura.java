public class Fatura {
    private Cliente cliente;
    private double valor;
    private String dataVencimento;

    public Fatura() {
    }

    public Fatura(Cliente cliente, double valor, String dataVencimento) {
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
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Cliente\n" + cliente);
        retorno.append("\tValor: R$" + valor);
        retorno.append("\tData de Vencimento: " + dataVencimento);
        return retorno.toString();
    }
}