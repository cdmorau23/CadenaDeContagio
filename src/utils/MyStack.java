package utils;

import java.util.EmptyStackException;

class NodeStack<E> {
    E value;
    NodeStack next;

    public NodeStack(E value){
        this.value = value;
        this.next = null;
    }
}

public class MyStack<E> {

    public NodeStack<E> top;
    public Integer length;

    public MyStack(){
        this.top = null;
        this.length = 0;
    }

    public void push(E value){

        NodeStack<E> newNodeStack = new NodeStack<>(value);
        newNodeStack.next = this.top;
        this.top = newNodeStack;
        this.length++;

    }

    public E pop(){
        if(this.length == 0){
            throw new EmptyStackException();
        }
        E toReturn = this.top.value;
        this.top = this.top.next;
        this.length--;
        return toReturn;
    }

    public E top(){
        return this.top.value;
    }

    public Integer size(){
        return this.length;
    }

    public void clear(){
        while (!this.isEmpty()){
          this.pop();
        }
    }

    public boolean isEmpty(){
        if(this.length == 0){
            return true;
        }
        return false;
    }

    public String toString(){
        if(this.length == 0){
            return "[]";
        }
        String toReturn = "[";
        NodeStack<E> aux = this.top;
        if(aux.value.getClass().equals(toReturn.getClass())){
            toReturn = "[\"";
            while(aux.next != null){
                toReturn = toReturn.concat(aux.value+"\", \"");
                aux = aux.next;
            }
            toReturn = toReturn.concat(aux.value+"\"]");
        }
        else{
            while(aux.next != null){
                toReturn = toReturn.concat(aux.value+", ");
                aux = aux.next;
            }
            toReturn = toReturn.concat(aux.value+"]");
        }
        return toReturn;
    }

}

