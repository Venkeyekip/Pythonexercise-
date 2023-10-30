class hello
{
int val=50;
public void show()
{
System.out.println("executing show method");
}
}
class hi extends hello
{
public void display()
{
System.out.println(super.val);
super.show();
System.out.println("executing display method");
}
}
public class supe
{
public static void main(String args[])
{
hi oo= new hi();
oo.display();
}
} 
