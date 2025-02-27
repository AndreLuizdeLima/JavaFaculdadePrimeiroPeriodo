import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

    }

    public static void at1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("I am" + age + "years old");
        sc.close();
    }

    public static void at2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + subtracao);
        System.out.println(num1 + " x " + num2 + " = " + multiplicacao);
        System.out.println(num1 + " / " + num2 + " = " + divisao);

        sc.close();
    }

    public static void at3(){
        Scanner sc = new Scanner(System.in);
        String name = "Andre";
        System.out.println("Olá, meu nome é " + name);
        System.out.print("Informe seu nome: ");
        String userNome = sc.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String userSobrenome = sc.nextLine();
        System.out.println("Nome completo: " + userNome + " " + userSobrenome);
        sc.close();
    }

    public static void at4(){
        double altura = 40.0;
        double largura = 30.0;

        double area = altura * largura;
        double perimetro = (altura * 2) + (largura * 2);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void  at5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ender number A: ");
        double numberA = sc.nextDouble();
        System.out.print("Ender number B: ");
        double numberB = sc.nextDouble();
        System.out.print("Ender number C: ");
        double numberC = sc.nextDouble();
        Bhaskara bhaskara = new Bhaskara();
        bhaskara.calcular(numberA,numberB,numberC);
        sc.close();
    }

    public  static void at6() {

    }

    public static void at7(){

        Scanner sc = new Scanner(System.in);
        System.out.println("============= Calculadora de Dolar =============");

        System.out.print("Cotação do Dolar em relação ao Real: ");
        double cotacaoDolar = sc.nextDouble();
        System.out.println("Informe a sua quantidade de Dolares: ");
        double quantidadeDolar = sc.nextDouble();


        double totalDolar = cotacaoDolar * quantidadeDolar;

        System.out.println("A contação do dolar hoje é: " + cotacaoDolar + "para 1 Real");

        System.out.println("Total de dolares em Reais: " + totalDolar);

    }


}