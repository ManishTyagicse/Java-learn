enum Status{
  // enum is a class
  Running, Failed, Pending, Success; // these are named constants
}
public class Enums {
  public static void main(String[] args) {
    Status s = Status.Running;
    System.out.println(s);

    /* Status ss[] = Status.values(); // this gives an array of the enum values
    for(Status s : ss){
      System.out.println(s + " : " + s.ordinal());
    } */

    switch(s){
      case Running: System.out.println("Is in progress");
                    break;
      case Pending: System.out.println("In pending state");  
                    break;
      case Success: System.out.println("Done");
                    break;
      default: System.out.println("Not Done");
               break;
    }
  }
}
