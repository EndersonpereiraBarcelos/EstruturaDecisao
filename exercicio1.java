import java.util.Scanner;

class exercicio1 {
     public static void main(String[]args){
     Scanner sc = new Scanner (System.in);
        int a[]= new int[2];
        int maior = 0;
        
        for(int i=0;i<2;i++){
     System.out.print("Entre com o número : ");
        a[i] = sc.nextInt();
        
        if (a[i]>maior)
         {
        maior = a[i];
         }
        }
    System.out.println("o maior numero e: " + maior);          
    }
}