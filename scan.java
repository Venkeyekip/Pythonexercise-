import java.util.Scanner;
public class scan
{
public static void main(String arg[])
{
System.out.println("enter name");
Scanner sc= new Scanner(System.in);
String aa=sc.nextLine();
System.out.println("enter college");
Scanner sc1= new Scanner(System.in);
String bb=sc1.nextLine();
System.out.println("enter phone number");
Scanner sc2= new Scanner(System.in);
long cc=sc2.nextLong();
System.out.println("name is" +aa);
System.out.println("college name is" +bb);
System.out.println("phone number is" +cc);
}
}