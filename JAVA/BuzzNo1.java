import java.util.Scanner;
class BuzzNo1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Digit :");
int num=sc.nextInt();
if((num%10==7)||(num/7==0)){
System.out.println("Its Buszz  no: ");
}
else{
System.out.println("Itsnot buss no: ");
}
}

}