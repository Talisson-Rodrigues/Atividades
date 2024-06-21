class Professor extends Pessoa {
    private String disciplina;
    private float salario;

    /* Disciplina */
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    /* Salário */
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void cadastrarAluno() {
        System.out.println("Aluno cadastrado com sucesso!");
    }

     @Override
    public String exibeDados() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEmail: " + getEmail() + "\nSexo: " + getSexo() + "\nDisciplina: " + disciplina + "\nSalario: " + salario;
    }
}