package Singleton;

public class Singleton_design_patterns {

    private static Singleton_design_patterns single = new Singleton_design_patterns();
    private String name;

    private Singleton_design_patterns() {
    }

    public static Singleton_design_patterns getInstance() {
        if (single == null) {
            return new Singleton_design_patterns();
        }
        return single;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
