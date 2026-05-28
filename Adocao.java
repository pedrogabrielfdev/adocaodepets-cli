import java.util.Scanner;
import java.util.ArrayList;

public class Adocao {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<Pets> pets = new ArrayList<>();


    public static void menuLogin() {

        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Login");

        int escolha = scanner.nextInt();
        scanner.nextLine();
        switch (escolha) {
            case 1 -> login();

        }
    }

    public static void login() {
        String usuarioCriado;
        String senhaInicial;

        boolean encontrado = false;

        do {

            System.out.println("Digite seu nome de usuário: ");
            usuarioCriado = scanner.nextLine();

            System.out.println("Digite a sua senha: ");
            senhaInicial = scanner.nextLine();

            for (Pessoa pessoa : pessoas) {

                if (usuarioCriado.equals(pessoa.getLogin()) &&
                senhaInicial.equals(pessoa.getSenha())) {

                encontrado = true;
                break;
                }
            }

            if (!encontrado) {
            System.out.println("Login ou senha incorretos!\n");
            }

        } while (!encontrado);

    System.out.println("Login realizado com sucesso!");
    }


    public static void cadastrosPets() {
        Pets pet = new Pets(0, 0, "", "", "", "", "", "", "", 0.0, 0.0, false, false);

        System.out.println("Digite o nome do pet: ");
        pet.setNome(scanner.nextLine());

        System.out.println("Digite a idade do pet:");
        pet.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o peso do pet:");
        pet.setPeso(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Digite o tamanho do pet:");
        pet.setTamanho(scanner.nextDouble());
        scanner.nextLine();

        pets.add(pet);
    }

    public static void cadastrosPessoas() {
        Pessoa pessoa= new Pessoa();

        System.out.println("Digite o nome de usuário que você deseja:");
        pessoa.setLogin(scanner.nextLine());
        
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
        scanner.nextLine();

        pessoa.setSenha(pessoa.getCpf());
        pessoas.add(pessoa);

    }

    public static void pesquisar() {

    }

    public static void menu() {
        int escolha;
        do{
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Cadastrar pets");
            System.out.println("2 - Pesquisar pets");
            System.out.println("0 - Encerrar programa");

            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1 -> cadastrosPets();

                case 2 -> pesquisar();
                
                case 0 -> System.out.println("Encerrando programa");

                default -> System.out.println("Opção inválida!");
            }
        }while (escolha !=0);   
    }

    public static void main(String[] args) {
        cadastrosPessoas();
        menuLogin();
        menu();
        scanner.close();

    }
}
