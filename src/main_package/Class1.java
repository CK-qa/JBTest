package main_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Class1 extends Class2  {

    Class1(int i) {
        super(i);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " " + str());
        }
        foo();
    }

    @Override
    public String toString() {
        return "Class1{}";
    }

    public int iii(int o) {
        return o;
    }

    public int i(int p) {
        return p;
    }

    private static void foo() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(list);
    }

}
