class A{
  public void show(){
    System.out.println("In class A");
  }
}

public class AnonInnerClass {
  public static void main(String a[]){
    // now i want to override the working of the show() method without creating a child class to overide the method beacuse i know that class would only be used once.

    A ob = new A(){
      public void show(){
        System.out.println("Overrided method show");
      }
    };

    ob.show();
  }
}