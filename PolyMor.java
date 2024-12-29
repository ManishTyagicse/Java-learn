class A{
    public void show(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In class B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In class C");
    }
}

public class PolyMor{
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        obj = new B(); // this technique of referencing the object with other name and creating object of other class is called
                        // Dynamic method dispatch in the Polymorphism
                        // A ob = new B(); this is reference of A and object of B
        obj.show();

        obj = new C();
        obj.show();
    }
}