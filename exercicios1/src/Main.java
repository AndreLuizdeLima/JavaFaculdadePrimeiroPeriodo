import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        at8();
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

//        double f;
//        f = Math.sqrt((1 / (1 * c)) - ( ( (r ^ 2) / ((4 * c)^2) ));

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

    public static void at8(){

        double quantVoteA;
        double quantVoteB;
        double quantVoteC;
        double quantVoteNull;
        double quantVoteBranco;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade votos A: ");
        quantVoteA = sc.nextDouble();
        System.out.print("Quantidade votos B: ");
        quantVoteB = sc.nextDouble();
        System.out.print("Quantidade votos C: ");
        quantVoteC = sc.nextDouble();
        System.out.print("Quantidade votos Nulos: ");
        quantVoteNull = sc.nextDouble();
        System.out.print("Quantidade votos Brancos: ");
        quantVoteBranco = sc.nextDouble();

        double totalVote = quantVoteA + quantVoteB + quantVoteC + quantVoteNull + quantVoteBranco;

        double porcentagemA = (quantVoteA * 100) / totalVote;
        double porcentagemB = (quantVoteB * 100) / totalVote;
        double porcentagemC = (quantVoteC * 100) / totalVote;
        double porcentagemNUll = (quantVoteNull * 100) / totalVote;
        double porcentagemBranco = (quantVoteBranco * 100) / totalVote;

        System.out.println("Total de votos: "+ totalVote);
        System.out.println("Porcentagem de votos A: " + String.format("%.2f",porcentagemA));
        System.out.println("Porcentagem de votos B: " + String.format("%.2f",porcentagemB));
        System.out.println("Porcentagem de votos C: " + String.format("%.2f",porcentagemC));
        System.out.println("Porcentagem de votos Nulos: " + String.format("%.2f",porcentagemNUll));
        System.out.println("Porcentagem de votos Brancos: " + String.format("%.2f",porcentagemBranco));

        sc.close();
    }


}