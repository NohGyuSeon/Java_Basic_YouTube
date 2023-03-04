package fifth;

public class Stack<T> implements Stackable<T> {
    Object[] items;
    int lastIndex = 0;
    
    public Stack(int size) {
        this.items = new Object[size];
    }
    
    @Override
    public void push(T i) {
        this.items[lastIndex++] = (T)i;
    }

    @Override
    public T pop() {
        return (T)items[--lastIndex];
    }
    
}

class TypeMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(3); 
        Stack<String> stack2 = new Stack<String>(3);

        stack.push(2);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
    
        stack2.push("NGS");
        stack2.push("CMS");
        stack2.push("HDH");
        stack2.pop();
        stack2.pop();
        stack2.pop();

    }

}