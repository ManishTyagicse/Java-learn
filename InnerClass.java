/* class A{
  int age;

  public void show(){
    System.out.println("In class Outer");
  }

  class B{
    public void config(){
      System.out.println("In inner class");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    A a = new A();
    a.show();

    // In order to call the inner class

    A.B b = a.new B();
    b.config();
  }
} */

// now using static class

class A{
  int age;

  public void show(){
    System.out.println("In class Outer");
  }

  // you can only make inner class static and not the outer main class static
  static class B{
    public void config(){
      System.out.println("In inner class");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    A a = new A();
    a.show();

    // In order to call the inner class

    A.B b = new A.B();
    b.config();
  }
}
