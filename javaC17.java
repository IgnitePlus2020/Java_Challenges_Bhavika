package com.tgt.igniteplus;
import java.util.*;
public class javaC17 {
    static class Node {
        char data;
        Node left, right;
    }

    ;

    // Utility function to create a new tree node
    static Node newNode(char data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to print leaf
// nodes from right to left
    static void printLeafNodes(Node root) {
        // If node is null, return
        if (root == null)
            return;

        // If node is leaf node, print its data
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }


        // If left child exists, check for leaf
        // recursively
        if (root.left != null)
            printLeafNodes(root.left);

        // If right child exists, check for leaf
        // recursively
        if (root.right != null)
            printLeafNodes(root.right);

    }

    // Driver code
    public static void main(String args[]) {
        Node root = newNode('A');
        root.left = newNode('B');
        root.right = newNode('F');
        root.left.left = newNode('C');
        root.left.right = newNode('E');
        root.right.left = newNode('G');
        root.right.right = newNode('H');
        root.left.left.left = newNode('D');
        root.right.right.right = newNode('K');

        printLeafNodes(root);

    }
}