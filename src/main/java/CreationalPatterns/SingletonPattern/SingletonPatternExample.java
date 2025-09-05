package CreationalPatterns.SingletonPattern;

class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton(){
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance(){
        if(instance == null){
            System.out.println("Creating first instance");
            return new Singleton();
        }
        System.out.println("Fetching instance");
        return instance;
    }
}

public class SingletonPatternExample {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }




}
