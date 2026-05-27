import java.util.Scanner;

public class Adocao {

    public static void login() {

    }

    public static void cadastrosPest() {
        Scanner scanner = new Scanner(System.in);
        Pets pet = new Pets(0, 0, "", "", "", "", "", "", "", 0.0, 0.0, false, false);

        pet.setnome(scanner.nextLine());
        pet.setidade(scanner.nextInt());
        pet.setpeso(scanner.nextDouble());
        pet.settamanho(scanner.nextDouble());
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
            case 1 -> cadastrosPest();

            case 2 -> pesquisar();
        }
    }

    public static void main(String[] args) {
        menu();

    }
}
