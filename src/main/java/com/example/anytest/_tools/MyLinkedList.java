package com.example.anytest._tools;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

/**
 * @author gongchengship@163.com
 */
public class MyLinkedList<E> implements Collection<E> {

    private Node node;

    transient int size = 0;

    public MyLinkedList() {
        this.node = new Node(null, null, null);
    }



    @Override
    public boolean add(E e) {
        if (null == this.node) {
            this.node.item = e;
        } else {
            Node<E> newNode = new Node(null, e, null);
            this.node.next = newNode;
            newNode.prev = this.node;

        }
        this.size++;
        return true;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private class Node<E> {
        Node<E> prev;
        E item;
        Node<E> next;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}


