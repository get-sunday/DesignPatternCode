package com.sunday.test.testone.trees;

import org.junit.Test;



public class test {

    @Test
    public void  test(){
//          binarySearch();
        printBinaryTree();

    }

    public static void printBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1,"1娃");
        HeroNode heroNode2 = new HeroNode(2,"2娃");
        HeroNode heroNode3 = new HeroNode(3,"3娃");
        HeroNode heroNode4 = new HeroNode(4,"4娃");
        HeroNode heroNode5 = new HeroNode(5,"5娃");

        //手动创建二叉树
        root.leftNode = heroNode2;
        root.rightNode = heroNode3;

        heroNode3.rightNode = heroNode4;
        heroNode3.leftNode = heroNode5;

        binaryTree.root = root;

//         //前序遍历
//        System.out.println("前序遍历"); //12354
//        binaryTree.preOrder();
//        System.out.println("中序遍历");
//        binaryTree.infixOrder();
//        System.out.println("前序遍历");
//        binaryTree.postOrder();

        //节点删除测试
//        binaryTree.preOrder();
//        System.out.println("遍历完成");
//        binaryTree.delNode(4);
//        binaryTree.preOrder();
//

        int  [] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree binaryTrees = new ArrBinaryTree(arr);
        binaryTrees.preOrder();

    }




    public static void  binarySearch(){

        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1,"1娃");
        HeroNode heroNode2 = new HeroNode(2,"2娃");
        HeroNode heroNode3 = new HeroNode(3,"3娃");
        HeroNode heroNode4 = new HeroNode(4,"4娃");
        HeroNode heroNode5 = new HeroNode(5,"5娃");

        //手动创建二叉树
        root.leftNode = heroNode2;
        root.rightNode = heroNode3;

        heroNode3.rightNode = heroNode4;
        heroNode3.leftNode = heroNode5;

        binaryTree.root = root;

        //        HeroNode heroNode = binaryTree.preOrderSearch(5); //4次
//        if (heroNode != null) {
//             System.out.println(heroNode);
//        }
//

//        HeroNode heroNode22 = binaryTree.infixOrderSearch(5); //3
//        if (heroNode22 != null) {
//            System.out.println(heroNode22);
//        }


        HeroNode heroNode33 = binaryTree.postOrderSearch(5); //2
        if (heroNode33 != null) {
            System.out.println(heroNode33);
        }

    }


}
