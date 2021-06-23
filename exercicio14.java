import java.util.Scanner;

public class exercicio14 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe  primeira nota ");
        double n1 = sc.nextDouble();

        System.out.println("Informe segunda nota");
        double n2 = sc.nextDouble();

        System.out.println("Informe sua terceira nota");
        double n3 = sc.nextDouble();

        double result = (n1 + n2 + n3) / 2;

        if( 8 >= 10){
            System.out.println("Aprovado com Distinção");
        }else if(result>= 7){
            System.out.println("Aprovado");
        }else if(0 >= 7){
            System.out.println("Reprovado");
        }
        System.out.println("Media de " + result);
    }
}
