public class Main {

    public static void main(String[] args) throws Exception {

        boolean loop = true;

        while (loop) {

            try {
                loop = Sistema.executar();

            } catch (Exception erro) {
                System.out.println(erro.getMessage());

            }
        }
    }
}