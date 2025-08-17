
public class Walrus {

    int weight;
    double tuckSize;

    public Walrus(int weight, double tuckSize) {
        this.weight = weight;
        this.tuckSize = tuckSize;
    }

    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b = a;
        b.weight = 5;
        System.out.println(a.weight);
        System.out.println(b.weight);

        int x = 5;
        int y;
        y = x;
        x = 2;
        System.out.println(x);
        System.out.println(y);
    }
}
