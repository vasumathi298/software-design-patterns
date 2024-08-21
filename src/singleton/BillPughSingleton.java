package singleton;

public class BillPughSingleton {

    private static int counter = 0;

    private BillPughSingleton() {
        counter++;
        System.out.println("Counter is " + counter);
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
