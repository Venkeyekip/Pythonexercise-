final class one
{
 final int a=46;
public void demo()
{
a=55;
System.out.println("the value of a is"+a);
}
}
class two extends one
{
public final void demo()
{
a=67;
System.out.println("the value of a is"+a);
}
}
public class three
{
public static void main(String args[])
{
two bb=new two();
bb.demo();
}
}
