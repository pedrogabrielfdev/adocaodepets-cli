import java.util.Scanner;

public class Adocao {

    public static void login() {

    }

    public static void cadastrosPets() {
        Scanner scanner = new Scanner(System.in);
        Pets pet = new Pets(0, 0, "", "", "", "", "", "", "", 0.0, 0.0, false, false);

        System.out.println("Digite o nome do pet: ");
        pet.setNome(scanner.nextLine());

        System.out.println("Digite a idade do pet:");
        pet.setIdade(scanner.nextInt());

        System.out.println("Digite o peso do pet:");
        pet.setPeso(scanner.nextDouble());

        System.out.println("Digite o tamanho do pet:");
        pet.setTamanho(scanner.nextDouble());

        scanner.close();
    }

    public static void cadastrosPessoas() {
        Scanner scanner= new Scanner(System.in);
        Pessoa pessoa= new Pessoa(null, null, null, null, null, null, 0, 0);
        
        System.out.println("Digite o seu nome:");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite o seu sexo:");
        pessoa.setSexo(scanner.nextLine());

        System.out.println("Digite o seu endereço:");
        pessoa.setEndereco(scanner.nextLine());

        System.out.println("Digite o seu número de telefone:");
        pessoa.setTelefone(scanner.nextLine());

        System.out.println("Digite o seu cpf:");
        pessoa.setCpf(scanner.nextLine());

        System.out.println("Digite a sua idade:");
        pessoa.setidade(scanner.nextInt());

        System.out.println("Digite sua senha:");
        pessoa.setSenha(scanner.nextLine());

        scanner.close();
    }

    public static void pesquisar() {

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Pesquisar");

        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1 -> cadastrosPets();

            case 2 -> pesquisar();
        }


        scanner.close();
    }

    public static void main(String[] args) {
        menu();

    }
}
