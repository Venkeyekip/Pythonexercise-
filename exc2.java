public class exc2
{
public static void main(String args[])
{
String a="abc";
try{
System.out.println(a.length());
}
catch(NullpointerException vv)
{
System.out.println("provide values for String");
}
}
}