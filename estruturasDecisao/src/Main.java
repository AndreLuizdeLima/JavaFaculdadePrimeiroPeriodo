import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int idade = 20;
//
//        boolean cnh = false;
//        boolean xp = true;
//
//        if (idade > 25 && xp){
//            System.out.println("Contratado!");
//        }
        at3();
    }

    public static void at1 (){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number: ");
        double num2 = sc.nextDouble();

        if (num1 < num2){
            System.out.println(num2 + " É Maior que: " + num1);
        } else {
            System.out.println(num1 + " É Maior que: " + num2);
        }

        sc.close();
    }

    public static void at2(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;

        double r;

        if (soma >= 10){
            r = soma + 5;
        } else {
            r = soma - 7;
        }

        System.out.println("Result: " + r);

        sc.close();
    }

    public static void at3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number: ");
        double num2 = sc.nextDouble();
        double result;
        if (num2 != 0){
            result = num1 / num2;
        } else {
            result = 0;
        }
        System.out.println("O resultado é: " + result);
        sc.close();
    }
}