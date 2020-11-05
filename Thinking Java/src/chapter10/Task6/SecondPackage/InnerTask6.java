package chapter10.Task6.SecondPackage;

import chapter10.Task6.InterfaceTask6;

public class InnerTask6 {

    protected class Inner implements InterfaceTask6 {

        public Inner(){};

        @Override
        public void printHello() {
            System.out.println("Hello, from chapter10.Task6.SecondPackage.InnerTask6.Inner");
        }
    }
}
