package java8;

public class InterfaceImpl implements InterfaceA, InterfaceB {

  public void sayHi() {
    System.out.println("Hi from Interface InterfaceImpl");
  }

  public static void main(String[] args) {
    InterfaceImpl mainInterface = new InterfaceImpl();
    mainInterface.sayHi();
  }
}
