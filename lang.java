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
class c extends a
{
public void display2()
{
System.out.println("hindi");
}
}
public class lang
{
public static void main(String args[])
{
c aa=new c();
aa.display();
aa.display2();
b bb=new b();
bb.display();
bb.display1();
a cc=new a();
cc.display();
}
}
