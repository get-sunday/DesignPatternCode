package com.sunday.test.testone.trees;

public class BinaryTree {
     public HeroNode  root;

    /***
     * 前序遍历
     */
    public void  preOrder(){
        if (this.root != null) {
            this.root.preOrder();
        }
     }


     /***
     * 中序遍历
     */
    public void  infixOrder(){
        if (this.root != null) {
            this.root.infixOrder();
        }
     }


     /***
     * 后序遍历
     */
    public void  postOrder(){
        if (this.root != null) {
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空,无法遍历!");
        }
     }


     public HeroNode preOrderSearch(int no){
        return  this.root.preOrderSearch(no);
     }
     public HeroNode infixOrderSearch(int no){
        return  this.root.infixOrderSearch(no);
     }
     public HeroNode postOrderSearch(int no){
        return  this.root.postOrderSearch(no);
     }


     public  void delNode(int no){
         if (root != null) {
               if (this.root.no == no){
                    root = null;
               }else {
                   root.delNode(no);
               }
         }else {
             System.out.println("当前是空树，不能够删除!");
         }

     }



}
