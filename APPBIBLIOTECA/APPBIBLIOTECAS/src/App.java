import br.com.senac.sistema.GerenciadorSistema;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //inicializa os controllers da aplicacao
        GerenciadorSistema gerenciadorSistema = new GerenciadorSistema();
        gerenciadorSistema.inicializaControllers();

        //inicializa o menu
        gerenciadorSistema.inicializaMenu();

        //inicializa o scanner
        Scanner scanner = new Scanner(System.in);
        

        //loop do sistema
        while (true) {
            gerenciadorSistema.getMenuSistema().gerarMenuOpcoes();
            int opcao = scanner.nextInt();
        
            switch (opcao) {
                case 100:
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    gerenciadorSistema.getAutorController().cadastrarAutor();
                    break;
                case 2:
                    gerenciadorSistema.getAutorController().salvarAutor();
                    break;
                case 3:
                    gerenciadorSistema.getLivroController().cadastrarLivro();
                    break;
                case 4:
                    gerenciadorSistema.getLivroController().salvarLivro();
                    break;
                default:
                    break;
            }   /* FIM SWITCH */
        }   /* FIM WHILE */
    }   /* FIM MAIN */
}   /* FIM CLASSE */
