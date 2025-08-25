
public class SLList<Item> implements List61B<Item> {

    private class Node {

        public Item item;
        public Node next;

        public Node(Item f, Node r) {
            item = f;
            next = r;
        }
    }

    private Node sentinel;
    private int size;

    public SLList(Item x) {
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    public SLList() {
        sentinel = new Node(null, null);
        size = 0;
    }

    @Override
    public void addFirst(Item x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    @Override
    public void addLast(Item x) {
        Node p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(x, null);
        size += 1;
    }

    @Override
    public Item getFirst() {
        if (size == 0) {
            return null;
        }
        return sentinel.next.item;
    }

    @Override
    public Item getLast() {
        if (size == 0) {
            return null;
        }
        Node p = sentinel.next;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    @Override
    public Item removeLast() {
        if (size == 0) {
            return null;
        }
        Node p = sentinel;
        Item result;
        while (p.next.next != null) {
            p = p.next;
        }
        result = p.next.item;
        p.next = null;
        size -= 1;
        return result;
    }

    @Override
    public Item get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        Node p = sentinel.next;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        return p.item;
    }

    @Override
    public void insert(Item x, int position) {
        if (position > size) {
            return;
        }
        Node p = sentinel;
        for (int j = 0; j < position; j++) {
            p = p.next;
        }
        Node pi = new Node(x, p.next);
        p.next = pi;
        size += 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (Node p = sentinel.next; p != null; p = p.next) {
            System.out.print(p.item + " ");
        }
        System.out.println(" ");
    }
}
