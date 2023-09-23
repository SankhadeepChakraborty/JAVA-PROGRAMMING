import java.util.*;

public class Method1 {

    String name;
    int age;
    String haircolor;

    Method1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Method1(String name, int age, String haircolor) {
        this(name, age);
        this.haircolor = haircolor;

    }

    void display1() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(haircolor);

    }

    void display2() {
        this.display1();
        System.out.println("Run the display2");
    }

    public static void main() {
        Method1 mo = new Method1("Sankha", 18, "black");
        mo.display2();

    }
}
