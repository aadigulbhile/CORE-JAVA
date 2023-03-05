import java.util.Scanner;
class UglyNo{
public static void main(String[]args){
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println(  "Enter the digit: ");
int n=sc.nextInt();
while(n!=1){
if(n%5==0){
n/=5;
}
else if(n%3==0){
n/=3;
}
else if(n%2==0){
n/=2;
}
else{
flag=false;
break;
}
}
if(flag){
System.out.println("its Ugley : ");
}
else{
System.out.println("its not Ugley no: ");
}
}
}
