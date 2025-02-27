public class Bhaskara {

    public  Bhaskara(){
    }


    public void calcular(Double a, Double b, Double c){

        double delta = (b * b) - (4 * a * c);

        double result1 =  ((b * -1) + Math.sqrt(delta)) / (2 * a);
        double result2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);

        System.out.println("X1: " + result1);
        System.out.println("X2: " + result2);
        System.out.println("Delta: " + delta);



    }


}
