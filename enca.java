class hi
{
int aa=300;
int bb=290;
public void show()
{
aa++;
System.out.println("the value is"+aa);
}
public void display()
{
bb++;
System.out.println("the value is"+bb);
}
}
public class enca
{
public static void main(String args[])
{
hi obj=new hi();
System.out.println(obj.aa);
System.out.println(obj.bb);
obj.show();

hi obj1=new hi();
System.out.println(obj1.aa);
System.out.println(obj1.bb);
obj1.show();
obj1.display();
}
}
