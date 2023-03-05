import java.util.Scanner;
class M3{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("enter the digit:");
int Length=sc.nextInt();
mmTocm(Length);
}
public static void mmTocm(double nm){
double res=nm/10;
System.out.println(res);
cmToinches(res);
}
public static void cmToinches(double a){
double res=a/2.54;
System.out.println(res);
}
}


