package second;

public class Stack {
    int[] array;
    int index = 0;

    public Stack() {
        this.array = new int[10];
    }

    public void push(int i) {
        this.array[index] = i;
        index++;
    }
    
    public int pop() {
        int result = this.array[index--];
        return result;
    }

}
