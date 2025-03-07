import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= Caixa Eletronico =======");

        System.out.print("Informe o valor que você deseja sacar: ");
        double saque = sc.nextDouble();
        double valorInicial = saque;
        double quantidadeNotas200 = (int) saque / 200;
        saque = (saque % 200);

        double quantidadeNotas100 = (int) saque / 100;
        saque = (saque % 100);

        double quantidadeNotas50 = (int) saque / 50;
        saque = (saque % 50);

        double quantidadeNotas20 = (int) saque / 20;
        saque = (saque % 20);

        double quantidadeNotas10 = (int) saque / 10;
        saque = (saque % 10);

        double quantidadeNotas5 = (int) saque / 5;
        saque = (saque % 5);

        double quantidadeNotas2 = (int) saque / 2;
        saque = (saque % 2);

        double quantidadeNotas1 = (int) saque / 1;
        saque = (saque % 1);

        saque = saque * 100;

        double quantidadeMoedas50 = (int) saque / 50;
        saque = (saque % 50);

        double quantidadeMoedas25 = (int) saque / 25;
        saque = (saque % 25);

        double quantidadeMoedas10 = (int) saque / 10;
        saque = (saque % 10);

        double quantidadeMoedas05 = (int) saque / 5;
        saque = (saque % 5);

        double quantidadeMoedas1 = (int) saque / 1;
        saque = (saque % 1);

        System.out.println("Notas de 200: " +quantidadeNotas200);
        System.out.println("Notas de 100: " +quantidadeNotas100);
        System.out.println("Notas de 50: " +quantidadeNotas50);
        System.out.println("Notas de 20: " +quantidadeNotas20);
        System.out.println("Notas de 10: " +quantidadeNotas10);
        System.out.println("Notas de 5: " +quantidadeNotas5);
        System.out.println("Notas de 2:" +quantidadeNotas2);
        System.out.println("Notas de 1: " +quantidadeNotas1);
        System.out.println("Moedas de 50 cents: " +quantidadeMoedas50);
        System.out.println("Moedas de 25 cents: " +quantidadeMoedas25);
        System.out.println("Moedas de 10 cents: " +quantidadeMoedas10);
        System.out.println("Moedas de 5 cents: " +quantidadeMoedas05);
        System.out.println("Moedas de 1 cents: " +quantidadeMoedas1);

        sc.close();

        System.out.println("Valor que sobrou " + saque);
    }
}