package Singleton;

public class SingletonDome {

    public static void main(String[] args) {
        Singleton_design_patterns s = Singleton_design_patterns.getInstance();
        s.setName("hello");
        Singleton_design_patterns s1 = Singleton_design_patterns.getInstance();
        Singleton_design_patterns s2 = Singleton_design_patterns.getInstance();
        System.out.println(s.getName());
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}
