import java.util.Scanner;

public class exercicio9 {
    
    public static void main(String[]args){
        double n1, n2, n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor ");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo  valor ");
        n2 = sc.nextDouble();

        System.out.println("Digite o terceiro valor ");
        n3 = sc.nextDouble();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " " + n2 + " " + n3);
        }else if(n2 > n1 && n2 > n3){
            System.out.println(n2 + " " + n1 + " " + n3);
        }else if(n3 > n1 && n3 > n2){
            System.out.println(n3 + " " + n1 + " " + n2);
        }else if(n3 > n2 && n3 > n1){
            System.out.println(n3 + " " + n2 + " " + n1);
        }else if(n1 > n3 && n3 > n2){
            System.out.println(n1 + " " + n3 + " " + n2);
        }else if(n2 > n3 && n3 > n1){
            System.out.println(n2 + " " + n3 + " " + n1);
        }else {
            System.out.println("Os valores são os mesmos");
        }
    }
}
