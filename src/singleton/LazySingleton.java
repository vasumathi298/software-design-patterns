package singleton;

public class LazySingleton {

    private static LazySingleton instance = null;
    private static int counter = 0;

    private LazySingleton() {
        counter++;
        System.out.println("Counter is " + counter);
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
