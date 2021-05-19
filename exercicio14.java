mport java.util.Scanner;
public class exercicio14 {

   
    public static void main(String[] args) {
        
        double nota1, nota2, media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a sua primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Informe a sua segunda nota: ");
        nota2 = sc.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media == 10){
            System.out.println("Aprovado");
        }else if( 9.0 >= 10){
        System.out.println("nota A aprovado");
        }else if (7.5 >= 9.0){
            System.out.println("nota B aprovado");
        }else if(6.0 >= 7.5){
            System.out.println("nota C aprovado");
        }else if (4.0 >= 6.0){
            System.out.println("nota D reprovado");
        }else if(4.0 >= 0){
            System.out.println("nota E reprovado");
        }
    }
}
