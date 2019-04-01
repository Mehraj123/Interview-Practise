package oops.polymorphism;

class ParentA {
  static void test() {
    System.out.println("ParentA static");
  }

  void test2() {
    System.out.println("ParentA Non static");
  }
}


public class WithStaticMethod extends ParentA {

  static void test() {
    System.out.println("Child static");
  }

  void test2() {
    System.out.println("child ns");
  }

  public static void main(String[] args) {
    ParentA parentA = new ParentA();
    parentA.test();
    ParentA parent11 = new WithStaticMethod();
    parent11.test2();
    parent11.test();
  }
}
