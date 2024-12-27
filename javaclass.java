/*
class calc{
    public int add(int n1, int n2){
        int r = n1+n2;
        return r;
    }
}

public class javaclass {
    public static void main(String a[]){
        System.out.println("Hello world");

        int n1=10,n2=20;

        calc c1 = new calc();

        int res = c1.add(n1,n2);
        System.out.println(res);
    }
}*/

public class javaclass {
    public static void main(String a[]){
        System.out.println("Hello world");

        int n1=10,n2=20;

        calc c1 = new calc();

        int res = c1.add(n1,n2);
        System.out.println(res);

        // arrays
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int nums[][] = new int[3][4];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<m;j++)
            {
                nums[i][j]=(int)(Math.random() * 100);
            }
        }

        for(int m[] : nums)
        {
            for(int a : m)
            {
                //.........
            }
        }

        //jagged arrays
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        // by default the values of the are intialized as 0

        // STRINGS

        String name = new String("Manish");
        // name is a reference pointing to the STRING CONSTANT POOL in the heap memory
        // String s1 = new String("Tyagi");
        // String s2 = new String("Tyagi");

        // s1 and s2 are reference to the same object in the heap
        // there is only one instance of Tyagi in memory
        // s1 = s1 + "hello";
        // creates a new object in the memory and now s1 points to the new location
    }
}
