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
    public static void main(String[] args) throws PillaLlenaException {
        Scanner Teclado = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño de la pila (VALOR NUMERICO)");
        
        int T = Teclado.nextInt();
        Pila <String> p = new Pila(T);

        String E = new String();

        try{
            while(p.isFull() == false ){
            E = Teclado.next();
            p.push(E);
            E = null;                
            }
        }catch (PillaLlenaException error){
            System.out.println("Se Produjo un error");
            System.out.println("descripcion: " +error);
        }
        p.listar();
       // System.out.println(p.Pop());;
       
    }
    
}
