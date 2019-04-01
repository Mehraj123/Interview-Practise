package oops.inheritance;

public class Impl implements InterfaceA, InterfaceB {

  @Override
  public void sayHi() {
    System.out.println("from Impl");
  }

}
