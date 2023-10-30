class hi
{
int a=60;
public void show()
{
System.out.println("the value is");
}
public int display()
{
a++;
return a;
}
}
public class example5
{
public static void main(String args[])
{
hi obj=new hi();
obj.show();
int c=obj.display();
System.out.println(c);
}
}