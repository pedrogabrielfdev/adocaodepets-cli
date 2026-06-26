public class Adotante extends Pessoa {
    public Adotante(String nome, String sexo, String senha,
                    String endereco, String telefone,
                    String cpf, String login, int idade) {

        super(nome, sexo, senha, endereco, telefone, cpf, login, idade);
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Tipo de usuário: Adotante");
    }
}
