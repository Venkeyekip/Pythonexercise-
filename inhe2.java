class a
{
public void display()
{
System.out.println("telugu");
}
}
class b extends a
{
public void display1()
{
System.out.println("english");
}
}
class c extends b
{
public void display2()
{
System.out.println("hindi");
}
}
public class inhe2
{
public static void main(String args[])
{
c aa=new c();
aa.display();
aa.display1();
aa.display2();
}
}
