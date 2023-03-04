package ninth;

import java.util.*;

public class LinkedList<E> implements ListIterator<E> {
    LinkedList<E> linkedList;

    private Node<E> head = null; // points to the head of the list
    private Node<E> tail = null; // points to the tail of the list
    private int size = 0; // the number of items in the list

    public LinkedList() {
        this.linkedList = new LinkedList<E>();
    }

    public LinkedList(int i) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("Invalid index " + i);
        }
        lastItemReturned = null;

        if (i == size) {
            index = size;
            nextItem = null;
        } else {
            nextItem = head;
            for (index = 0; index < i; index++)
                nextItem = nextItem.next;
        }
    }

    public LinkedList(LinkedList other) {
        nextItem = other.nextItem;
        index = other.index;
    }

    public void addAt(int newPosition, E newEntry) {
        ListIterator<E> iter = listIterator(newPosition);
        iter.add(newEntry);
    }

    public void addFirst(E obj) {
        addAt(0, obj);
    }

    public void addLast(E obj) {
        addAt(size, obj);
    }

    public E get(int index) {
        ListIterator<E> iter = listIterator(index);
        return iter.next();
    }

    public E getFirst() {
        return head.data;
    }

    public E getLast() {
        return tail.data;
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        E returnValue = null;
        ListIterator<E> iter = listIterator(index);
        if (iter.hasNext()) {
            returnValue = iter.next();
            iter.remove();
        } else {
            throw new IndexOutOfBoundsException();
        }
        return returnValue;
    }

    

    public Iterator iterator() {
        return new LinkedList(0);
    }

    public ListIterator listIterator() {
        return new LinkedList(0);
    }

    public ListIterator listIterator(int index) {
        return new LinkedList(index);
    }

    public ListIterator listIterator(ListIterator iter) {
        return new LinkedList((LinkedList) iter);
    }

    private static class Node<E> {
        private E data;
        private Node<E> next = null;
        private Node<E> prev = null;

        private Node(E dataItem) {
            data = dataItem;
        }
    }

    private Node<E> nextItem;
    private Node<E> lastItemReturned;
    private int index = 0;
    
    public boolean hasNext() {
        return nextItem != null;
    }

    public boolean hasPrevious() {
        return (nextItem == null && size != 0) || nextItem.prev != null;
    }

    public int previousIndex() {
        return index - 1;
    }

    public int nextIndex() {
        return index;
    }

    public void set(E o) {
    } // not implemented

    public void remove() {
    } // not implemented

    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        lastItemReturned = nextItem;
        nextItem = nextItem.next;
        index++;
        return lastItemReturned.data;
    }

    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        if (nextItem == null) {
            nextItem = tail;
        } else {
            nextItem = nextItem.prev;
        }
        lastItemReturned = nextItem;
        index--;
        return lastItemReturned.data;
    }

    public void add(E newEntry) // 새 개체를 추가합니다.
    {
        if (head == null) {
            head = new Node(newEntry);
            tail = head;
        } else if (nextItem == head) {
            Node newNode = new Node(newEntry);
            newNode.next = nextItem;
            nextItem.prev = newNode;
            head = newNode;
        } else if (nextItem == null) {
            Node newNode = new Node(newEntry);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node newNode = new Node(newEntry);
            newNode.prev = nextItem.prev;
            nextItem.prev.next = newNode;
            newNode.next = nextItem;
            nextItem.prev = newNode;
        }

        size++;
        index++;
    }

}

class Test {
    public static void main(String[] args) {

        // size 10 리스트 생성
        LinkedList<Integer> IntegerList = new LinkedList<Integer>();
        
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);
        IntegerList.add(4);
        IntegerList.add(5);
        IntegerList.add(6);
        IntegerList.add(7);
        IntegerList.add(8);
        IntegerList.add(9);
        IntegerList.add(10);

        // for (int i = 0; i < IntegerList.size(); i++) {
        //     if(IntegerList.hasNext()) {
        //         System.out.println(IntegerList.next());
        //     }            
        // }
        System.out.println(IntegerList.next());
        





    }
}
