// package Test3;

// import java.util.*;

// public class LinkedList<E extends Number> {
//     private Node<E> head = null;
//     private Node<E> tail = null;
//     private int size = 0;

//     public void add(E newEntry) {
//         ListIterator<E> iter = listIterator();
//         iter.add(newEntry);
//     }

//     public void addAt(int position, E newEntry) {
//         ListIterator<E> iter = listIterator(position);
//         iter.add(newEntry);
//     }

//     public E remove(int position) {
//         E result = null;
//         ListIterator<E> iter = listIterator(position);
//         if (iter.hasNext()) {
//             result = iter.next();
//             iter.remove();
//             --size;
//         } else {
//             throw new IndexOutOfBoundsException("배열의 범위 오류가 발생했습니다!");
//         }
//         return result;
//     }

//     public void getEntry() {

//     }

//     public void clear() {
//         for (Node<E> value = head; value != null;) {
//             Node<E> nextNode = value.next;
//             value.data = null;
//             value.next = null;
//             value.prev = null;
//             value = nextNode;
//         }
//         head = tail = null;
//         size = 0;
//     }

//     public void replace(int newPosition, E newEntry) {

//     }

//     public E getEntry(int position) {
//         ListIterator<E> iter = listIterator(position);
//         return iter.next();
//     }

//     public int size() {
//         return size;
//     }

//     public void sort() {

//     }

//     public void addFirst(E newEntry) {
//         addAt(0, newEntry);
//     }

//     public void addLast(E neWEntry) {
//         addAt(size, neWEntry);
//     }

//     public E getFirst() {
//         return head.data;
//     }

//     public E getLast() {
//         return tail.data;
//     }

//     public Iterator iterator() {
//         return new DoubleList(0);
//     }

//     public ListIterator listIterator() {
//         return new DoubleList(0);
//     }

//     public ListIterator listIterator(int position) {
//         return new DoubleList(position);
//     }

//     public ListIterator listIterator(ListIterator iter) {
//         return new DoubleList((DoubleList) iter);
//     }

//     public void printAll() {
//         if (this.head != null) {
//             System.out.println(this.head.data);
//             Node node = this.head;
//             while (node.next != null) {
//                 node = node.next;
//                 System.out.println(node.data);
//             }
//         }
//     }

//     // 노드 클래스
//     private static class Node<E> {
//         private E data;
//         private Node<E> next = null;
//         private Node<E> prev = null;

//         private Node(E dataItem) {
//             data = dataItem;
//         }
//     }

//     public class DoubleList implements ListIterator<E> {
//         private Node<E> nextItem;
//         private Node<E> lastItemReturned;
//         private int position = 0; //

//         public DoubleList() {
//             lastItemReturned = null;
//         }

//         public DoubleList(int i) {
//             if (i < 0 || i > size) {
//                 throw new IndexOutOfBoundsException("유효하지 않는 위치 값: " + i);
//             }
//             lastItemReturned = null;

//             if (i == size) {
//                 position = size;
//                 nextItem = null;
//             } else {
//                 nextItem = head;
//                 for (position = 0; position < i; position++)
//                     nextItem = nextItem.next;
//             }
//         }

//         public DoubleList(DoubleList other) {
//             nextItem = other.nextItem;
//             position = other.position;
//         }

//         @Override  
//         public boolean hasNext() {
//             return nextItem != null;
//         }

//         @Override
//         public boolean hasPrevious() {
//             return (nextItem == null && size != 0) || nextItem.prev != null;
//         }

//         @Override
//         public int previousIndex() {
//             return position - 1;
//         }

//         @Override
//         public int nextIndex() {
//             return position;
//         }

//         @Override
//         public void set(E o) {
//         }

//         @Override
//         public void remove() {
            
//         }

//         @Override
//         public E next() {
//             if (!hasNext()) {
//                 throw new NoSuchElementException();
//             }
//             lastItemReturned = nextItem;
//             nextItem = nextItem.next;
//             position++;
//             return lastItemReturned.data;
//         }

//         @Override
//         public E previous() {
//             if (!hasPrevious()) {
//                 throw new NoSuchElementException();
//             }
//             if (nextItem == null) {
//                 nextItem = tail;
//             } else {
//                 nextItem = nextItem.prev;
//             }
//             lastItemReturned = nextItem;
//             position--;
//             return lastItemReturned.data;
//         }

//         @Override
//         public void add(E newEntry) {
//             if (head == null) {
//                 head = new Node(newEntry);
//                 tail = head;
//             } else if (nextItem == head) {
//                 Node newNode = new Node(newEntry);
//                 newNode.next = nextItem;
//                 nextItem.prev = newNode;
//                 head = newNode;
//             } else if (nextItem == null) {
//                 Node newNode = new Node(newEntry);
//                 tail.next = newNode;
//                 newNode.prev = tail;
//                 tail = newNode;
//             } else {
//                 Node newNode = new Node(newEntry);
//                 newNode.prev = nextItem.prev;
//                 nextItem.prev.next = newNode;
//                 newNode.next = nextItem;
//                 nextItem.prev = newNode;
//             }
//             size++;
//             position++;
//         }
//     }
// }

// class Test {

//     public static void main(String[] args) {

//         LinkedList<Integer> MyLinkedList = new LinkedList<Integer>();

//         MyLinkedList.add(1);
//         MyLinkedList.add(2);
//         MyLinkedList.add(3);
//         MyLinkedList.add(4);
//         MyLinkedList.add(5);
//         MyLinkedList.printAll();
//         System.out.println("====================");

//         MyLinkedList.addAt(3, 100);
//         MyLinkedList.printAll();
//         System.out.println("====================");

//         MyLinkedList.remove(3);
//         MyLinkedList.printAll();
//         System.out.println("====================");

//         System.out.println(MyLinkedList.size());
//         System.out.println("====================");

//         System.out.println(MyLinkedList.getEntry(3));
//         System.out.println("====================");

//         MyLinkedList.clear();
//         MyLinkedList.printAll();
//         System.out.println();
//         System.out.println("====================");

//     }
// }