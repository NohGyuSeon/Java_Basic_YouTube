import java.util.Arrays;
import java.util.Iterator;

/*
 * *** Node ADT ***
 * Constructors
 * Node (number) :  숫자 형태의 값을 입력받아 새로운 Node 객체를 생성할 수 있어야한다. 이전 노드와 다음 노드를 기본값 null로 가진다. 
 * 
 * Access
 * hasNext() : 다음 노드가 연결되어 있는지 여부를 반환합니다.
 * hasPrev() : 이전 노드가 연결되어 있는지 여부를 반환합니다.
 * getNext() : 다음 노드 객체를 반환합니다.
 * getPrev() : 이전 노드 객체를 반환합니다.
 */

/*
 * ** LinkedList 요구사항 **
 * 1. LinkedList는 데이터를 컬렉션으로 포함하는데, 각 컬렉션은 Node라는 이름의 클래스로 구현됩니다.
 * 2. LinkedList는 모든 숫자 형태의 값을 가질 수 있어야 합니다.
 * 3. LinkedList는 foreach 문에서 모든 노드를 순환하며 표시할 수 있어야 합니다.
 * 4. LinkedList는 포함한 값을 오름차순으로 정렬할 수 있어야 합니다.
 */

 /*
  * 노드가 Number값을 입력받음. LinkedList는 노드들만 연결해줌.
  */

@SuppressWarnings("rawtypes")
public final class LinkedList implements Iterable<Node> {
    private Node head;
    private Node tail;
    private Node curNode;
    private int size;

    public LinkedList() { }

    public void add(Node node) {
        // [x] 끝에 Node를 추가한다. 
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        curNode = head;

        while (curNode.hasNext()) {
            curNode = curNode.getNext();
        }
        curNode.next = node;
        node.prev = curNode;
        tail = node;
        size++;
    }

    public void addAt(int idx, Node node) {
        // [x] 정해진 위치에 Node를 추가한다. 기존에 있던 노드를 뒤로 밀려난다.
        Node oldNode = getEntry(idx);
        Node newNode = (node.next != null || node.prev != null) ? new Node(node.item) : node; // 다른 노드와 연결된 노드인지 확인
        if (idx == 0) {
            newNode.next = oldNode;
            oldNode.prev = newNode;
            head = newNode;
        } else {
            // 기존의 노드의 왼쪽과 새로운 노드와 연결
            oldNode.prev.next = newNode;
            newNode.prev = oldNode.prev;
            // 새로운 노드의 오른쪽에 기존의 노드 연결
            newNode.next = oldNode;
            oldNode.prev = newNode;
        }
        size++;
    }

    public void remove(int idx) {
        // [x] 정해진 위치에 Node를 삭제한다.
        Node oldNode;
        if (idx == 0) {
            head = head.next;
            head.prev = null;
        } else if (idx == size-1) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            oldNode = getEntry(idx);
            oldNode.prev.next = oldNode.next;
            oldNode.next.prev = oldNode.prev;
        }
        oldNode = null;
        size--;
    }

    public void clear() {
        // [x] 모든 노드를 삭제한다.
        // -> 모든 노드 순회하면서 모든 값에 null 처리. 마지막값 저장이 필요함.
        curNode = head;
        while (curNode.hasNext()) {
            Node nextNode = curNode.getNext();
            curNode.next = null;
            curNode.item = null;
            curNode.prev = null;
            curNode = nextNode;
        }
        head = tail = null;
        curNode = null;
        size = 0;
    }

    public void replace(int idx, Node newNode) {
        // [x] 정해진 위치에 노드를 입력받은 노드로 변경한다.
        // 해당 인덱스 노드의 데이터만 변경
        Node oldNode = getEntry(idx);
        oldNode.item = newNode.item;
    }
 
    public Node getEntry(int idx) {
        // [x] idx번째 노드를 반환
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (idx < size/2) {
            // 앞에서 뒤로 탐색
            curNode = head;
            for (int i = 0; i < idx; i++) {
                curNode = curNode.next; 
            }
        } else {
            // 뒤에서 앞으로 탐색
            curNode = tail;
            for (int i = size-1; i > idx; i--) {
                curNode = curNode.prev;
            }
        }
        return curNode;
    }

    public Node getEntry() {
        Node result = tail;
        remove(size-1);
        return result;
    }

    public int size() {
        // [x] 컬렉션의 크기를 반환한다.
        return this.size;
    }

    public void sort() {
        // [x] 노드의 값기준으로 오름차순 정렬한다.
        curNode = head;
        Node[] nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = curNode;
            curNode = curNode.next;
        }
        Arrays.sort(nodes, ((x, y) -> x.compareTo(y)));
        nodes[0].prev = null;
        nodes[size-1].next = null;

        for (int i=0; i < size-1; i++) {
            nodes[i].next = nodes[i+1]; // 앞에서 뒤로 연결
        }
        for (int i=size-1; i > 0; i--) {
            nodes[i].prev = nodes[i-1]; // 뒤에서 앞으로 연결
        }
        
        head = nodes[0];
    }

    @Override
    public Iterator<Node> iterator() {
        // [x] foreach문으로 출력
        return new NodeIterator(head);
    }
}

class Node<T extends Number> implements Comparable<Node> {
    Node<T> prev;
    Node<T> next;
    T item;

    public Node(T item) {
        this.item = item;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public boolean hasPrev() {
        return this.prev != null;
    }

    public Node<T> getPrev() {
        return this.prev;
    }

    @Override
    public int compareTo(Node y) {
        return this.item.intValue() - y.item.intValue();
    }
}

class NodeIterator implements Iterator {                         
    // ISSUE: 첫번째값을 출력안함. => 첫번째 값 null값지정하여 해결
    Node node = new Node(null);

    public NodeIterator(Node node) {
        this.node.next = node;
    }

    @Override
    public boolean hasNext() {
        return node.hasNext();
    }

    @Override
    public Node next() {
        node = node.getNext();
        return node;
    }
}

class Test {
    public static void main(String[] args) {
    

        Node<Long> node = new Node<>(Long.parseLong("5"));
        Node<Long> node2 = new Node<>(Long.parseLong("4"));
        Node<Long> node3 = new Node<>(Long.parseLong("3"));
        Node<Long> node4 = new Node<>(Long.parseLong("2"));
        Node<Long> node5 = new Node<>(Long.parseLong("1"));
        Node<Long> node6 = new Node<>(Long.parseLong("3"));
        
        LinkedList linkedList = new LinkedList();
        linkedList.add(node);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        linkedList.add(node5);
        linkedList.add(node6);

        System.out.println("Before sort");
        for (Node n: linkedList) {
            System.out.println(n.item);
        }
        System.out.println();

        System.out.println("After sort");
        linkedList.sort();
        for (Node n: linkedList) {
            System.out.println(n.item);
        }

        
        for (Node n: linkedList) {
            System.out.println(n.item);
        }

        
    }
}