package singleton;

public enum EnumSingleton {

    INSTANCE;

    private EnumSingleton() {

    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
