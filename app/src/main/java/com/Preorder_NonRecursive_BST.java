package com;

import java.util.Scanner;

public class Preorder_NonRecursive_BST

{

    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in);

        BinarySearchTreeOperations bst = new BinarySearchTreeOperations();

        System.out.println("Enter the first 10 elements of the tree\n");

        int N = 10;

        for (int i = 0; i < N; i++)

            bst.insert(scan.nextInt());



        System.out.print("\nPre order  : ");

        bst.preorder();



        scan.close();

    }

}
