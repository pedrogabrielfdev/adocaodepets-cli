public class Pets {
    private static int idIncremento = 1;
    private int idade, id=0;
    private double tamanho, peso;
    private String especie, raca, sexo, nome, cor, comorbidade;
    private boolean vacinado;

    Pets(int idade, String especie, String raca, String sexo, String nome, String cor, String comorbidade, double tamanho, double peso, boolean vacinado) {
        this.idade = idade; // poderia ter uma excecao
        this.id = idIncremento;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.nome = nome; // poderia ter uma excecao
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
}
