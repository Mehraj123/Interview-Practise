package exception;

public class ErrorHandleTest {
  public static void main(String[] args) {
    try {
      throw new StackOverflowError("Hey!");
    } catch (Error e) {
      System.out.println("Error cought " + e);
    }
  }
}
