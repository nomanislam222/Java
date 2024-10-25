class Noman{
public static void main (String args[])
{
Addition obj = new Addition();
obj.disp(10);
}
}
class Addition{
public void disp(int a){
int x =10;
int y = a;
int z = x +y;
System.out.println("Addition:" + z);
}
}