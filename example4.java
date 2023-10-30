class hi
{
int age=21;
String name="guru";
public void show()
{
System.out.println("years of age is");
}
public void display()
{
System.out.println("name of the person");
}
}
public class example4
{
public static void main(String args[])
{
hi obj=new hi();
System.out.println(obj.age);
obj.show();
System.out.println(obj.name);
obj.display();
}
}