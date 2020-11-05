package chapter10;

import chapter10.Task6.InterfaceTask6;
import chapter10.Task6.SecondPackage.InnerTask6;

public class Problem6 extends InnerTask6 {

    public InterfaceTask6 getInnerProtected(){
        return new Inner();
    }
}
