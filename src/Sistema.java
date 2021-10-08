import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner leitorDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("\n\t____Sistema de Cadastro de Faturas!____ \n\t___________Seja bem-vinde!___________");
        System.out.println("\t_______Escolha a opção desejada___________\n");
        System.out.println("Digite [1] para cadastrar um novo _cliente_\n");
        System.out.println("Digite [2] para cadastrar uma nova _fatura_\n");
        System.out.println("Digite [3] para _exibir as faturas_ do cliente\n");
        System.out.println("Digite [4] para encerrar o atendimento\n");

    }

    public static void tipoClientes() {
        List<TipoCliente> listaTiposClientes = ServiceCliente.escolherTipoCliente();
        System.out.println("_______Escolha a definição do seu cadastro_______");
        for (int i = 0; i < listaTiposClientes.size(); i++) {
            System.out.println(listaTiposClientes.get(i));

        }
        String tipoCliente = leitorDados("Digite:").nextLine();
    }

    public static Cliente cadastrarCliente() throws Exception {
        String nome = leitorDados("Digite o nome do cliente:").nextLine();
        String email = leitorDados("Digite o email do cliente:").nextLine();
        ServiceCliente.verificarEmailInvalido(email);
        return ServiceCliente.cadastrarCliente(nome, email /*tipo*/);
    }

    public static Fatura cadastrarFatura() throws Exception {
        String email = leitorDados("Digite o email do cliente:").nextLine();
        double valor = leitorDados("Digite o valor da fatura:").nextDouble();
        String dataVencimento = leitorDados("Digite a data de vencimento da fatura:").nextLine();
        ServiceCliente.verificarEmailInvalido(email);
        return ServiceFatura.cadastrarFatura(email, valor, dataVencimento);
    }

    public static List<Fatura> verificarFaturas() throws Exception {
        String email = leitorDados("Digite o email do cliente cadastrado:").nextLine();
        ServiceCliente.verificarEmailInvalido(email);
        ServiceCliente.verificarEmailExistente(email);
        return ServiceFatura.verificarFaturas(email);
    }

    public static boolean executar() throws Exception {
        boolean loop = true;
        while (loop) {
            menu();
            int entradaUsuario = leitorDados("Digite a opção desejada!").nextInt();
            switch (entradaUsuario) {
                case 1:
                    Cliente cliente = cadastrarCliente();
                    System.out.println(cliente);
                    break;
                case 2:
                    Fatura fatura = cadastrarFatura();
                    break;
                case 3:
                    List<Fatura> listaFaturas = verificarFaturas();
                    System.out.println(listaFaturas);
                    break;
                case 4:
                    loop = false;
                    System.out.println("\t\t\t\t_______Sistema encerrado!_______ \n\t_______Obrigado pela utilização dos nossos serviços_______");
                    break;
                default:
                    System.out.println("_______Opção digitada é invalida. Verifique e tente novamente!_______");
                    break;
            }

        }
        return loop;
    }
}
