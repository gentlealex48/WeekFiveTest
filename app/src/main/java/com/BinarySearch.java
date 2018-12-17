package com;

import java.util.Scanner;

import java.util.Stack;



class BinarySearch

{

    BinarySearch left, right;

    int                  data;



    public BinarySearch()

    {

        left = null;

        right = null;

        data = 0;

    }



    public BinarySearch(int n)

    {

        left = null;

        right = null;

        data = n;

    }



    public void setLeft(BinarySearch n)

    {

        left = n;

    }



    public void setRight(BinarySearch n)

    {

        right = n;

    }



    public BinarySearch getLeft()

    {

        return left;

    }



    public BinarySearch getRight()

    {

        return right;

    }



    public void setData(int d)

    {

        data = d;

    }



    public int getData()

    {

        return data;

    }

}



class BinarySearchTreeOperations

{

    private BinarySearch root;



    public BinarySearchTreeOperations()

    {

        root = null;

    }



    public boolean isEmpty()

    {

        return root == null;

    }



    public void insert(int data)

    {

        root = insert(root, data);

    }



    private BinarySearch insert(BinarySearch node, int data)

    {

        if (node == null)

            node = new BinarySearch(data);

        else

        {

            if (data <= node.getData())

                node.left = insert(node.left, data);

            else

                node.right = insert(node.right, data);

        }

        return node;

    }



    public void preorder()

    {

        preorder(root);

    }



    private void preorder(BinarySearch r)

    {

        Stack<BinarySearch> s = new Stack<BinarySearch>();

        s.push(r);

        while (!s.empty())

        {

            r = s.pop();

            System.out.print(r.data + " ");

            if (r.right != null)

                s.push(r.right);

            if (r.left != null)

                s.push(r.left);

        }

    }

}



