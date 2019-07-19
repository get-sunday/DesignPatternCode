package com.sunday.test.testone.trees;

public class HeroNode {

    public  int no;
    public  String name;
    public  HeroNode leftNode;
    public  HeroNode rightNode;

     //线索链表字段
    //lefttype == 0 指向的左子树，1则是前驱节点
    //rightType == 0 指向的左子树，1则是后继节点
    public  int leftType ;
    public  int rightType;


    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }


    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 前序遍历
     */
    public void  preOrder(){
        System.out.println(this); //先输出root节点

        //递归遍历左子树
        if (this.leftNode != null) {
             this.leftNode.preOrder();
        }
        //递归遍历右子树
        if (this.rightNode != null) {
             this.rightNode.preOrder();
        }

    }

    /**
     * 中序遍历
     */
    public void  infixOrder(){


        //递归遍历左子树
        if (this.leftNode != null) {
            this.leftNode.infixOrder();
        }
        System.out.println(this); //先输出root节点

        //递归遍历右子树
        if (this.rightNode != null) {
            this.rightNode.infixOrder();
        }

    }

    /**
     * 后序遍历
     */
    public void  postOrder(){


        //递归遍历左子树
        if (this.leftNode != null) {
            this.leftNode.postOrder();
        }

        //递归遍历右子树
        if (this.rightNode != null) {
            this.rightNode.postOrder();
        }

        System.out.println(this); //输出root节点

    }

    public HeroNode preOrderSearch(int no){
        System.out.println(this); //先输出root节点
        if (this.no == no) {
            return this;
        }

        HeroNode resNode = null;
        if (this.leftNode != null) {
              resNode = this.leftNode.preOrderSearch(no);
        }

        if (resNode != null) {
            return resNode;
        }

        if (this.rightNode != null) {
             resNode =  this.rightNode.preOrderSearch(no);
        }

        return resNode;

    }

    public HeroNode infixOrderSearch(int no){

        HeroNode resNode = null;
        if (this.leftNode != null) {
            resNode = this.leftNode.infixOrderSearch(no);
        }

        if (resNode != null) {
            return resNode;
        }

        System.out.println("进入中序查找"); //先输出root节点
        if (this.no == no) {
            return this;
        }

        //否则继续进行有递归的中序查找
        if (this.rightNode != null) {
            resNode =  this.rightNode.infixOrderSearch(no);
        }

        return resNode;

    }

    public HeroNode postOrderSearch(int no){

        HeroNode resNode = null;
        if (this.leftNode != null) {
            resNode = this.leftNode.postOrderSearch(no);
        }

        if (resNode != null) {
            return resNode;
        }



        //否则继续进行有递归的中序查找
        if (this.rightNode != null) {
            resNode =  this.rightNode.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }

        System.out.println("进入后序查找"); //先输出root节点
        if (this.no == no) {
            return this;
        }

        return resNode;

    }

    //如果的配置的方式的
    public void  delNode(int no){
        //如果当前结点的左子节点不为空，并且子左节点就是要删除的节点，就left =  nl;
        if (this.leftNode != null && this.leftNode.no  == no) {
             this.leftNode = null;
             return;
        }

        //同理可得
        if (this.rightNode != null && this.rightNode.no == no) {
             this.rightNode = null;
             return;
        }

        //则我们需要递归进行删除
        if (this.leftNode != null) {
             this.leftNode.delNode(no);
        }

        if (this.rightNode != null) {
             this.rightNode.delNode(no);
        }



    }





}
