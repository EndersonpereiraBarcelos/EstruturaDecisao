import java.util.Scanner;

public class exercicio10{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Voce estuda em qual turno? M-matutino ou V-Vespertino ou N- Noturno ");
        String turno = sc.next();

        switch(turno){
            case "M", "m":{
            System.out.println("Bom Dia ");
        }break;

        case "V", "v":{
        System.out.println("Boa Tarde ");
        }break;
        
        case "N", "n":{
        System.out.println("Boa Noite ");
        }break;

        default:
        System.out.println("Valor Invalido ");

        }
    }
}