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

    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getendereco() {
        return this.endereco;
    }

    public void setendereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public String gettelefone() {
        return this.telefone;
    }

    public void settelefone(String novoTelefone) {
        this.endereco = novoTelefone;
    }
    
    public int getidade() {
        return this.idade;
    }

    public void setidade(int idade) {
        if (idade >= 18) {
            this.idade = idade;
            System.out.println("Idade Validada! Prossiga com o cadastro!");
        } else {
            System.out.println("Idade Inválida! Você não tem idade suficiente para adotar um pet.");
        }
    }

    public void editar(String novoEndereco, String novoTelefone, String novaSenha) {

    }

    public void cadastrarUsuario() {

    }

    public void exibirDados() {

    }
}
