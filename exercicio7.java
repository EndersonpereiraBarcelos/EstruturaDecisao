import java.util.Scanner;

public class exercicio7{

    public static void main(String []args){

        double num1, num2, num3;

        Scanner nota = new Scanner (System.in);
        System.out.println("Digite o primeiro numero ");
        num1 = nota.nextDouble();
       
        System.out.println("Digite o segundo numero ");
        num2 = nota.nextDouble();
       
        System.out.println("Digite o terceiro numero ");
        num3 = nota.nextDouble();

        if(num1 > num2 && num1 > num3){
            System.out.println("O numero " + num1 + " é o maior");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("O numero " + num2 + " é o maior");
        }else if (num3 > num1 && num3 >num2){
            System.out.println("O numero " + num3 + " é o maior");
        }else {
            System.out.println("Os numeros são os mesmos");
        }
        if(num1 < num2 && num1 < num3){
            System.out.println("O numero " + num1 + " é o menor");
        }else if(num2 < num1 && num2 < num3){
            System.out.println("O numero " + num2 + " é o menor");
        }else if (num3 < num1 && num3 < num2){
            System.out.println("O numero " + num3 + " é o menor");
     }
    }
}
