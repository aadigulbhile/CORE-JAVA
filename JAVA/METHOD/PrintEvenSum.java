import java.util.Scanner;
class PrintEvenSum{
public static boolean checkEven(int num){
if (num%2==0){
return true;
}
else{
return false;
}
}
public static int sum(int num){
int ans=0;
while(num>0){
ans=ans+(num%10);
num/=10;
}
return ans;
}
public static void main (String[]args){
Scanner  sc=new Scanner (System.in);
System.out.println("Enter the Digit : " );
int ip=sc.nextInt();
int res=sum(ip);
boolean ans=checkEven(res);
if(ans){
System.out.println("this is sum of even : ");
}
else{
System.out.println("this is sum of odd : ");
}
}
}