public class exc
{
public static void main(String args[])
{
int val=67;
int val2=73;
try{
val2=val/0;
System.out.println(val2);
}
catch(ArithmeticException vv)
{
System.out.println("provide values for division");
}
}
}