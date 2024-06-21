import java.util.Date;

class Programa {
    // obrigatoriedade de ter o método main
    public static void main(String[] args) {
        // criando um objeto da classe Pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("Pedro");
        p1.setCpf(123456789);
        p1.setSaldoBancario(1000);
        p1.setDataNascimento( new Date("01/01/1990"));
        p1.setEndereco("Rua 1, nº 1");

        System.out.println("------------------------");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Saldo Bancario: " + p1.getSaldoBancario());
        System.out.println("Data de Nascimento: " + p1.getDataNascimento());
        System.out.println("Endereco: " + p1.getEndereco());
        System.out.println("------------------------");
        // chamando os metodos do objeto p1
        p1.andar();
        p1.falar();
        p1.dormir();
        p1.comer();
    }


}