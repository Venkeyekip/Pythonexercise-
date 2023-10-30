class one
{
public void demo(int b, int c)
{
b++;
c++;
System.out.println("the value is"+b);
System.out.println("the value is"+c);
}
}
public class example6
{
public static void main(String args[])
{
one a=new one();
a.demo(20,30);
}
}