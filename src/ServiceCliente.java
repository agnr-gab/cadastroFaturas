import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static void verificarEmailInvalido(String email) throws Exception {
        if (!email.contains("@")) {
            //não aceita email sem @
            throw new Exception("O Email digitado não é válido. Tente novamente!");
        } else {
            System.out.println("___Cliente cadastrado com sucesso!___");
        }
    }

    public static Cliente verificarEmailExistente(String email) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            //Percorre a lista de clientes e verifica se tem email no banco de dados
            if (referenciaCliente.getEmail().equals(email)) {
                return referenciaCliente;
            }
        }
        throw new Exception("Cliente não cadastrado no banco de dados! Verifique novamente!");
    }

    public static Cliente cadastrarCliente(String nome, String email) {
        Cliente cliente = new Cliente(nome, email);
        listaClientes.add(cliente);
        return cliente;
    }
}