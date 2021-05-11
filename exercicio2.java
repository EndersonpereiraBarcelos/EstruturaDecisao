import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[]args){
        int num1;

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite numero ");
        num1 = entrada.nextInt();

        if(num1 > 0){
            System.out.println("Numero Positivo");
        }else {
            System.out.println("Numero Negativo");
        }
    }
}
