import java.util.Scanner;

public class Pets {
    Scanner ler = new Scanner(System.in);
    private static int idIncremento = 1;
    private int idade, id=0;
    private double tamanho, peso;
    private String especie, raca, sexo, nome, cor, comorbidade;
    private boolean vacinado;

    public Pets(){

    }

    public Pets(int idade, String especie, String raca, String sexo, String nome, String cor, String comorbidade, double tamanho, double peso, boolean vacinado) {
        this.idade = idade;
        this.id = idIncremento;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.nome = nome;
        this.cor = cor;
        this.comorbidade = comorbidade;
        this.tamanho = tamanho;
        this.peso = peso;
        this.vacinado = vacinado;

        idIncremento++;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
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

    public void alterar_raca(){
        System.out.println("Digite a nova raça:");
        String novaRaca = ler.nextLine();
       
        setRaca(novaRaca);
    }

    public void alterar_especie(){
        System.out.println("Digite a nova especie:");
        String novaEspecie = ler.nextLine();
        
        setEspecie(novaEspecie);
    }

    public void alterar_comorbidade(){
        System.out.println("Digite a nova comorbidade:");
        String novaComorbidade = ler.nextLine();
       
        setComorbidade(novaComorbidade);
    }

    public void alterar_idade(){
        System.out.println("Digite a nova idade:");
        int novaIdade = ler.nextInt();
        setIdade(novaIdade);
    }

    public void alterar_cor(){
        System.out.println("Digite a nova cor:");
        String novaCor = ler.nextLine();

        setCor(novaCor);
    }

    public void alterar_tamanho(){
        System.out.println("Digite o novo tamanho:");
        double novoTamanho = ler.nextDouble();
       
        setTamanho(novoTamanho);
    }

        public void alterar_peso(){
        System.out.println("Digite o novo peso:");
        double novoPeso = ler.nextDouble();
       
        setPeso(novoPeso);
    }

        public void alterar_vacinado(){
        System.out.println("Digite se o pet foi vacinado ou não s(sim) ou n(não):");
        boolean novoVacinado = ler.nextBoolean();
       
        setVacinado(novoVacinado);
    }

    public void exibirInformacoes() {

        System.out.println("\n====================");
        System.out.println("Informações do pet");
        System.out.println("====================");
        System.out.println("Nome:"+ this.nome);
        System.out.println("Id:"+ this.id);
        System.out.println("Idade:"+ this.idade);
        System.out.println("Espécie:"+ this.especie);
        System.out.println("Raça:"+ this.raca);
        System.out.println("Sexo:"+ this.sexo);
        System.out.println("Cor:"+ this.cor);
        System.out.println("Comorbidade:"+ this.comorbidade);
        System.out.println("Tamanho:"+ this.tamanho);
        System.out.println("Peso:"+ this.peso);
        System.out.println("Vacinado:"+ this.vacinado);

    }

    public void editarDadospet() {

        int escolha; 

        System.out.println("\nescolha a opção que deseja editar\n");
        System.out.println("1 - Nome");
        System.out.println("2 - Sexo");
        System.out.println("3 - Idade");
        System.out.println("4 - Especie");
        System.out.println("5 - Comorbidade");
        System.out.println("6 - Cor");
        System.out.println("7 - Raça");
        System.out.println("8 - Peso");
        System.out.println("9 - Tamanho");
        System.out.println("10 - Vacinado");

        escolha = ler.nextInt();
        ler.nextLine();

        switch(escolha) {
            case 1 -> alterar_nome();
            
            case 2 -> alterar_sexo();
            
            case 3 -> alterar_idade();
            
            case 4 -> alterar_especie();
            
            case 5 -> alterar_comorbidade();
            
            case 6 -> alterar_cor();
            
            case 7 -> alterar_raca();
            
            case 8 -> alterar_peso();

            case 9 -> alterar_tamanho();
            
            case 10 -> alterar_vacinado();

            default -> System.out.println("Opção Inválida!");
        }
    }
}    
