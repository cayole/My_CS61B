
public class SLList<Pineapple> {

    private class IntNode {

        public Pineapple item;
        public IntNode next;

        public IntNode(Pineapple f, IntNode r) {
            item = f;
            next = r;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList(Pineapple x) {
        sentinel = new IntNode(null, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList() {
        sentinel = new IntNode(null, null);
        size = 0;
    }

    public void addFirst(Pineapple x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public Pineapple getFirst() {
        return sentinel.next.item;
    }

    public void addLast(Pineapple x) {
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

    public static void main(String[] args) {
        SLList<String> L = new SLList<>();
        L.addLast("what");
        L.addLast("the");
        L.addLast("dog");
        L.addLast("doing");
        System.out.println(L.getFirst());

        SLList<Integer> L2 = new SLList<>();
        L2.addLast(5);
        System.out.println(L2.getFirst());
    }
}
