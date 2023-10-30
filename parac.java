class one
{
int USD;
double INR;
double EUR;
double AUS;
double LIRA;
public one(int a,double b,double c,double d,double e)
{
USD=a;
INR=b;
EUR=c;
AUS=d;
LIRA=e;
System.out.println("converting us dollars into other country currency");
}
public void show()
{
System.out.println("US dollar to INR converted amount is" +USD * INR);
System.out.println("US dollar to EUR converted amount is" +USD * EUR);
System.out.println("US dollar to AUS converted amount is" +USD * AUS);
System.out.println("US dollar to LIRA converted amount is" +USD * LIRA);
}
}
public class parac
{
public static void main(String args[])
{
one obj= new one(100,74.78,0.89,1.40,13.53);
obj.show();
}
}