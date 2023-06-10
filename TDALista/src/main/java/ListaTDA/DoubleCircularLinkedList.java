/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaTDA;

import java.util.Iterator;

/**
 *
 * @author melis
 * @param <E>
 */
public class DoubleCircularLinkedList<E> implements List<E>, Iterable<E>{
    NodeDLL<E> first;
    
    public DoubleCircularLinkedList(){
        first = null;
    }
    
    @Override
    public boolean add(E e, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addFirst(E e) {
        
        //crear el nuevo nodo 
        NodeDLL<E> nodoAnadir = new NodeDLL<>(e);
        
        if(size() == 0){
            nodoAnadir.setNext(nodoAnadir);
            nodoAnadir.setPrevious(nodoAnadir);
            first = nodoAnadir;
            return true;
        }
        else{
            
            //Setearle al nuevo el next y el previous
            nodoAnadir.setNext(first);
            nodoAnadir.setPrevious(first.getPrevious());
            
            //Setearle el next y el previous a los que estan al lado del nuevo 
            //el siguiente del ultimo 
            nodoAnadir.getPrevious().setNext(nodoAnadir);
            //setear el anterior del nuevo por ahora
            first.setPrevious(nodoAnadir);
            
            first = nodoAnadir;
            return true;
            
        }
    }

    @Override
    public boolean addLast(E e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E removeFirst() {
        NodeDLL<E> eliminado = first;
        if(size() == 1){
            //ponerlo nulo
            first.setNext(null);
            first.setPrevious(null);
            first = null;
            return eliminado.getContent();
        }
        //caso de que haya mas de 1
        
        //setearle a los de alado del que se va a eliminar
        //previo del first de ahora
        first.getPrevious().setNext(first.getNext());
        
        //el next del que esta despues del first de ahora
        first.getNext().setPrevious(first.getPrevious());
        
        first = first.getNext();
        return eliminado.getContent();
    }

    @Override
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        
        //CONTADOR DE ELEMENTOS
        int contador = 0;
        //comienza desde el primero
        NodeDLL<E> viajero = first; 
        
        if(first == null){
            return contador;
        }
        contador++;
        for(viajero = viajero.getNext();  !viajero.equals(first) ; viajero = viajero.getNext()){
            contador++;
        }
        return contador;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ToString() {
        String result = "{";
        
        
        if(first == null){
            return result = " ";
        }
        NodeDLL<E> viajero = first;
        result += viajero.getContent() +", ";
        for(viajero = viajero.getNext(); !viajero.equals(first);viajero = viajero.getNext()){
            result += viajero.getContent() + ", ";
        }
        result = result.substring(0, result.length()-2);
        result += "}";
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
