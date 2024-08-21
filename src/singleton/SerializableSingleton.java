package singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final SerializableSingleton instance = new SerializableSingleton();
    private static int counter = 0;

    private SerializableSingleton() {
        counter++;
        System.out.println("Counter is " + counter);
    }

    public static SerializableSingleton getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
