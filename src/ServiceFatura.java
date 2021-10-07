import java.util.ArrayList;
import java.util.List;

public class ServiceFatura {
    private static List<Fatura> listaFaturas = new ArrayList<>();

    public static Fatura cadastrarFatura(Cliente cliente, double valor, String dataVencimento) {
        Fatura fatura = new Fatura(cliente, valor, dataVencimento);
        listaFaturas.add(fatura);
        return fatura;
    }
}
