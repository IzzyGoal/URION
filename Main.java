import java.util.Scanner;
import java.text.DecimalFormat;
class Main {
public static void main(String[] args){
  Scanner entrada = new Scanner(System.in);
      DecimalFormat formatado = new DecimalFormat("0.000");
  double A = entrada.nextDouble();
  double B = entrada.nextDouble();
  double C = entrada.nextDouble();
double TA,AC,TRA,QA,RA ;
    TA = A*C/2;
    AC = 3.14159 * (C*C);
    TRA = ((A+B)/2)*C;
    QA = B*B;
    RA = A*B;
System.out.println("TRIANGULO: "+formatado.format(TA));
System.out.println("CIRCULO: "+formatado.format(AC));
System.out.println("TRAPEZIO: "+formatado.format(TRA));
System.out.println("QUADRADO: "+formatado.format(QA));
System.out.println("RETANGULO: "+formatado.format(RA));
}
}