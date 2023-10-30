class one
{
int a;
int b;
public one(int c,int d)
{
a=c;
b=d;
System.out.println("the updated value is");
}
public void show()
{
a++;
System.out.println(a);
}
}
public class paracons
{
public static void main(String args[])
{
one obj=new one(20,30);
obj.show();
}
}
