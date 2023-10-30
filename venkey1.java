class hi
{
int a;int b;int c;
public void show(int a1,int b1)
{
a=a1;
b=b1;
System.out.println("a+b = " +(a+b));
}
public void show(int c,int d,int e)
{
a=c;
b=d;
c=e;
System.out.println((a-b)+c);
}
}
public class venkey1
{
public static void main(String args[])
{
hi obj=new hi();
obj.show(50,30,10);
}
}