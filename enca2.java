class hi
{
double aa;int bb;char cc;
public void show(double dd,int ee,char ff)
{
aa=dd;bb=ee;cc=ff;
System.out.println(aa+" "+bb+" "+cc);
}
}
public class enca2
{
public static void main(String args[])
{
hi obj=new hi();
obj.show(1.234,49,'g');
}
}
