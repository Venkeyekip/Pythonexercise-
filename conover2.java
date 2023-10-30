class hi
{
int a;
double b;
public hi(int c)
{
a=c;
System.out.println(a);
}
public hi(double d,int c)
{
b=d;
a=c;
System.out.println(b+" "+a);
}
}
public class conover2
{
public static void main(String args[])
{
hi vv=new hi(30.5,20);
}
}