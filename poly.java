class hi
{
int a;int a1;
public void m1(int b)
{
a=b;
System.out.println(a);
}
public void m1(int c,int d)
{
a=c;
a1=d;
System.out.println(a+" "+a1);
}
}
public class poly
{
public static void main(String args[])
{
hi obj=new hi();
obj.m1(10,20);
}
}
