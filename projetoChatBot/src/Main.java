import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String attendant = "Andre";
        System.out.print("Informe o nome: ");
        String name = sc.nextLine();
        System.out.print("Informe o provedor: ");
        String provider = sc.nextLine();

        System.out.println("================================================");

        System.out.println("Ola, " + name + "\n" + "Seja bem vindo a central de atendimento "
                + provider + " Sou o atendente " + attendant + "\n" + "Como posso ajudar?");
        sc.close();

        System.out.println("================================================");

        System.out.println("Tecle 1 para impressão de saldo ou 2 para sair...");
        int menuSelected = sc.nextInt();

        System.out.println("Menu escolhido "+ menuSelected);

    }



}