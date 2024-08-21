package singleton;

public class SingletonRunner {
    public static void main(String[] args){

        Singelton s1= Singelton.getInstance();
        s1.printMessage("Hi This is Lakshmi");

        Singelton s2= Singelton.getInstance();
        s2.printMessage("Hi This is Madhavan");

        Singelton s3= Singelton.getInstance();
        s3.printMessage("Hi This is Sudharshan");

        Singelton s4= Singelton.getInstance();
        s4.printMessage("Hi This is Vagisan");

        Singelton s5= Singelton.getInstance();
        s5.printMessage("Hi This is Vasumathi");
    }

}
