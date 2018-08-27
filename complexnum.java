import java.util.*;
class complex
{

int real,img;

public void setdata(int x,int y)
{
real=x;
img=y;

}

public void display()
{
System.out.print(real +"+" + img +"i");
}
}

public class complexnum
{
public static void main(String[] x)
{
int p,t;
 Scanner sc=new Scanner(System.in);
 p=sc.nextInt();
 t=sc.nextInt();
 complex r=new complex();
 r.setdata(p,t);
 r.display();
}
}