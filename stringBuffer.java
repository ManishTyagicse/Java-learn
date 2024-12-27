public class stringBuffer{
    public static void main(String a[])
    {
        StringBuffer sb = new StringBuffer("Mainsh");
        System.out.println(sb.capacity());
        System.out.println(sb);
        // gives a buffer of 16 bits
        sb.append("Reddy");
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}