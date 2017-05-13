/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author educacionit
 */public class Pila <T> {
//private final int Max = 1000;
    private T[] elementos ;
    private int Indice = -1;
    private final int Max ;

    public Pila(int Max) {
        this.Max = Max;
        elementos = (T[]) new Object[Max];
    }
 


    public void push(T e) throws PillaLlenaException{
        if (isFull()){
            throw new PillaLlenaException("La pila esta Llena") ;
        }else{
            elementos[++Indice] = e;
        }      
    }

    public int getIndice() {
        return Indice;
    }
    public T  pop() throws PilaVaciaException{
        if (isEmpty()){
            throw new PilaVaciaException("La pila estrat vacia");
            //return null;
        }else{
            T Pope = elementos[Indice];
            elementos[Indice--] = null;
            return Pope;            
        }      
    }
    public boolean isEmpty(){
    return (Indice == -1);    
    }
    public boolean isFull(){
    return (Indice == Max -1 );
    }        
            
    public void listar(){
        for(int I = Indice  ; I > -1; I--){
            System.out.println(elementos[I]);
        }
    } 
    
}
