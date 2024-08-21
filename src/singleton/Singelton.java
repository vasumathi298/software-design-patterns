package singleton;

class Singelton {

    private static  int counter=0;
    private static Singelton instance =null;

    public static Singelton getInstance(){
        if(instance== null)
            instance= new Singelton();
        return instance;
    }
    private Singelton(){
        counter++;
        System.out.println("counter is "+ counter);
    }
    public void printMessage(String message){
        System.out.println(message);
    }
}
