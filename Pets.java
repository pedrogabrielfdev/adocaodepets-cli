public class Pets {
    private int idade, id;
    private double tamanho, peso;
    private String especie, raca, sexo, nome, dataNascimento, cor, comorbidade;
    private boolean adotado, vacinado;

    Pets(int idade, int id, String especie, String raca, String sexo, String nome, String dataNascimento, String cor, String comorbidade, double tamanho, double peso, boolean adotado, boolean vacinado) {
        this.idade = idade;
        this.id = id;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cor = cor;
        this.comorbidade = comorbidade;
        this.tamanho = tamanho;
        this.peso = peso;
        this.adotado = adotado;
        this.vacinado = vacinado;
    }

    public int getidade() {
        return this.idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public String getnome() {
        return this.nome;
    }

    public void setnome(String novoNome) {
        this.nome = novoNome;
    }

    public String getcomorbidade() {
        return this.comorbidade;
    }

    public void setcomorbidade(String novoEstado) {
        this.comorbidade = novoEstado;
    }

    public double gettamanho() {
        return this.tamanho;
    }

    public void settamanho(double novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public double getpeso() {
        return this.peso;
    }

    public void setpeso(double novoPeso) {
        this.peso = novoPeso;
    }

    public boolean getadotado() {
        return this.adotado;
    }

    public void setadotado(boolean adotado) {
        this.adotado = adotado;
    }

    public void cadastrarPets() {

    }

    // public void mudarNome(String novoNome) {
        
    // }

    public void exibirInformações() {

    }
}
