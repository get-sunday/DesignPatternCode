package com.sunday.test.https.datastructor;

import android.text.GetChars;
import android.text.InputFilter;

import org.w3c.dom.Node;

/**
 * 自定义的LinkedList
 *
 * add
 * add
 */
public class SundayLink<M> {


    private Node<M> first;
    private Node<M> last;
    public int size;


    public void add(M m){
        addLast(m);

    }


    public void addLast(M m){
        Node<M> newNode = new Node<>(last,m,null);
        Node<M> l = last;
        last = newNode;

        if (l == null){
            first = newNode;
        }else {
            l.next = newNode;
        }
        size++;

    }

    public Node<M> node(int index){

        Node<M> newNode;
        if (index < (size>>1)){
            newNode = first;
            for (int i = 0; i < index; i++){
                newNode = newNode.next;
            }
        }else {
            newNode = last;
            for (int i = size -1; i > index;i--){
                 newNode = newNode.prev;
            }
        }
        return newNode;
    }

    public M get(int index){
        if (index < 0 || index > size){
            return null;
        }
        return node(index).m;
    }


    public void add(int index,M m){

        if (index == size){
            addLast(m);
        }else {

            Node news = node(index);
            Node prev =  news.prev;
            Node<M> newNode = new Node<>(prev,m,news);

            if (prev == null){
                first = newNode;
                news.prev = newNode;

            }else {
                news.prev.next =newNode;
                news.prev  = newNode;
            }
            size++;
        }


    }


    public static class  Node<M>{
        public  Node<M> prev;
        public  Node<M> next;
        public  M m;

        public Node(Node prev,M m, Node next){
            this.prev = prev;
            this.m = m;
            this.next = next;
        }



    }
}
