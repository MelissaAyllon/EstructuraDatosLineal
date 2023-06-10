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
public interface List<E>{
    
    public boolean add(E e, int index);
    public boolean addFirst(E e);
    public boolean addLast(E e);
    
    public E remove(int index);
    public E removeFirst();
    public E removeLast();
    
    public int size();
    public boolean isEmpty();
    public boolean clear();
    
    public String ToString(); 
    
    
}
