import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double alicotaIRRF = 7.5;

        System.out.println("======= Calculadora de IRRF nos salarios =======");

        System.out.println("Salarios entre R$2500,00 e R$2800,00 teram uma Alicota de: " + alicotaIRRF);

        System.out.print("Informe o 1º salario: ");
        double salario1 = sc.nextDouble();
        System.out.print("Informe o 2º salario: ");
        double salario2 = sc.nextDouble();
        System.out.print("Informe o 3º salario: ");
        double salario3 = sc.nextDouble();
        System.out.print("Informe o 4º salario: ");
        double salario4 = sc.nextDouble();
        System.out.print("Informe o 5º salario: ");
        double salario5 = sc.nextDouble();

        alicotaIRRF = alicotaIRRF / 100;

        double recolhido1 = salario1 * alicotaIRRF;
        double recolhido2 = salario2 * alicotaIRRF;
        double recolhido3 = salario3 * alicotaIRRF;
        double recolhido4 = salario4 * alicotaIRRF;
        double recolhido5 = salario5 * alicotaIRRF;


        System.out.println("Recolhimento Salario 1: R$" + recolhido1 + " Salario: R$" +salario1 );
        System.out.println("Recolhimento Salario 2: R$" + recolhido2 + " Salario: R$" +salario2 );
        System.out.println("Recolhimento Salario 3: R$" + recolhido3 + " Salario: R$" +salario3 );
        System.out.println("Recolhimento Salario 4: R$" + recolhido4 + " Salario: R$" +salario4 );
        System.out.println("Recolhimento Salario 5: R$" + recolhido5 + " Salario: R$" +salario5 );

        sc.close();
    }
}