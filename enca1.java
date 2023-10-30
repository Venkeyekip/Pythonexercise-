class hi
{
double aa=3.14241;
public void show()
{
System.out.println("executing show method");
}
public double display()
{
aa++;
return aa;
}
}
public class enca1
{
public static void main(String args[])
{
hi obj=new hi();
obj.show();
double bb =obj.display();
System.out.println(bb);
}
}
