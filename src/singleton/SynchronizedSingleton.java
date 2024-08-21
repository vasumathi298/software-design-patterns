package singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance = null;
    private static int counter = 0;

    private SynchronizedSingleton() {
        counter++;
        System.out.println("Counter is " + counter);
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
