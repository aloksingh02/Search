package com.company;

public class StackImpl {
    private int[] data;
    private static final int default_size=10;
    int top = -1;
    public StackImpl(){
        this(default_size);
    }
    public StackImpl(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return top== data.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
        }
        top++;
        data[top]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("can not pop from empty stack");
        }
        return data[top--];
    }
}
