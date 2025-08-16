
public class DogLauncher {

    public static void main(String[] args) {
        Dog smallDog;
        // new Dog(20);
        smallDog = new Dog(5);
        Dog hugeDog = new Dog(150);
        smallDog.makeNoise();
        hugeDog.makeNoise();

        Dog chester = new Dog(17);
        Dog yusuf = new Dog(150);

        Dog larger = Dog.maxDog(chester, yusuf);
        larger.makeNoise();

        Dog larger2 = chester.maxDog(yusuf);
        larger2.makeNoise();

        System.out.println(Dog.binomen);
        System.out.println(chester.binomen);
    }
}
