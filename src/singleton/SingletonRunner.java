package singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        EagerSingleton s1 = EagerSingleton.getInstance();
        s1.printMessage("Hi, this is Vasumathi");

        LazySingleton s2 = LazySingleton.getInstance();
        s2.printMessage("Hi, this is Madhavan");

        SynchronizedSingleton s3 = SynchronizedSingleton.getInstance();
        s3.printMessage("Hi, this is Sudharshan");

        DoubleCheckedLockingSingleton s4 = DoubleCheckedLockingSingleton.getInstance();
        s4.printMessage("Hi, this is Vagisan");

        BillPughSingleton s5 = BillPughSingleton.getInstance();
        s5.printMessage("Hi, this is Lakshmi");

        EnumSingleton.INSTANCE.printMessage("Hi, this is EnumSingleton");

        SerializableSingleton s6 = SerializableSingleton.getInstance();
        s6.printMessage("Hi, this is SerializableSingleton");
    }
}
