class Curso extends Programa {
    private String nome;
    private Aluno aluno;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String exibeDadosCurso() {
        return "Curso: " + nome +
               "\nAluno: " + aluno.exibeDadosSimplificados() +
               "\n\n" +
               "\nProfessor: " + professor.exibeDados();
    }
}