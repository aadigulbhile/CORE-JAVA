import java.util.Scanner;
class Fibonacchi{
public static  void main (String[]args){
Scanner  Sc =new  Scanner(System.in);
System.out.println("Enter the Range :");
int num=Sc.nextInt();
int h1=0;
int h2=1;
int h3;
for(; ;){
h3=h1+h2;
if(h1==num){
System.out.println("Its fibbo: ");
}
else if(h1>h3){
System.out.println("Its  not fibbo: ");
break;

}
h1=h2;
h2=h3;
}
}
}
