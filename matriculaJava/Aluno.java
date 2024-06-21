class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void atualizarCurso(String novoCurso) {
        this.curso = novoCurso;
    }

    public void apagarMatricula() {
        this.matricula = 0;
    }

    @Override
    public String exibeDados() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEmail: " + getEmail() + 
               "\nSexo: " + getSexo() + "\nMatricula: " + matricula + "\nCurso: " + curso;
    }

    public String exibeDadosSimplificados() {
        return "Nome: " + getNome() + "\nMatricula: " + matricula;
    }
    
    public void exibeDados(String msg) {
        System.out.println(msg);
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEmail: " + getEmail() + 
                           "\nSexo: " + getSexo() + "\nMatricula: " + matricula + "\nCurso: " + curso);
        System.out.println("");
    }
}
