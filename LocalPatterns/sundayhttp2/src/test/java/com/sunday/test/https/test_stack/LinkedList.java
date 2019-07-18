package com.sunday.test.https.test_stack;

public class LinkedList<E> {

    Node<E> first;
    Node<E> last;

    int size;




    public LinkedList(Node<E> first, Node<E> last) {
        this.first = first;
        this.last = last;
    }


    public void remove(int index,E e){

    }


    private static class  Node<E>{
        E item;
        Node<E> prev;
        Node<E> next;

        public Node( Node<E> prev,E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

}
