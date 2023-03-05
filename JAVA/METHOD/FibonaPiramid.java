class FibonaPiramid{
public static void main(String[]args){
Fibona();
Piramid();
}
public static void Piramid(){
 int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
	}
	public static void Fibona(){
	int i=5;
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