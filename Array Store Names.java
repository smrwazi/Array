import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[]wazi = new String[3];
        int i = 0;
        while(i<wazi.length){
            String a = x.next();
            wazi[i]= a;
            i+=1;
        }
        System.out.print(Arrays.toString(wazi));
       
}
}