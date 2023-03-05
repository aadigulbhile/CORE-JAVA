import java.util.Scanner;
class  {
public static void main(String[]args){
int n,sqrnum,temp,sqrnumr,c=0;
Scanner sc=new Scanner (System.in);
System.out.println("Enter The Digit:");
n=sc.nextInt();
temp=n;
while(temp>0){
temp=temp/10;
c++;
}
sqrnum=n*n;
sqrnumr=sqrnum%(int)Math.pow(10,c);
if(sqrnumr==n){
System.out.println("Its a AutomorphicNumber: ");
}
else{
System.out.println("Its not AutomorphicNumber: ");
}
}
}