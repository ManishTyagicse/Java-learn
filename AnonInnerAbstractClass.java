abstract class A{

  // This is an abstract class means you can't create its object
  public abstract void show();
  public abstract void config();
  // and in abstract class you need not to define it, you just need to declare it.
}

/* // first approach by making a child class
class B extends A{
  public void show(){
    System.out.println("Overridden the show method of A class");
  }
} */

public class AnonInnerAbstractClass {
  public static void main(String[] args) {
      A ob = new A(){
        public void show(){
          System.out.println("Overriddden method show in the anonymous inner class");
        }
        public void config(){
          System.out.println("Overriddden method config in the anonymous inner class");
        }
      };

      ob.show();
      ob.config(); 
  }
}
