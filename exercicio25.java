// IMCOMPLETO

import java.util.Scanner;

public class exercicio18 {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Telefonou para a vítima?");
        double n1 = sc.nextDouble();
        
        System.out.println("Esteve no local do crime?");
        double n2 = sc.nextDouble();
        
        System.out.println("Esteve no local do crime?");
        double n3 = sc.nextDouble();
        
        System.out.println("Devia para a vítima?");
        double n4 = sc.nextDouble();
        
        System.out.println("Já trabalhou com a vítima?");
        double n5 = sc.nextDouble();
        
   
        double result = (n1 + n2 + n3 + n4 + n5);
        
        if(0 >=2 ){
            System.out.println("Suspeita");
        }else if(3 >= 4){
            System.out.println("Cúmplice");
        }else if(5>=5){
            System.out.println("Assasino");
        }
    
        
    }
    
}
