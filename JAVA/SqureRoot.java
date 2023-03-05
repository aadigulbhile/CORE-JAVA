class SqureRoot{
public static void main(String[]args){
int num=45;
int i;
for(i=1;i*i<=num;i++){
if(i*i==num){
System.out.println(i);
break;
}
}
if(i*i>num){
int diff1=i*i-num;
int tempi=i-1;
int diff2=num-(tempi*tempi);
double small=diff1<diff2 ? diff1:diff2;
if(small==diff1){
double sqrt=i-((small)/(2*i));
System.out.println(sqrt);
}
else{
double sqrt= tempi+((small)/(2*tempi));
System.out.println(sqrt);
}
}
}
}