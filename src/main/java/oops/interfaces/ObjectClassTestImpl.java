package oops.interfaces;

import java.io.Serializable;
import java.rmi.server.ObjID;

public class ObjectClassTestImpl implements ObjectClassTest {

    public static void main(String[] args) {
        ObjectClassTest inter = new ObjectClassTestImpl();
        System.out.println(inter.getClass().getName());
        Serializable serializable = "";
        System.out.println(serializable.getClass().getName());
        /*Serializable serializable1 = new Object();
        System.out.println(serializable.getClass().getName());*/

    }
}
