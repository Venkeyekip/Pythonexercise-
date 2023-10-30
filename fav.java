class p
{
public void sub()
{
System.out.println("python");
}
}
class c extends p
{
public void sub()
{
System.out.println("java");
}
}
class fav
{
public static void main(String args[])
{
c obj= new c();
obj.sub();
}
}