import java.lang.String;
import java.util.Scanner;
public class xd {
    public static void main(String[] args) {
        /* int[] a = {5, 6, 4, 5, -4, 5, 6, -7, -8, 5, 1};
        int min = 100;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min && a[i] >0) {
                min = a[i];
            }
        }
        System.out.println(min);
        int perv_chislo = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0){
                perv_chislo = i;
                break;
            }
        }
        int posl_chislo = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0) {
                posl_chislo = i;
            }
        }
        double counter = 0;
        double sum = 0;
        for(int i  = perv_chislo+1; i < posl_chislo; i++){
            counter++;
            sum += a[i];
        }
        double arf = sum/counter;
        System.out.println(arf);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }*/
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        int [][] twom = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int stroki = 0;
        for (int i = 0; i < twom.length; i++ ) {
            double sum = 0;
            double colvo = 0;
            for (int j = 0; j < twom[0].length; j++ ){
                sum += twom[i][j];
                colvo += 1;
            }
            if (sum/colvo < n){
                stroki +=1;
            }
        }
        System.out.println(stroki);
        for (int i = 0; i < twom.length; i++) {
            int temp = twom[i][0];
            twom[i][0] =  twom[i][twom[i].length - 1];
            twom[i][twom[i].length - 1] = temp;
        }

        for (int i = 0; i < twom.length; i++) {
            for (int j = 0; j < twom[0].length; j++) {
                System.out.print(" " + twom[i][j] + " ");
            }
            System.out.println();
        }



    }
}
