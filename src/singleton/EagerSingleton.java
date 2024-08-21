package singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    private static int counter = 0;

    private EagerSingleton() {
        counter++;
        System.out.println("Counter is " + counter);
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
