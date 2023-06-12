/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaTDA;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Arrays;

/**
 *
 * @author melis
 * @param <E>
 */
public class ArrayList<E> implements List<E> {

    
    private E[] elements;
    private int capacidad = 100;
    private int effectiveSize;
    
    public ArrayList(){
        elements = (E[]) new Object[capacidad];
        effectiveSize = 0;
    }
    
    @Override
    public boolean add(E e, int index) {
        if (index > effectiveSize){ // siempre preguntarse cuando es igual 
            throw new ArrayIndexOutOfBoundsException();
        }
        if(this.isEmpty()){
            elements[0] = e;
            effectiveSize++;
            return true;
        }
        else if (capacidad == effectiveSize){
            this.addCapacity();
            this.add(e,index);
            return true;
        }
        else {
            //probar
            for(int i = effectiveSize; i > index ; i--){ //va agarrando desde el primer vacio hacia los elementos
                elements[i] = elements[i-1]; //mirar desde este punto de vista, el que entra es i que es effective size que siempre es uno mas que el index
            }
            elements[index] = e;
            effectiveSize++;
            return true;
        }
    }

    @Override
    public boolean addFirst(E e) {
        add(e,0);
        return true;
    }

    @Override
    public boolean addLast(E e) {
        add(e,effectiveSize);
        return true;
    }

    @Override
    public E remove(int index) {
        if (index >= effectiveSize || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            //primero se remueve
            E eleRemovido = elements[index];
            elements[index] = null;
            for(int i = index; i < effectiveSize;i++){
                elements[i] = elements[i+1];
            }
            effectiveSize--;
            return eleRemovido;
        }
    }

    @Override
    public E removeFirst() {
        E removido = remove(0);
        return removido;
        
    }

    @Override
    public E removeLast() {
        E removido = remove(effectiveSize -1);
        return removido;
    }

    @Override
    public int size() {
        return effectiveSize;
    }

    @Override
    public boolean isEmpty() {
        return capacidad == 0;
    }

    @Override
    public boolean clear() {
        E[] arrayvacio = (E[]) new Object[capacidad];
        elements = arrayvacio;
        return true;
    }

    private void addCapacity() {
        E[] arraynuevo = (E[]) new Object[capacidad*2];
        capacidad = capacidad *2;
        for (int i = 0; i < elements.length;i++){
            arraynuevo[i] = elements[i];
        }
        elements = arraynuevo;
    }

    @Override
    public String toString() {
        return "ArrayList" + " "+ Arrays.toString(elements);
    }
    
    //public void concatenar(ArrayList<E> arrayCon){
        
    //}
    
    //si puedo usar el metodo last
    public void concatenar(E[] arrayCon){
        for (int i = 0; i<arrayCon.length ;i++){
            this.addLast(arrayCon[i]);
        }
    }
    
    //si el array que ingresa es un arrayList
    public void concatenar(ArrayList<E> arrayCon){ //recuerda el array list es una clase que tu implementaste tiene varios atributos no solo el array no se puede agarra del index solo si creas un metodo e internamente
        for(int i = 0; i<arrayCon.size(); i++){
            this.addLast(arrayCon.get(i)); //habria que implementar el metodo get
        }
    }

    //es public o private? lo tengo como private pero lo voy a pasar a private
    public E get(int i) {
        return elements[i];
    }
    
    //voy a crear una clase aqui mismo que sea como que solo add y pueda anadir al final, aunque lo que
    //puedo hacer es overloading crear otro metodo add y sin parametros
    //y llamar al metodo addLast fin jeje

    @Override
    public String ToString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
  
}
