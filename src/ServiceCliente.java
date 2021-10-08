import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static void verificarEmailInvalido(String email) throws Exception {
        if (!email.contains("@")) {
            //não aceita email sem @
            throw new Exception("O Email digitado não é válido. Tente novamente!");
        }
        /* verificar retorno está voltando mesmo quando o email não é encontrado
        else {
            System.out.println("___Cliente cadastrado com sucesso!___");
        }*/
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

    public static Cliente cadastrarCliente(String nome, String email, String tipo) throws Exception{
        String tipoCliente = verificarTipo(tipoCliente);
        Cliente cliente = new Cliente(nome, email, tipoCliente);
        listaClientes.add(cliente);
        return cliente;
    }

    public static List<TipoCliente> escolherTipoCliente() {
        List<TipoCliente> listaTiposClientes = new ArrayList<>();
        for (TipoCliente referenciaTipoCliente : TipoCliente.values()) {
            listaTiposClientes.add(referenciaTipoCliente);
        }
        return listaTiposClientes;
    }

    public static TipoCliente verificarTipo(String tipoCliente) throws Exception {
        for (TipoCliente referenciaTipoCliente : TipoCliente.values()) {
            if (tipoCliente.equalsIgnoreCase(String.valueOf(referenciaTipoCliente))) {
                return referenciaTipoCliente;
            }
        }
        throw new Exception("Entrada inválida. Verifique e tente novamente!");
    }
}