import java.util.Scanner;
public class Pessoa {
    Scanner ler = new Scanner(System.in);
    private String nome, sexo, senha, endereco, telefone, cpf, login;
    private int idade, id=0;
    private static int idIncremento = 1;

    public Pessoa(){

    }

    public Pessoa(String nome, String sexo, String senha, String endereco, String telefone, String cpf, String login, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade = idade;
        this.id += idIncremento;
        this.login = login;

        idIncremento++;
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
    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
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
    public void alterar_nome(){
        System.out.println("Digite o novo nome:");
        String novoNome = ler.nextLine();
       
        setNome(novoNome);
    }
    public void alterar_senha(){
        System.out.println("Digite a nova senha:");
        String novaSenha = ler.nextLine();
       
        setSenha(novaSenha);
    }
    public void alterar_endereco(){
        System.out.println("Digite o novo endereço:");
        String novoEndereco = ler.nextLine();
        ler.nextLine();
        
        setEndereco(novoEndereco);
    }
    public void alterar_telefone(){
        System.out.println("Digite o novo telefone:");
        String novoTelefone = ler.nextLine();
       
        setTelefone(novoTelefone);
    }
    public void alterar_idade(){
        System.out.println("Digite a nova idade:");
        int novaIdade = ler.nextInt();
        
        setidade(novaIdade);
    }
    public void alterar_cpf(){
        System.out.println("Digite o novo CPF:");
        String novoCpf = ler.nextLine();
        

        setCpf(novoCpf);
    }

    public void exibirInformacoes() {

        System.out.println("\n========================");
        System.out.println("Informações do Usuario");
        System.out.println("========================");
        System.out.println("Nome:"+ this.nome);
        System.out.println("Id:"+ this.id);
        System.out.println("Idade:"+ this.idade);
        System.out.println("endereço:"+ this.endereco);
        System.out.println("telefone:"+ this.telefone);
        System.out.println("Sexo:"+ this.sexo);

    }

}
