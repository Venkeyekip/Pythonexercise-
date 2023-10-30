public class linearsearch
{
public static void main(String args[])
{
int a[]={10,20,40,50,80};
int ele=40;
int flag=1;
for(int i=0;i<a.length;i++)
{
if(ele==a[i])
{
System.out.println("element is found:"+i);
flag=0;
break;
}
}
if(flag==1)
{
System.out.println("element is not found");
}
}
}
