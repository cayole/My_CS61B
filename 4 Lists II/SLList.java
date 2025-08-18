
public class SLList {

    private static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int f, IntNode r) {
            item = f;
            next = r;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList(int x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList() {
        sentinel = new IntNode(0, null);
        size = 0;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    public int size() {
        return size;
    }

    /*     private int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }
     */
    public static void main(String[] args) {
        SLList L = new SLList(5);
        System.out.println(L.getFirst());
        L.addFirst(10);
        System.out.println(L.getFirst());
        L.addLast(15);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}
