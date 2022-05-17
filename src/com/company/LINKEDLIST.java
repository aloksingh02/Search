package com.company;

public class LINKEDLIST {
    private Node head,tail;
    private int size;
    public LINKEDLIST(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node= new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size=size+1;
    }
    public int deleteFirst(){
        int val = head.key;
        head = head.next;
        if(tail==null){
            head = null;
        }
        size--;
        return val;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.key+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static class Node{
        private int key;
        private Node next;
        public Node(int key){
            this.key = key;
        }
        public Node(int key,Node next){
            this.key=key;
            this.next = next;
        }

    }
}
