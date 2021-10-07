import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static void verificarEmail(String email) throws Exception{
        if (!email.contains("@")) {
           throw new Exception("O Email digitado não é válido. Tente novamente!");
        } else {
            System.out.println("___Cliente cadastrado com sucesso!___");
        }
    }

    public static Cliente cadastrarCliente(String nome, String email) {
        Cliente cliente = new Cliente(nome, email);
        listaClientes.add(cliente);
        return cliente;
    }
}