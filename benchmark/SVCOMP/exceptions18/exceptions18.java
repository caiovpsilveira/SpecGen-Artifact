class A extends RuntimeException {}

class B extends A {}

public class exception18 {
  private static void foo() {
    A a = new A();
    throw a;
  }

  public static void main(String[] args) {
    try {
      foo();
      assert false;
    } catch (B e) {
      assert false;
    } catch (A e) {
      // expected here
    }
  }
}
