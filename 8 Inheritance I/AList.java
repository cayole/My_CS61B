
public class AList<Item> implements List61B<Item> {

    private Item[] items;
    private int size;

    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    @Override
    public void addFirst(Item x) {
        if (size == items.length) {
            resize(size * 2);
        }
        System.arraycopy(items, 0, items, 1, size);
        items[0] = x;
        size += 1;
    }

    @Override
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    @Override
    public Item getFirst() {
        if (size > 0) {
            return items[0];
        } else {
            return null;
        }
    }

    @Override
    public Item getLast() {
        if (size > 0) {
            return items[size - 1];
        } else {
            return null;
        }
    }

    @Override
    public Item removeLast() {
        if (size > 0) {
            Item x = getLast();
            items[size - 1] = null;
            size -= 1;
            return x;
        } else {
            return null;
        }
    }

    @Override
    public Item get(int i) {
        if (i >= 0 && i < size) {
            return items[i];
        } else {
            return null;
        }
    }

    @Override
    public void insert(Item x, int position) {
        if (size == items.length) {
            resize(size * 2);
        }
        System.arraycopy(items, position, items, position + 1, size - position);
        items[position] = x;
        size += 1;
    }

    @Override
    public int size() {
        return size;
    }
}
