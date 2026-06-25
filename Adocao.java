import java.util.Scanner;
import java.util.ArrayList;

public class Adocao {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<Pets> pets = new ArrayList<>();

    public static void menuLogin() {

        int escolha;
        do {
        System.out.println("\n===========MENU_LOGIN============");
        System.out.println("1 - Login");
        System.out.println("2 - cadastro");
        System.out.println("0 - Encerrar programa");
        System.out.println("=================================\n");
        System.out.println("Escolha uma opção:");
        escolha = scanner.nextInt();
        scanner.nextLine();
            switch (escolha) {
                case 1 -> {
                    ResultadoLogin login = login();
                    if (login.isLoginT()) {
                        menu(login.getPessoa());
                    }
                } 
                case 2 -> cadastrosPessoas();
                case 0 -> System.out.println("Encerrando programa");
                default -> System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }

    public static ResultadoLogin login() {
        String usuarioCriado;
        String senhaInicial;

        boolean encontrado = false;
        ResultadoLogin resultado = new ResultadoLogin(encontrado, null);

        do {

            System.out.println("Digite seu nome de usuário: ");
            usuarioCriado = scanner.nextLine();

            System.out.println("Digite a sua senha: ");
            senhaInicial = scanner.nextLine();

            for (Pessoa pessoa : pessoas) {

                if (usuarioCriado.equals(pessoa.getLogin()) &&
                senhaInicial.equals(pessoa.getSenha())) {

                    encontrado = true;
                    resultado.setLoginT(encontrado);
                    resultado.setPessoa(pessoa);

                    System.out.println("Login realizado com sucesso!");

                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Você ainda não possui um cadastro! Faça um antes de realizar um login");
                System.out.println("Login ou senha incorretos!\n");
                System.out.println("Tentar novamente? s(sim) n(não)");
                String escolha = scanner.nextLine();
                if (escolha.equalsIgnoreCase("n")) {
                                     
                    break;
                }
                
            }

        } while (!encontrado);
        

        return resultado;

    }

    public static void cadastrosPets() {
        Pets pet = new Pets(0, null, null, null, null, null, null, 0, 0, false);

        System.out.println("Digite o nome do pet:");
        pet.setNome(scanner.nextLine());

        System.out.println("Digite a espécie do pet:");
        pet.setEspecie(scanner.nextLine());
        
        System.out.println("Digite a raça do pet:");
        pet.setRaca(scanner.nextLine());

        System.out.println("Digite a idade do pet:");
        pet.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o peso do pet:");
        pet.setPeso(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Digite o tamanho do pet:");
        pet.setTamanho(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Digite a sexo do pet (M(Macho) ou F(Fêmea) ou desconhecido):");
        pet.setSexo(scanner.nextLine());

        System.out.println("Digite a cor do pet:");
        pet.setCor(scanner.nextLine());
        
        System.out.println("O pet possui alguma comorbidade?");
        pet.setComorbidade(scanner.nextLine());
        
        System.out.println("O pet já é vacinado? s(sim) ou n(não)");
        String vacinado = scanner.nextLine();

        if (vacinado.equalsIgnoreCase("s")) {
            pet.setVacinado(true);
        } else {
            pet.setVacinado(false);
        }

        pets.add(pet);
    }

    public static void cadastrosPessoas() {
        Pessoa pessoa= new Pessoa(null, null, null, null, null, null, null, 0);

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
        int idade = scanner.nextInt();
        scanner.nextLine();
        if (!pessoa.setidade(idade)) {
        return; 
        }

        System.out.println("Crie a sua senha:");
        pessoa.setSenha(scanner.nextLine());

        System.out.println("Cadastro realizado com Sucesso!");

        pessoas.add(pessoa);

    }

    public static void adotarPets(){
        System.out.print("Digite o ID do pet que quer adotar:");
        int id = scanner.nextInt();
        scanner.nextLine();



        for (Pets pet : pets) {
            if (pet.getId() == (id)) {
                pets.remove(pet);
                System.out.println("Parabéns! Você adotou o pet " + pet.getNome() + "." + "Seja muito feliz com seu novo amigo!");
            } else {
                System.out.println("Pet não encontrado. Verifique o ID e tente novamente.");
            }
        }
    }

    public static void pesquisar() {
        System.out.println("Digite a espécie que deseja pesquisar:");
        String especie = scanner.nextLine();

        boolean encontrado = false;

        for (Pets pet : pets) {
            if (pet.getEspecie().equalsIgnoreCase(especie)) {
                pet.exibirInformacoes();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum pet dessa espécie foi encontrado.");
        }
    }

    public static void excluirPet() {
        System.out.print("Digite o ID do pet que quer excluir:");
        int id = scanner.nextInt();
        scanner.nextLine();


        for (Pets pet : pets) {
            if (pet.getId() == (id)) {
                pets.remove(pet);
                System.out.println(pet.getNome() + ", foi excluido!");
                break;
            } else {
                System.out.println("Pet não encontrado. Verifique o ID e tente novamente.");
            }
        }
    }

    public static void menu(Pessoa pessoa) {
        int escolha;
        do{
            System.out.println("\n===========PETS============");  // Menu pets
            System.out.println("1 - Cadastrar pets");
            System.out.println("2 - Pesquisar pets");
            System.out.println("3 - Adotar um pet");
            System.out.println("4 - Excluir pet");
            System.out.println("===========================");
            System.out.println("\n==========USUÁRIO==========");
            System.out.println("5 - Informações do Usuario");
            System.out.println("6 - Editar Dados do Usuário");
            System.out.println("0 - Sair");
            System.out.println("===========================\n");
            System.out.println("Escolha uma opcao:");
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1 -> cadastrosPets();

                case 2 -> pesquisar();

                case 3 -> adotarPets();

                case 4 -> excluirPet();

                case 5 -> pessoa.exibirInformacoes();

                case 6 -> pessoa.editarDados();

                default -> System.out.println("Opção inválida!");
            }
        }while (escolha !=0);   
    }
    public static void main(String[] args) {
        menuLogin();
        scanner.close();

    }
}
