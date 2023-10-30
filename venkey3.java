class hi
{
int a;double b;
public void show(int a1,double b1)
{
a=a1;
b=b1;
System.out.println(a+","+b);
}
public void show(double a1,int b1)
{
b=a1;
a=b1;
System.out.println(b+","+a);
}
}
public class venkey3
{
public static void main(String args[])
{
hi obj=new hi();
obj.show(20,40.5);
}
}