import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private Cliente cliente;
    private double valor;
    private String dataVencimento;

    private static List<Fatura> listaFaturas = new ArrayList<>();

    public static List<Fatura> getListaFaturas() {
        return listaFaturas;
    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Cliente\n" + cliente);
        retorno.append("\tValor: R$" + valor);
        retorno.append("\tData de Vencimento: " + dataVencimento);
        retorno.append("\tQuantidade de faturas: " + );
        return retorno.toString();
    }
}