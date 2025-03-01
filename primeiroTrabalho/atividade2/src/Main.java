import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Calculo Area Trapezio ======");

        System.out.print("Informe a Base Maior: ");
        double baseMaior = sc.nextDouble();
        System.out.print("Informe a Base Menor: ");
        double baseMenor = sc.nextDouble();
        System.out.print("Informe a Altura: ");
        double altura = sc.nextDouble();
        System.out.println("Informe o tamanho do lado1: ");
        double lado1 = sc.nextDouble();
        System.out.println("Informe o tamanho do lado2: ");
        double lado2 = sc.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2.0;

        double perimetro = baseMaior + baseMenor + lado1 + lado2;

        System.out.println("Area do Trapezio: " + String.format("%.2f", area));
        System.out.println("Perimetro do Trapezio: " + String.format("%.2f", perimetro));



    }
}