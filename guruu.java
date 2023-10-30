class one
{
int num  = 2;
int i;
public void show()
{
for(i =1; i <= 10; i++)
{
System.out.println(num + " * " + i + " = " + num * i);
}
}
}
public class guruu
{
public static void main(String args[])
{
one obj =new one();
System.out.println(obj.num);
obj.show();
}
}