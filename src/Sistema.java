import java.util.Scanner;

public class Sistema {
    private static Scanner leitorDados (String mensagem) {
        System.out.println(mensagem);
        return leitorDados();
    }
}
