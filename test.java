class p
{
String name ="ramanaiah";
public void m1()
{
System.out.println("parent");
}
}
class c extends p
{
public void m2()
{
System.out.println("child");
}
}
class test
{
public static void main(String args[])
{
c aa =new c();
aa.m1();
aa.m2();
System.out.println(aa.name);
}
}