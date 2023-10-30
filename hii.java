class one
{
String val;
float val2;
public void show(String val, float val2)
{
this.val=val;
this.val2=val2;
System.out.println(val);
System.out.println(val2);
}
}
public class hii
{
public static void main(String args[])
{
one obj=new one();
obj.show("guru",30.6f);
}
}