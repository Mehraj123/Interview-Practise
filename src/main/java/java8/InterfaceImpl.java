package java8;

public class InterfaceImpl implements InterfaceA, InterfaceB {

  public void sayHi() {
    System.out.println("Hi from Interface MainInterface");
  }

  public static void main(String[] args) {
    InterfaceImpl mainInterface = new InterfaceImpl();
    mainInterface.sayHi();
  }
}
