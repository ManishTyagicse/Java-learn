class A extends Object{  // every super class or class extends the Object class in java
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("In A int n");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("In B");
    }

    public B(int n){
        this();
        System.out.println("In B int n");
    }
}

public class thisAndSuper{
    public static void main(String a[]){
        B ob = new B(5);
    }
}

// this() and super() are always the first line of the constructor body
// either this() or super() is used
// this() calls the default constructor of the same class
// this(n) calls the parameterized constructor of the same class
// super() calls the default constructor of the super class
// super(n) calls the parameterized constructor of the super class