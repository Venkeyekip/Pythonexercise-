class one
{
int a;
public one()
{
a=45;
System.out.println("the updated value is");
}
public void show()
{
a++;
System.out.println(a);
}
}
public class defcons
{
public static void main(String args[])
{
one obj=new one();
obj.show();
}
}
