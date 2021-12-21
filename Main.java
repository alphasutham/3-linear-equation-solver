import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    //public void wait(){}
    public static void main(String[] args) {
        System.out.println("Logika persamaan");
        System.out.println();
        System.out.println("ax+ay+az=a");
        System.out.println("bx+by+bz=b");
        System.out.println("cx+cy+cz=c");
        System.out.println();
        float ax1,ay1,az1,a1,b1,bx1,by1,bz1,ax2,ay2,az2,bx2,by2,bz2,cx2,cy2,cz2,a2,b2,c2;
        Scanner input = new Scanner(System.in);
        System.out.print("ax = ");
        float ax =input.nextFloat();
        System.out.print("ay = ");
        float ay =input.nextFloat();
        System.out.print("az = ");
        float az =input.nextFloat();
        System.out.print("a = ");
        float a =input.nextFloat();
        System.out.print("bx = ");
        float bx =input.nextFloat();
        System.out.print("by = ");
        float by =input.nextFloat();
        System.out.print("bz = ");
        float bz =input.nextFloat();
        System.out.print("b = ");
        float b =input.nextFloat();
        System.out.print("cx = ");
        float cx =input.nextFloat();
        System.out.print("cy = ");
        float cy =input.nextFloat();
        System.out.print("cz = ");
        float cz =input.nextFloat();
        System.out.print("c = ");
        float c =input.nextFloat();



        ax1 =ax*bx;
        ay1 = ay*bx;
        az1 = az*bx;
        a1 = a*bx;
        b1 = b*ax;
        bx1 = bx*ax;
        by1 = by*ax;
        bz1 = bz*ax;

        bx2 = bx*cx;
        by2 = by*cx;
        bz2 = bz*cx;
        b2 = b*cx;
        cx2 = cx*bx;
        cy2 = cy*bx;
        cz2 = cz*bx;
        c2 = c*bx;

        System.out.println();
        System.out.println("Menyamakan X persamaan ke 1");
        System.out.print(ax1+"x");
        System.out.print("+");
        System.out.print(ay1+"y");
        System.out.print("+");
        System.out.print(az1+"z");
        System.out.print("=");
        System.out.print(a1);
        System.out.println();

        System.out.print(bx1+"x");
        System.out.print("+");
        System.out.print(by1+"y");
        System.out.print("+");
        System.out.print(bz1+"z"+"=");
        System.out.println(b1);

        System.out.println();
        System.out.println("Meyamakan X persamaan ke 2");
     //   System.out.println();
        System.out.print(bx2+"x");
        System.out.print("+");
        System.out.print(by2+"y");
        System.out.print("+");
        System.out.print(bz2+"z");
        System.out.print("=");
        System.out.print(b2);
        System.out.println();


        System.out.print(cx2+"x");
      //  System.out.println();
//        System.out.println("woaldawop");
        System.out.print("+");
        System.out.print(cy2+"y");
        System.out.print("+");
        System.out.print(cz2+"z"+"=");
        System.out.println(c2);
        float am,am2,am3,am4,bm,bm2,bm3,bm4;
        if (ax1 == bx1){
           // System.out.println("sama");
             am=ax1-bx1;
             am2=ay1-by1;
             am3=az1-bz1;
             am4=a1-b1;
        } else {
            //int an=ax1+bx1;
            am = ax1 + bx1;
            am2 = ay1 + by1;
            am3 = az1 + bz1;
            am4 = a1 + b1;
        }
         if (bx2==cx2){
             bm=bx2-cx2;
             bm2=by2-cy2;
             bm3=bz2-cz2;
             bm4=b2-c2;
         } else {
             bm=bx2+cx2;
             bm2=by2+cy2;
             bm3=bz2+cz2;
             bm4=b2+c2;
         }

        System.out.println();
    //    System.out.print(am+"x");
   //     System.out.print("+");
        System.out.println("Eliminasi persamaan dan menyamakan koefisien");
        System.out.print(am2+"y");
        System.out.print("+");
        System.out.print(am3+"z");
        System.out.print("=");
        System.out.print(am4);
     //   System.out.println();

        System.out.println();
        System.out.print(bm2+"y");
        System.out.print("+");
        System.out.print(bm3+"z");
        System.out.print("=");
        System.out.println(bm4);

        float k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
        z=am2*bm2;
       // z1 = z;
        y=am3*bm2;
        x=am4*bm2;
        w=bm2*am2;
        v=bm3*am2;
        u=bm4*am2;

        System.out.println();
        System.out.println("Mencari nilai koefisien z");
        System.out.print(z+"y");
        System.out.print("+");
        System.out.print(y+"z");
        System.out.print("=");
        System.out.println(x);
        System.out.print(w+"y");
        System.out.print("+");
        System.out.print(v+"z");
        System.out.print("=");
        System.out.print(u);

        if (z==w){
            k=z-w;
            l=y-v;
            m=x-u;
        } else {
            k=z+w;
            l=y+v;
            m=x+u;
        }
        System.out.println();
        System.out.print(l+"z");
        System.out.print("=");
        System.out.print(m);
        System.out.println();
      //  System.out.print;
        float pers1 = m/l;
        System.out.print("z = " + pers1);
        System.out.println();

        System.out.println();
        System.out.println("Mencari nilai koefisien y");
        System.out.print(am2+"y");
        System.out.print("+");
        float penyederhanaan = pers1*am3;
        System.out.println(penyederhanaan+"="+am4);
      //  System.out.println();
     //   System.out.println("Penyederhanaan masing masing ruas ");
        System.out.println(am2+"y"+"="+(am4-penyederhanaan));
        System.out.println("y=" + ((am4-penyederhanaan)/am2));

        System.out.println();
        System.out.print("Mencari nilai koefisien x");
        float zz = (ay*(am4-penyederhanaan))/am2;
        float zz2 = zz*(-1);
        System.out.println();
        float zzz = (pers1*az);
        float zzz2 = zzz*(-1);
        System.out.println(ax+"x"+"+"+zz+zzz+"="+a);
        System.out.println(ax+"x"+"="+zz2+"+"+zzz2+"+"+a);
        float terakhir = zz2+zzz2+a;
        System.out.println(ax+"x"+"="+(terakhir));
        System.out.println("x"+"="+(terakhir/ax));
        System.out.println();
        System.out.println("HP"+" {"+"x = "+(terakhir/ax)+";"+"y = "+((am4-penyederhanaan)/am2)+";"+"z = "+(pers1)+";"+"}");

        System.out.print("Uji nilai tiap variabel");

 //       if ((ax*terakhir/ax))
    }
}