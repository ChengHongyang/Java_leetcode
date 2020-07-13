package com.chy;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/4/26
 */
public class BinaryTree {
    BinaryTree left;
    BinaryTree right;
    int value;

    public BinaryTree() {
    }

    public static void insert(int num, BinaryTree binaryTree) {
        BinaryTree sonTree = new BinaryTree();
        if (num < binaryTree.value) {
            if (binaryTree.left == null) {
                sonTree.value = num;
                binaryTree.left = sonTree;
            } else {
                insert(num,binaryTree.left);
            }

        } else {
              if (binaryTree.right==null){
                  sonTree.value=num;
                  binaryTree.right=sonTree;
              }else{
                  insert(num,binaryTree.right);
              }
        }

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        System.out.println(binaryTree.left);
    }
}
