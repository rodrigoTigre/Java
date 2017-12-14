package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
    

   
    public static void main(String[] args) {

        int N, Fat=1;
        Scanner Lers = new Scanner (System.in);
        System.out.print("Digite um inteiro inferio a 32");
        N=Lers.nextInt();
        for(int M=N;M>=1;M--)
        Fat*=M;
        System.out.printf("%d!=%d",N,Fat);
        
        
        
        
        
        
        
    }
    
}
