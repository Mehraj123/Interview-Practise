package java8;

public interface InterfaceB extends InterfaceA {
  public default void sayHi() {
    System.out.println("Hi from Interface B");
  }
}
