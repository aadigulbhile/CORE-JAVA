import java.util.Scanner;
class ArmStrong{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Digit: ");
int ip=sc.nextInt();
int raise=count (ip);
int sum=0;
for(int i=ip;i>0;i/=10){
int rem=i%10;
int pow=power(rem,raise);
sum=sum+pow;
}
if(ip==sum){
System.out.println("Its ArmStrong No : ");
}
else{
System.out.println("Its not ArmStrong no : ");
}
}
public static int count (int num){
int ct=0;
while(num!=0){
ct++;
num/=10;
}
return ct;
}
public static int power(int base,int raise){
int pow=1;
for(int i=1;i<=raise;i++){
pow*=base;
}
return pow;
}
}
