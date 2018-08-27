import java.util.*;
class rectangle 
{

int l,b,a;

public void setdata(int x,int y)
{
l=x;
b=y;

}

public int calculatearea()
{
a=l*b;
return a;
}


public void display()
{
System.out.print(a);
}
}

public class area
{
public static void main(String[] x)
{
int p,t;
 Scanner sc=new Scanner(System.in);
 p=sc.nextInt();
 t=sc.nextInt();
 rectangle r=new rectangle();
 r.setdata(p,t);
 r.calculatearea();
 r.display();
}
}