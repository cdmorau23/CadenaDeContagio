/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author ASUS
 */
public class Node<E>{
    public Node prev;
    public E value;
    public Node next;

    public Node(E value){
        this.prev = null;
        this.value = value;
        this.next = null;
    }
}


