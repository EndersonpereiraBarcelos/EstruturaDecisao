import java.util.Scanner;

public class exercicio8 {

    public static void main(String[]args){
        double produto1, produto2, produto3;

        Scanner pd = new Scanner(System.in);
        System.out.println("Valor do Produto ");

        produto1 = pd.nextDouble();

        produto2 = pd.nextDouble();

        produto3 = pd.nextDouble();

        if(produto1 < produto2 && produto1 < produto3){
            System.out.print("Valor do primeiro " + produto1+ " produto ");
        }else if(produto2 < produto1 && produto2 < produto3){
            System.out.println("Valor do segundo " + produto2 + " produto ");
        }else if( produto3 < produto1 && produto3 < produto2){
            System.out.println("valor do terceiro " + produto3 + " produto ");
        }else{
            System.out.println("Os valores são os mesmos");
        }
    }
    
}
