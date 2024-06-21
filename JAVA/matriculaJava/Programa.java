

public class Programa {
    public static void main(String[] args) {
        System.out.println("Programa de matricula em Java");
        System.out.println("\n");

       //Instancia um objeto da classe Professor
       Professor prof = new Professor();
       prof.setNome("Pedro");
       prof.setIdade(30);
       prof.setEmail("pedro@gmail.com");
       prof.setSexo("M");
       prof.setDisciplina("Geografia");
       prof.setSalario(5000);

       System.out.println("**Professor**");
       String dados = prof.exibeDados();
       System.out.println(dados);
       System.out.println("");

       Aluno aluno = new Aluno();
       aluno.setNome("Carlos");
       aluno.setIdade(15);
       aluno.setEmail("carlos@gamil.com");
       aluno.setSexo("M");
       aluno.setMatricula(123456);
       aluno.atualizarCurso("Geografia");

        /*
       System.out.println("**Aluno**");
       String alunoDados = aluno.exibeDados();
       System.out.println(alunoDados);
       System.out.println("");
       */

      aluno.exibeDados("**Aluno**");

      Curso curso = new Curso();
      curso.setNome("Matemática");
      curso.setAluno(aluno);
      curso.setProfessor(prof);

      System.out.println(curso.exibeDadosCurso());
    }
      /*
      try{
        salvarArquivo(aluno);
      } catch (IOException e) {
        e.printStackTrace();
      }
    

    public static void salvarArquivo(Pessoa armazena) throws IOException {
        String str = armazena.exibeDados();
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write(str);
        writer.close();
    }
    */
}
