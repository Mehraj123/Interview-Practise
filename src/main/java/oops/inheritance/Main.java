package oops.inheritance;

public class Main extends Impl {

  @Override
  public void sayHi() {
    System.out.println("from Main");
  }

  public static void main(String[] args) {
    // Main main = new Impl();
    Impl impl = new Main();
    impl.sayHi();
  }
}
