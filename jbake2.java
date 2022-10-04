
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexia
 */
public class jbake2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Promoção de aniversário da Padaria do Joaquim");
    int i= 0;
    String produto = "";
    double valor = 0;
    double desconto = 0;
    String valorp;
    String valord;
    
    Scanner ler = new Scanner(System.in);
    
    for (i=1;i<=10;i=i+1){
        System.out.println("Digite o nome do produto"  +i);
        produto=ler.next();
        System.out.println ("Digite o valor do produto");
        valor=ler.nextDouble();
        desconto = (valor / 100 * 50);
        valorp =(" Preço: R$");
        valord =(" Preço com desconto: R$");
        System.out.println("Você escolheu:  "+ produto + valorp + valor + valord + desconto);
        
        
        
    }
    
     
      
       
        
       

        
       
               
       
    }
    
}
    
    
