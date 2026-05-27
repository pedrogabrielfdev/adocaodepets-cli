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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public void cadastrarPets() {

    }

    // public void mudarNome(String novoNome) {
        
    // }

    public void exibirInformações() {

    }
}
