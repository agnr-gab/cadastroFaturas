import java.util.Scanner;

public class Sistema {
    private static Scanner leitorDados (String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static Cliente cadastrarCliente() throws Exception{
       String nome = leitorDados("Digite o nome do cliente:").nextLine();
        String email = leitorDados("Digite o email do cliente:").nextLine();
        ServiceCliente.verificarEmail(email);
        return ServiceCliente.cadastrarCliente(nome, email);
    }
}
