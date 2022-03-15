/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.tecla.pkg2020;

import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author hugol
 */
public class ExercicioTecla2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        double F;
        int C;
        
        System.out.println("Pagamento: \n 0 - no ato da entrega \n 1 - no ato da encomenda");
        int M=in.nextInt();
        
        System.out.println("Estatuto do cliente: \n 0 - Cliente não habitual \n 1 - Cliente habitual");
        int E=in.nextInt();
        
        System.out.println("Valor base da encomente: ");
        double V=in.nextDouble();
        
        if (M==1 && E==1) {
            F=(double) (V-V*0.1);
            System.out.println(F);
            
        
        }
        else {
            if (M==1 && E==0) {
                
                F=(double) (V-V*0.05);
                System.out.println(F);
                
            }
            else {
            
                if (M==0 && E==1){
                    
                    F=(double) (V*1.05);
                    System.out.println(F);
                
                
                }
                else {
                    if (M==0 && E==0){
                        F=(double) (V*1.1);
                        System.out.println(F);
                    }
                
                }
            }
        }
        
            
        
        
    }
    
}
