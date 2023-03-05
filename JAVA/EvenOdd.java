import java.util.Scanner;
class EvenOdd{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Digit: ");
int  Num=sc.nextInt();
if(Num%2==0){
System.out.println("Its Even No : ");
}
else{

System.out.println("Its Not Even No : ");
}
}

}