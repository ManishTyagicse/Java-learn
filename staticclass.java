class Mobile{
    String brand; // instance data members
    int price;
    static String name; // now it is not a data member but a class member

    static{
        name = "iphone";
    }

    void Mobile(){
        brand="";
        price=1000;
        System.out.println("in cons");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show2(){
        System.out.println(" : " + name);
    }
}

// now static keyword makes a data member common for all the objects of that class and
// to use that dm you need class name and not obj.

public class staticclass{
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="Iphone 12";

        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=1400;
        Mobile.name="Iphone 12";

        obj1.show();
        obj2.show();

        Mobile.show2();

        // STATIC BLOCK
        // now we use a constructor to initialize the data members\
        // but we only need to initialize static data member once
    }
}