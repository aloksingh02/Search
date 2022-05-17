package com.company;
import java.util.*;

public class InsertInBst {
    static class Node{
        int key;
        Node left,right;
        public Node(int key){
            this.key = key;
        }
    }
    public static Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        if(root.key>x){
            root.left = insert(root.left,x);
        }
        else if(root.key<x){
            root.right = insert(root.right,x);
        }
        return root;
    }
}
