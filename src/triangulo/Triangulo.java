/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

public class Triangulo {

    public static void main(String[] args) {
      java.util.Scanner lectura=
              new java.util.Scanner(System.in);
     
      int x[]=new int[3];
      int y[]=new int[3];
      double[] d=null;
      double [] p=null;
      double [] aa=null;
      double [] h=null;
      int c,a;
     
      for (c=0;c<=2;c=c+1){
           System.out.println("Ingrese el valor de x" + c);
           x[c]=lectura.nextInt();
           System.out.println("Ingrese el valor de y" + c);
           y[c]=lectura.nextInt();
      }     
    d=distancia(x,y);
    p=perimetro(d);
    aa=area(p,d);
    h=altura(aa,d);
   
      
    for (a=0;a<=2;a=a+1){
           System.out.println("La distancia numero " + a + " es: " + d[a]);
     }
    System.out.println("El perimetro del triangulo es : " + p[0]);
    System.out.println("El area del triangulo es : " + aa[0]);
    System.out.println("La altura del triangulo es : " + h[0]);
                  
          
    }
   
    public static double[] distancia(int[] x,int[]y){
    double d[]= new double[3];
     d[0]=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
     d[1]=Math.sqrt(Math.pow(x[1]-x[2],2)+Math.pow(y[1]-y[2],2));
     d[2]=Math.sqrt(Math.pow(x[0]-x[2],2)+Math.pow(y[0]-y[2],2));
     return d;
    }
   
    public static double[] perimetro(double[] d){
       double p[]= new double[1];
       p[0]=((d[0]+d[1]+d[2])/2);
       return p;
    }
   
    public static double [] area(double[] p, double[] d){
        double aa[]=new double[1];
        aa[0]=Math.sqrt(p[0]*(p[0]-d[0])*(p[0]-d[1])*(p[0]-d[2])/2);
        return aa;
    }
   
    public static double [] altura(double[]aa, double[] d){
        double h[]=new double[1];
        h[0]=(2*aa[0]/d[0]);
        return h;
    }
         
}
    
    

