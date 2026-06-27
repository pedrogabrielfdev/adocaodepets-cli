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

    public boolean setidade(int idade) {
     if (idade < 18) {
         System.out.println("Idade inválida! Você não tem idade suficiente para adotar um pet.");
            return false;
     }

        this.idade = idade;
     return true;
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

    public void alterar_sexo(){
        System.out.println("Digite o novo sexo:");
        String novoSexo = ler.nextLine();
       
        setSexo(novoSexo);
    }

    public void alterar_senha(){
        System.out.println("Digite a nova senha:");
        String novaSenha = ler.nextLine();
       
        setSenha(novaSenha);
    }
    public void alterar_endereco(){
        System.out.println("Digite o novo endereço:");
        String novoEndereco = ler.nextLine();
        
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

    public void alterar_login(){
        System.out.println("Digite o novo login:");
        String novoLogin = ler.nextLine();
       
        setLogin(novoLogin);
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

    public void editarDados() {

        int escolha; 

        System.out.println("Escolha a opção que deseja editar: ");
        System.out.println("1 - Nome");
        System.out.println("2 - Sexo");
        System.out.println("3 - Idade");
        System.out.println("4 - Endereço");
        System.out.println("5 - Telefone");
        System.out.println("6 - Cpf");
        System.out.println("7 - Nome de Usuário");
        System.out.println("8 - Senha");

        escolha = ler.nextInt();
        ler.nextLine();

        switch(escolha) {
            case 1 -> alterar_nome();
            
            case 2 -> alterar_sexo();
            
            case 3 -> alterar_idade();
            
            case 4 -> alterar_endereco();
            
            case 5 -> alterar_telefone();
            
            case 6 -> alterar_cpf();
            
            case 7 -> alterar_login();
            
            case 8 -> alterar_senha();
            
            default -> System.out.println("Opção Inválida!");
        }
    }

}
