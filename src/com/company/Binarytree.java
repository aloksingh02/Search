package com.company;
import java.util.*;

public class Binarytree {
    static class Node{
        int key;
        Node left,right;
        public Node(int key){
            this.key = key;
            this.left=null;
            this.right=null;
        }
    }
    static class Binary {
        static int index = -1;

        public static Node buildtree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;.
        }
    }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.println(root.key+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
            System.out.println(root.key);
        }
        public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftcount = countNodes(root.left);
        int rightcount = countNodes(root.right);
        return leftcount+rightcount+1;
    }
    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sumNodes(root.left);
        int rightsum = sumNodes(root.right);
        return leftsum+rightsum+root.key;
    }
    public static void main(String args[]){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary tree = new Binary();
        Node root = tree.buildtree(nodes);
        System.out.println(height(root));
    }
}
