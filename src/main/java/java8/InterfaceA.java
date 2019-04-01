package java8;

public interface InterfaceA {
  public default void sayHi() {
    System.out.println("Hi from Interface A");
  }
}
