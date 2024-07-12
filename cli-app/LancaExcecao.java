
public class LancaExcecao {

    public static void main(String[] args) {
        try {
            checarIdade(15);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void checarIdade(int idade) throws Exception {
        if (idade < 18) {
            throw new Exception("Idade mínima é 18 anos");
        } else {
            System.out.println("Idade válida");
        }
    }
}