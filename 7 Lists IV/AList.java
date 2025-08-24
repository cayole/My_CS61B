
public class AList<Glorp> {

    private Glorp[] items;
    private int size;

    public AList() {
        items = (Glorp[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity) {
        Glorp[] a = (Glorp[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void addLast(Glorp x) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    public Glorp getLast() {
        if (size > 0) {
            return items[size - 1];
        } else {
            return null;
        }
    }

    public Glorp get(int i) {
        if (i >= 0 && i < size) {
            return items[i];
        } else {
            return null;
        }
    }

    public int size() {
        return size;
    }

    public Glorp removeLast() {
        if (size > 0) {
            Glorp x = getLast();
            items[size - 1] = null;
            size -= 1;
            return x;
        } else {
            return null;
        }
    }
}
