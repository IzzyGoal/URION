import java.util.Scanner;
import java.text.DecimalFormat;
class Main {
public static void main(String[] args){
  Scanner entrada = new Scanner(System.in);
      DecimalFormat formatador = new DecimalFormat("0.0000");
      double x1 = entrada.nextDouble();
      double y1 = entrada.nextDouble();
      double x2 = entrada.nextDouble();
      double y2 = entrada.nextDouble();
double op,opt;
op =Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
opt = Math.sqrt(op);
    System.out.println(formatador.format(opt));
}
}

