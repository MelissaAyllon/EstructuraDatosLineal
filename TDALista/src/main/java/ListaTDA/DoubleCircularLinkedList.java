/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaTDA;

/**
 *
 * @author melis
 * @param <E>
 */
public class DoubleCircularLinkedList<E> implements List<E>{
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
            
            //Setearle al primero el next y el previous
            nodoAnadir.setNext(first);
            nodoAnadir.setPrevious(first.getPrevious());
            
            //Setearle las el next y el previous a los que estan al lado del nuevo 
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
