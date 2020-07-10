/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seis;
import java.util.Scanner;


/**
 *
 * @author HOME
 */
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        
        double R, P, A, D;
        
        System.out.println("Valor do raio");
        R = ler.nextDouble();
        
        P = 2*3.14*R;
        A = 3.14*Math.pow(R,2);
        D = 2*R;
        
        System.out.println("Perimetro do circulo: "+P);
        System.out.println("Área do Circulo: "+A);
        System.out.println("Diâmetro do Circulo: 2"+D);
    }
    
}
