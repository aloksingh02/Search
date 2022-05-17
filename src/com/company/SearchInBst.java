package com.company;

public class SearchInBst {
    static class Node{
        int key;
        Node left,right;

        public Node(int key){
            this.key=key;
        }
    }
    public static boolean search(Node root,int x){
        if(root==null){
            return false;
        }
        if(root.key>x){
            search(root.left,x);
        }
        else if(root.key<x){
            search(root.right,x);
        }
        return true;
    }
}
