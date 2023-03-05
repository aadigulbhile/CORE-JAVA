class Pen1Driver{
public static void main (String[]args){
Pen1 P1=new Pen1();
P1.Hd= 2;
P1.Brand="HP";
P1.Prise=200;
P1.Colour="Silver";
System.out.println("Brand"+P1.Brand);
System.out.println("Hd"+P1.Hd);
System.out.println("Prise"+P1.Prise);
System.out.println("Colour"+P1.Colour);
System.out.println("++++++++++++++++++++++++++++++++++++++++");

Pen1 P2=new Pen1();
P2.Hd= 2;
P2.Brand="DP";
P2.Prise=200;
P2.Colour="Black";
System.out.println("Brand"+P2.Brand);
System.out.println("Hd"+P2.Hd);
System.out.println("Prise"+P2.Prise);
System.out.println("Colour"+P2.Colour);
}
}