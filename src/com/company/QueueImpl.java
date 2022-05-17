package com.company;

public class QueueImpl {
    private int[] data;
    private static int default_size = 10;
    int end=-1;
    public QueueImpl(){
        this(default_size);
    }
    public QueueImpl(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end==data.length-1;
    }
    public boolean isEmpty(){
        return end==-1;
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("can not push to full array");
        }
        end++;
        data[end]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("can not remove from empty stack");
        }
        int removed = data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
}
