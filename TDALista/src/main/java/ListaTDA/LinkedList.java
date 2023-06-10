/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaTDA;

/**
 *
 * @author melis
 * @param <E> tipo parametrizado
 */
public class LinkedList<E> implements List<E>{
    
    private Node<E> first;
    private Node<E> last;
    
    //Como inicializar una linked list;
    public LinkedList() {
        this.first = null;
        this.last = null;
    }
    
    //Anadir un elemento en indice
    
    //habria que validar que no haya nada ahi, en ese caso es porque esta vacia o el indice es el ultimo
    @Override
    public boolean add(E e, int index) {
        
        if (index < 0 || index > size()){    //hacer el size
            throw new ArrayIndexOutOfBoundsException("");
        }
        //Crear el nodo
        Node<E> nodoAnadir = new Node(e);
        
        //si es el primer indice
        if(index == 0){
            nodoAnadir.setNext(first);
            first = nodoAnadir;
            if(nodoAnadir.getNext() == null){
                last = first;
            }
            
            return true;
        }
        //Si se lo anade al final y no hay nada obviamente ahi
        else if (size() == index){
            last.setNext(nodoAnadir);
            last = nodoAnadir;
            return true;
        }
        else{
            //caso general
        
//            //Buscar el nodo con el indice actual para ponerlo de ubicacion en mi nodo nuevo
//            nodoAnadir.setNext(getNode(index));
//
//            //Ahora queremos que este nodo nuevo este en la ubicacion del anterior para que siga la lista
//            getNode(index-1).setNext(nodoAnadir);
//            
//            /*
//            Debemos hacer esta condicion pues al principio si comenzo en 0 y luego voy en orden 
//            */
//            if(size() == (index + 1)){
//                last = nodoAnadir;
//            }
            Node<E> nodoViajero = first;
            for(int i = 0; i < index-1;i++){
                nodoViajero = nodoViajero.getNext();
            }
            //primero se setea el siguiente del nodoAnadir
            nodoAnadir.setNext(nodoViajero.getNext());
            //luego anadir al nodoViajero setearle el nuevo nodo
            nodoViajero.setNext(nodoAnadir);

            return true;  
        }
    }

    @Override
    public boolean addFirst(E e) {
        
        //crear nodo 
        Node<E> nodoPrimero = new Node(e);
        
        //si esta vacio se anade directo

        if(isEmpty()){
            first = nodoPrimero;
            last = nodoPrimero;
            return true;
        }
        else{
            nodoPrimero.setNext(first);
            first = nodoPrimero;
            return true;
        }
    }

    @Override
    public boolean addLast(E e) {
        
        Node<E> nodoUltimo = new Node(e);
        
        if(isEmpty()){
            first = nodoUltimo;
            last = nodoUltimo;
            return true;
        }
        
        else{
            last.setNext(nodoUltimo);
            last = nodoUltimo;
            return true;
        }
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        
        Node<E> nodoEliminar = getNode(index);
        //SI ES EL PRIMERO Y ULTIMO DEBEMOS SETEARLOS AL MENOS MAS SEGURIDAD CON EL PRIMEROA
        if(index == 0){
               first = first.getNext();
               return nodoEliminar.getContent();
        } 
        
        else{
           
            //necesito conseguir el nodo en la posicion de atras 
            getNode(index -1).setNext(getNode(index+1));
            
            return nodoEliminar.getContent();
         
        }
    }

    @Override
    public E removeFirst() {
        if(isEmpty()){
           throw new IllegalArgumentException("Esta vacia");
        }
        return remove(0);
    }

    @Override
    public E removeLast() {
        if(isEmpty()){
           throw new IllegalArgumentException("Esta vacia");
        }
        return remove(size()-1);
    }

    @Override
    //CAMBIAR
    public int size() {
        int contador = 0;
        
        //necesitamos una variable que se vaya moviendo a traves de la linea en este caso seria un nodo
        for(Node<E> nodoViajero = first; nodoViajero != null ; nodoViajero = nodoViajero.getNext()){
            contador++;
        }
        
        return contador;
       
    }

    @Override
    public boolean isEmpty() {
        return first == null && last == null;
    }

    @Override
    public boolean clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Node<E> getNode(int index){
        Node<E> nodoViajero = first;
        
        //Ir recorriendo el nodo hasta que sea el anterior del indice
        //Pues ese anterior va a invocar al siguiente que es nuestro INDICE
        for(int i = 0;i < index; i++){
            nodoViajero = nodoViajero.getNext();
        }
        return nodoViajero;
    }

    @Override
    public String ToString() {
        
        String elementos = "{";
        
        for(Node<E> nodoViajero = first; nodoViajero != null; nodoViajero = nodoViajero.getNext()){
            elementos += nodoViajero.getContent() + ", ";
        }
        elementos = elementos.substring(0,elementos.length() - 2);
        elementos += "}";
        return elementos;
    }
    
}
