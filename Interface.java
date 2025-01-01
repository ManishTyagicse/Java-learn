// class - class => extends
// interface - interface => extends
// class - interface => implements

interface A{

  // all the variables should be static and final
  // final means they are initialized and can't be changed
  // static variable means that means common for all the objects and can be accessed by class name only
  int age=22;
  String area="Mumbai";

  // by default the interface methods are public abstract 
  // public abstract void show(); 
  void show();
  void config();
}

interface  X {
  void make();
}

interface Y extends X{

}

class B implements A,Y{
  // now class B should implement all the methods declared in A
  public void show(){
    System.out.println("In show method");
  }
  public void config(){
    System.out.println("In config method");
  }
  public void make(){
    System.out.println("In the make method of interface X");
  }
}
public class Interface {
  public static void main(String[] args) {
    B ob = new B();
    ob.show();
    ob.config();
    ob.make();
    System.out.println(A.age);
    System.out.println(A.area);
  } 
}
