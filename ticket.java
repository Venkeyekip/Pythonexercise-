class ticket
{
public static void main(String args[])
{
int age =4;
int cost =300;
if(age<5)
{
System.out.println("you are child,no ticket");
}
else if((age>5)&&(age<12))
{
System.out.println(" you are minor,ticket price is" +cost/2);
}
else if((age>12)&&(age<60))
{
System.out.println("you are major,ticket price is" +cost);
}
else
{
System.out.println("you are sr citizen,ticket price is" +cost/100*80);
}
}
}