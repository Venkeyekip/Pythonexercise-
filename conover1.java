class hi
{
int a;
double b;
public hi(int c,double d)
{
a=c;
b=d;
System.out.println(a+" "+d);
}
public hi(double d,int c)
{
b=d;
a=c;
System.out.println(b+" "+a);
}
}
public class conover1
{
public static void main(String args[])
{
hi vv=new hi(24,30.5);
}
}