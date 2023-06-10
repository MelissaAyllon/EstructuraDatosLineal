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
public class NodeDLL<E> {
    private E content; 
    private NodeDLL<E> next;
    private NodeDLL<E> previous;
    
    public NodeDLL(E content){
        this.content = content;
        next = null;
        previous = null;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public NodeDLL<E> getNext() {
        return next;
    }

    public void setNext(NodeDLL<E> next) {
        this.next = next;
    }

    public NodeDLL<E> getPrevious() {
        return previous;
    }

    public void setPrevious(NodeDLL<E> previous) {
        this.previous = previous;
    }
    
}
