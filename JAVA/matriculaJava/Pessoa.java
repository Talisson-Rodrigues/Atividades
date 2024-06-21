class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String sexo;


    /*Nome*/
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    /*Idade*/
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    /*Email*/
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /*Sexo*/
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    /*Exibe todos os dados acima*/
    public String exibeDados() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nEmail: " + email + "\nSexo: " + sexo;
    }
}