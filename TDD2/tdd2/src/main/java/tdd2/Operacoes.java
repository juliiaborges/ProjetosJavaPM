
package tdd2;

public class Operacoes {

    public double soma(double a, double b){
        return a + b ;
    }

     public double sub(double a, double b){
        return a - b ;
     }
    public double mult(double a, double b){
        return a * b;
    }
    public double div(double a, double b){
        return a/b;
    }

    public double raiz(double num1) {

        return Math.sqrt(num1);

    }

    public double potenciar(double num1, double num2) {

        return Math.pow(num1, num2);

    }

    public double seno(double num1){
		return Math.sin(Math.toRadians(num1));
	}

    public double tangente(double num1){
        return Math.tan(Math.toRadians(num1));
    }

    public static double cosceno(double num1) {
        return Math.cos(Math.toRadians(num1));
    }


}
