import java.util.ArrayList;
import java.util.List;

public class ServiceFatura {
    private static List<Fatura> listaFaturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String dataVencimento) throws Exception {
        Cliente cliente = ServiceCliente.verificarClienteCadastrado(email);
        Fatura fatura = new Fatura(cliente,valor, dataVencimento);
        listaFaturas.add(fatura);
        return fatura;
    }
}
