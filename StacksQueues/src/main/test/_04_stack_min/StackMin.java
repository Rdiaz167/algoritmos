
import java.util.ArrayDeque;
import java.util.Deque;


/*
 * ¿Cómo diseñarías un Stack que además de las operaciones de push y pop también
 * contase con una operación para obtener el mínimo?
 */

public class StackMin {

    private Deque<Integer> valuesStack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();

    public void push(Integer data) {
        valuesStack.push(data);
        if(minStack.isEmpty() || data < minStack.peek()) {
            minStack.push(data);
        }
    }

    public int pop() {
        int value = valuesStack.pop();
        if(value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    public int min() {
        return minStack.peek();
    }
}
