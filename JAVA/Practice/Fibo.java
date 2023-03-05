class Fibo{
public static void main (String []args){
int num=23;
int h1=0;
int h2=1;
int h3;
for(;;){
h3=h1+h2;
if(h1==num){
System.out.println("Its fibo: ");
}
else if(h1>h3){
System.out.println("its not fibo:");
break;
}
h1=h2;
h2=h3;
}
}
}