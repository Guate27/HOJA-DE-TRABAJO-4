import java.util.Vector;
class VectorStack<T> extends AbstractStack<T> {
    private Vector<T> stack;

    public VectorStack() {
        stack = new Vector<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) return null;
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}