import java.util.Scanner;
class FibonacchiNo{
public static void main(String[]args){
Scanner  sc=new Scanner(System.in);
System.out.println("enter The Digit");
int i=sc.nextInt();
int h1=0;
int h2=1;
int h3;
for(; ;){
h3=h1+h2;
if (h1==i){
System.out.println("Its Fibonacchi No");
}
else if(h1>h3){
System.out.println("Its not FibonacchiNo");
break;
}
h1=h2;
h2=h3;
}
}
}