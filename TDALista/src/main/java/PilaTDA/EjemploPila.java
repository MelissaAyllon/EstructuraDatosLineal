/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaTDA;

import ListaTDA.ArrayList;
import java.util.Stack;

/**
 *
 * @author melis
 */
public class EjemploPila {
    
    public static boolean estanParentesisCorrectos(String sucesion){
        Stack<Character> parentesis = new Stack<>();

        for(int i = 0;i< sucesion.length();i++){
            char c = sucesion.charAt(i);
            if(c == '('){
                parentesis.push(c);
            }
            else if(c==')'){
                if(parentesis.isEmpty()){
                    return false;
                }
                parentesis.pop(); //va a dar error si hay demas de )
            }
        }
        
        return parentesis.isEmpty();
    }
    
    //Ejercicio 2
    /*
    Implemente el método borrarBase​, que elimina el elemento situado en la base
    (o fondo) de la pila y lo devuelve como resultado. Además, la pila debe quedar con los
    elementos originales sin la base.

    public​ ​static​ ​Object​ borrarBase​(​Stack​<​Object​>​ pila)
    */
    public static <E> E borrarBase(Stack<E> pila){
        //Debemos guardar los elementos en otro lugar
        //Mas conveniente seria arrayList ya que queremos guardarlos al ultimo y acceder nada mas
        
        ArrayList<E> arr = new ArrayList<E>();
        while(!pila.isEmpty()){
            arr.addLast(pila.pop());
        }
        
        //con la lista llena los introduzco en la pila que acaba de estar vacia ahora
        
        for(int i = arr.size()-1 ;i > 0;i--){
            //se agregan todos excepto el ultimo
            pila.push(arr.get(i));
        }
        
        return arr.get(0);
    }
    
    /*
    Implemente el método topeBase​, que intercambia el elemento del tope de una
    pila con el elemento de la base.
    
    public​ ​static​ ​void​ topeBase​(​Stack​<​Object​>​ pila)
    */
    
    
    
}
