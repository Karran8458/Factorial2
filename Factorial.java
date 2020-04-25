public class Factorial{
 static int n1=0,n2=1,n3=0;  
 static int factorial(int count){  
    int total = 1;
    for (int j = 1; j <= count; j++)
    {
        total = total * j;
    }
    return total;
 }  
 public static void main(String args[]){  
  int a = factorial(5);
  System.out.println(a);
 }
}
