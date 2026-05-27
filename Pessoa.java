public class Pessoa {
    private String nome, sexo, senha, endereco, telefone, cpf;
    private int idade, id;

    Pessoa(String nome, String sexo, String senha, String endereco, String telefone, String cpf, int idade, int id) {
        this.nome = nome;
        this.sexo = sexo;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setidade(int idade) {
        if (idade >= 18) {
            this.idade = idade;
            System.out.println("Idade Validada! Prossiga com o cadastro!");
        } else {
            System.out.println("Idade Inválida! Você não tem idade suficiente para adotar um pet.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
