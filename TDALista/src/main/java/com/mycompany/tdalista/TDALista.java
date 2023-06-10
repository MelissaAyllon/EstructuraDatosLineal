/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tdalista;

import ListaTDA.ArrayList;
import ListaTDA.DoubleCircularLinkedList;
import ListaTDA.LinkedList;
import ListaTDA.List;
/**
 *
 * @author melis
 */
public class TDALista {

    public static void main(String[] args) {
//        List<String> palabras = new ArrayList<>();
//        palabras.add("Hola",0);
//        System.out.println(palabras.toString()); //como se ve
//        palabras.add("Como estas",1);
//        palabras.add("MElissa",2);
//        System.out.println(palabras.toString());
//        palabras.add("hi",1);
//        System.out.println(palabras.toString());
//        
//        //remove
//        
//        palabras.remove(0);
//        System.out.println(palabras.toString());
//        palabras.remove(1);
//        System.out.println(palabras.toString());
//        System.out.println("");
//        
//        //prueba de primero concatenar
//        ArrayList<Integer> enteros = new ArrayList<>();
//        enteros.addFirst(1);
//        enteros.add(2,1);
//        Integer[] ent = {1,2};
//        enteros.concatenar(ent);
//        System.out.println(enteros.toString());
//        System.out.println("");
//        
//        
//        //prueba del segundo concatenar usando el mismo arrayList de elementos
//        ArrayList<Integer> enteros2 = new ArrayList<>();
//        enteros2.addLast(5);
//        enteros2.addLast(6);
//        enteros.concatenar(enteros2);
//        System.out.println(enteros.toString());
        
        
        //Prueba anadiendo a la linkedlist
        LinkedList<String> listaEnlazada = new LinkedList<>();
        
        listaEnlazada.add("Hola",0);
        listaEnlazada.add("Holas",1);
        listaEnlazada.addFirst("HELLO");
        listaEnlazada.addLast("QUE HACE");
        
//        System.out.println(listaEnlazada.size());
//        
//        //remove
////        System.out.println(listaEnlazada.remove(0));
////        System.out.println(listaEnlazada.size());
////        System.out.println(listaEnlazada.remove(2));
////        System.out.println(listaEnlazada.size());
//        System.out.println(listaEnlazada.removeFirst());
//        System.out.println(listaEnlazada.removeLast());
        
        listaEnlazada.add("Nuevo", 4);
        System.out.println(listaEnlazada.size());
        System.out.println(listaEnlazada.ToString());
        
        DoubleCircularLinkedList<Integer> dobleCircu = new DoubleCircularLinkedList<>();
        dobleCircu.addFirst(1);
        
    }
}
