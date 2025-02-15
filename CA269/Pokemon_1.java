import java.util.Arrays;

// only have as public the class name that corresponds to the file name;

class Pokemon_1 {

    static String GENERATION = "Gen-I";
    static final String LOCATION = "Kanto";
    static final String[] VERSIONS = { "RED", "GREEN", "YELLOW", "BLUE" };

    int health_max = 100;
    int moves_max = 5;
    String type = "";
    String name = "";

    public Pokemon_1(String name, String type, int helth_max) {

        this.name = name;
        this.type = type;

        if (health_max > 0) {
            this.health_max = health_max;
        }
    }

    public String toString() {
        return this.name + " (" + this.type + ", " + this.health_max + ")";
    }

    public static void main(String[] args) {

        System.out.println(Pokemon_2.sayHello("Java"));   
        Pokemon_2 x = new Pokemon_2("x");     
        System.out.println(x);  
        System.out.println(x.sayHello("Java"));
    }

}
////////////////////////////////////////////////////////////////////////////

class Pokemon_2 {

    static String name;

    Pokemon_2(String name) {
        this.name = name;
    }

    static String sayHello(String name) {
        return "Hello " + name;
    }

    public String toString() {
        return "Name: " + this.name;
    }
}