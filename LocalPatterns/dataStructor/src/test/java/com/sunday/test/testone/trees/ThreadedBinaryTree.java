package com.sunday.test.testone.trees;

/**
 *  线索化功能的二叉树
 */
public class ThreadedBinaryTree {


    public HeroNode root;
    //需要创建给指向当前结点的前驱结点的指针
    public HeroNode pre = null;

    public void threadedNodes(){

    }

    //遍历
    public void threadedList(){
        HeroNode node = root;
        while (root != null) {

            while (node.leftType == 0){
              node = node.leftNode;
            }

            System.out.println(node);

            while (node.rightType == 1){
                node = node.rightNode;
                System.out.println(node);
            }

            node = node.rightNode;

        }
    }

}
