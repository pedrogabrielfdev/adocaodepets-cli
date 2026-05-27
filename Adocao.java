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

}
