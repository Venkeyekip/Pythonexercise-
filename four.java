abstract class one
{
abstract public void demo();
}
class two extends one
{
public void demo()
{
System.out.println("executing demo method");
}
}
public class four
{
public static void main(String args[])
{
two bb=new two();
bb.demo();
}
}
