package x;
import java.lang.ArrayIndexOutOfBoundsException;
public class X {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        for(int i=-3*n/2;i<=n;i++){
            for(int j=-3*n/2;j<=3*n/2;j++){
                if((Math.abs(i)+ Math.abs(j)<n)
                    || ((-n/2-i)* (-n/2-i)+(n/2-j)*(n/2-j)<=n*n/2)
                        ||((-n/2-i)*(-n/2-i)+(-n/2-j)<=n*n/2)){
                    System.out.println("* ");
                }
                else{
                    System.out.println(". ");
                }
            }
            System.out.println("");
        }
       
    }
    
}
