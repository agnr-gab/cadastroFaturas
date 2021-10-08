import java.util.ArrayList;
import java.util.List;

public class ServiceFatura {
    private static List<Fatura> listaFaturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String dataVencimento) throws Exception {
        Cliente cliente = ServiceCliente.verificarEmailExistente(email);
        Fatura fatura = new Fatura(cliente,valor, dataVencimento);
        listaFaturas.add(fatura);
        return fatura;
    }
    public static List<Fatura> verificarFaturas(String email) {
        List<Fatura> listaFaturaClientes = new ArrayList<>();
        for (Fatura referenciaFatura: listaFaturas) {
            if (referenciaFatura.getCliente().getEmail().equals(email)){
                listaFaturaClientes.add(referenciaFatura);
            }
        } return listaFaturaClientes;
    }
}
