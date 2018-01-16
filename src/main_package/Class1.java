package main_package;

import main_package.Class2;

public class Class1 extends Class2 {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " " + str());
        }
    }

    public Class1(int i) {
        super(i);
    }

    public int iii(int o) {
        return o;
    }

    public int i(int p) {
        return p;
    }
}
