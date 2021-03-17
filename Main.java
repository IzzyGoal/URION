import java.util.Scanner;
import java.text.DecimalFormat;
class Main{
public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);  
    //DecimalFormat formatado = new DecimalFormat("0");
     Double Valor = entrada.nextDouble();
  System.out.println("NOTAS:");
  System.out.println(Valor/100+" nota(s) de R$ 100.00");
    Valor = Valor%100;
  System.out.println(Valor/50+" nota(s) de R$ 50,00");
    Valor = Valor%50;
  System.out.println(Valor/20+" nota(s) de R$ 20.00");
    Valor=Valor%20; 
  System.out.println(Valor/10+" nota(s) de R$ 10.00");
    Valor=Valor%10;
  System.out.println(Valor/5+" nota(s) de R$ 5,00");
    Valor=Valor%5;
  System.out.println(Valor/2 +" nota(s) de R$ 2,00");
    Valor = Valor%2;
    System.out.println("MOEDAS:");
  System.out.println(Valor/1 +" moeda(s) de R$ 1.00");  
    Valor = Valor%1;
  System.out.println(Valor/0.5 +" moeda(s) de R$ 0.50");
    Valor = Valor%0.5;
  System.out.println(Valor/0.25 +" moeda(s) de R$ 0,25");
    Valor = Valor%0.25;
  System.out.println(Valor/0.10+" moeda(s) de R$ 0.10");
    Valor=Valor%0.10;
  System.out.println(Valor/0.05 +" moeda(s) de R$ 0,05");
    Valor=Valor%0.05;
  System.out.println(Valor/0.01 +" moeda(s) de R$ 0,01");
}
}