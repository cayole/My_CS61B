
public interface List61B<Item> {

    public void addFirst(Item x);

    public void addLast(Item x);

    public Item getFirst();

    public Item getLast();

    public Item removeLast();

    public Item get(int i);

    public void insert(Item x, int position);

    public int size();

    default public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List61B<String> AL = new AList<>();
        System.out.println(AL.getFirst());
        System.out.println(AL.getLast());
        System.out.println(AL.get(1));
        System.out.println(AL.removeLast());

        AL.insert("the", 0);
        System.out.println(AL.getFirst());
        System.out.println(AL.getLast());

        AL.addFirst("What");
        System.out.println(AL.getFirst());
        System.out.println(AL.getLast());

        AL.addLast("doing");
        AL.insert("dog", 2);
        System.out.println(AL.getFirst());
        System.out.println(AL.getLast());

        AL.addLast("?");
        AL.print();
        System.out.println(AL.size());

        System.out.println(AL.removeLast());
        System.out.println(AL.size());

        List61B<String> SL = new SLList<>();
        System.out.println(SL.getFirst());
        System.out.println(SL.getLast());
        System.out.println(SL.get(1));
        System.out.println(SL.removeLast());

        SL.insert("the", 0);
        System.out.println(SL.getFirst());
        System.out.println(SL.getLast());

        SL.addFirst("What");
        System.out.println(SL.getFirst());
        System.out.println(SL.getLast());

        SL.addLast("doing");
        SL.insert("dog", 2);
        System.out.println(SL.getFirst());
        System.out.println(SL.getLast());

        SL.addLast("?");
        SL.print();
        System.out.println(SL.size());

        System.out.println(SL.removeLast());
        System.out.println(SL.size());
    }
}
