/*
// ENCAPSULATION

class human{
    private int age;
    private String name;
    //  by default these values are 0 and null

    // you should always make your data members private and
    // external user should only access them using methods only
    // encapsulation means getting the data members not directly but through methods

    // This keyword points to the object accessing the methods currently and
    // is provided by java
    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

// class, interface - Calc,Runable
// variables and method - marks, show()
// constants - PIE, BRAND

public class OOPSclass{
    public static void main(String a[]){
        human obj = new human();

        obj.setAge(22);
        obj.setName("Manish");

        System.out.println(obj.getAge() + " ");
        System.out.println(obj.getName() + " ");
    }
}*/


// INHERITANCE

class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvCalc extends Calc{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

// Java doesn't support multiple inheritance

public class OOPSclass{
    public static void main(String a[]){
        AdvCalc ob = new AdvCalc();
        int r1 = ob.add(10,12);
        int r2 = ob.sub(12,10);
        int r3 = ob.mul(10,12);
        int r4 = ob.div(12,2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}