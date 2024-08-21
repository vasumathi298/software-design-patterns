package singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance = null;
    private static int counter = 0;

    private DoubleCheckedLockingSingleton() {
        counter++;
        System.out.println("Counter is " + counter);
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
