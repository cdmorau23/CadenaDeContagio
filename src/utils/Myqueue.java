/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Formularios.*;
import utils.Node;

/**
 *
 * @author sordo
 */
public class Myqueue<T>{
    private Node<T> front;
    private Node<T> back;
    private Integer length;

    public Myqueue(){
        front = null;
        back = null;
        length = 0;
    }

    public void enqueue(T value){
        Node<T> newNodo = new Node<>(value);
        if(this.isEmpty()){
            this.front = this.back = newNodo;
        } else{
            this.back.next = newNodo;
            this.back = newNodo;
        }
        this.length++;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node<T> f = front;
            this.front = this.front.next;
            this.length--;
            return f.value;
        } else {
            System.out.println("No es posible desencolar en una cola vacía");
            return null;
        }
    }

    public T peek(){
        if(!this.isEmpty()){
            return this.front.value;
        } else {
            System.out.println("La cola está vacía");
            return null;
        }
    }

    public boolean isEmpty(){
        return this.getLength() == 0;
    }

    public Integer getLength() {
        return this.length;
    }

    @Override
    public String toString(){
        if (this.isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> aux = this.front;
        while (aux.next != null){
            sb.append(aux.value + ", ");
            aux = aux.next;
        }
        sb.append(aux.value);
        sb.append("]");
        return sb.toString();
    }
}
