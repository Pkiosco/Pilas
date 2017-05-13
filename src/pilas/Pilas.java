    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author educacionit
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño de la pila (VALOR NUMERICO)");
        
        int T = Teclado.nextInt();
        pila <String> p = new pila(T);

        String E = new String();


        while(p.isFull() == false ){
        E = Teclado.next();
        p.Push(E);
        E = null;                
        };
        
        p.Listar();
       // System.out.println(p.Pop());;
    }
    
}
