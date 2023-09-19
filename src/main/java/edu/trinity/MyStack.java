package edu.trinity;

import java.util.EmptyStackException;

public class MyStack<T> {

    private int size;
    private Object[] myStack;
    private int maxSize=100;

    public MyStack(){
        myStack = (T[]) new Object[maxSize];
        size=0;
    }

    public void push(T hello) {
        myStack[size++]=hello;
    }

    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return (T) myStack[size-1];
        }
    }

    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            T element = (T) myStack[size-1];
            size--;
            myStack[size] = null;
            return element;
        }
    }

    public boolean isEmpty() {
        if(size<=0){
            return true;
        }else{
            return false;
        }
    }
}
