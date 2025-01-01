@FunctionalInterface // only contains one method or function
// Lambda exp work only with Functional Interface
interface  A {
  void show(int i);
}
public class Lambda {
  public static void main(String[] args) {
    // now we can initialize the using anonymous class
  /* A ob = new A(){
    public void show(int i){
      System.out.println("Hi " + i);
    }
  };
  ob.show(1); */

  // or we can use lambda exp
  A ob = (int i) -> System.out.println("hi "+ i);
  ob.show(4);
  }
}
