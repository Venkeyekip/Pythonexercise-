class hi
{
int aa; double bb;
public void show(int aa,double bb)
{
this.aa=aa;
this.bb=bb;
System.out.println(aa+"   "+bb);
}
}
public class the
{
public static void main(String args[])
{
hi obj=new hi();
obj.show(20,2.8);
}
}

