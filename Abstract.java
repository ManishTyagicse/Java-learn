// An abstract class is the one in which you can declare a method without defining it, and its child class can overide that method and can also define that method.

// If an abstract class has 3 abstract methods, then it's child class should overide and define all 3 methods. If not then the child class will also become a abstract class and then its child child class will define all abstract methods.

// An abstract class can have both abstract and non-abstract (concrete class) methods.

// We can't make an object of an abstract class.

abstract class Car{
  public abstract void drive();
  public void playMusic(){
    System.out.println("Play music");
  }
}

// one child class can extend only one abstract class

class WagonR extends Car{
  public void drive(){
    System.out.println("Drive the Car");
  }
}

public class Abstract {
  public static void main(String a[]){
    //Car c = new Car(); this will not work
    WagonR w = new WagonR();
    w.playMusic();
  }
}
