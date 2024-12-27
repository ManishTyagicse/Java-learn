public class variables {
    public static void main(String a[])
    {
        /*int num=5;*/
        byte by=127; // last range is 127
        short sh = 111;
        long l = 5854l;

        float f = 5.8f; // now we used f because float is not default
        double d = 5.8; // double is deafult in java

        char c='s'; // in java char is 2 bytes

        boolean b = true || false;// but in java for boolean true !=1
        // so we can't assign boolean t=1; it will a compilation error

        int num=7;
        int res2=num++;
        int res=++num;

        System.out.println(res);
        System.out.println(res2);

    }
}