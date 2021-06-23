import java.util.Scanner;

public class exercicio5 {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota");
        double nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextInt();

        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado ");
        }else if (media < 7){
            System.out.println("Reprovado ");
        }else if (media >= 7){
            System.out.println("Aprovado ");
        }
    }
}

