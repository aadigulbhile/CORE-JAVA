class PascaleTrangle{
public static void main(String[]args){
int n=5;
int num=1;
for(int i=1;i<n;i++){
for(int j=n;j>i;j--){
System.out.print(" ");
}
num=1;
for(int j=0;j<=i;j++){
System.out.print(num+" ");
num=num*(i-j) /(j+1);
}
System.out.println();
}
}
}