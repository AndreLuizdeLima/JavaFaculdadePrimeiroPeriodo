import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);   //Calculo imc.
        System.out.println("Seu IMC: " + String.format("%.2f",imc));  //desconsidere esse %.2f é apenas para deixar formado com duas casas decimais o numero.
    }

}