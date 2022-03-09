package Compare;
import java.util.Scanner;
import java.util.function.IntFunction;

public class Compare {
 

    public static void main(String[] args) {
        Value v = new Value();


        System.out.println("Enter your first number");
        Scanner a = new Scanner(System.in);
        v.e = a.nextInt();

        System.out.println("Enter your second number");
        Scanner b = new Scanner(System.in);
        v.f = b.nextInt();

        System.out.println("Enter your third number");
        Scanner c = new Scanner(System.in);
        v.g = c.nextInt();

        System.out.println("Enter your fourth number");
        Scanner d = new Scanner(System.in);
        v.h = d.nextInt();
        
        v.number();

    }
}
class Value extends Compare{

    int e,f,g,h;
    
    void number(){
        if (e>f && e>g && e>h){
        System.out.println(e  +  " is gratest value" );
}
        if (f>e && f>g && f>h){
            System.out.println(f +  " is gratest value" );
} 
        if (g>e && g>f && g>h){
    System.out.println(g  +  " is gratest value" );
}
        
        if (h>e && h>f && h>g){
    System.out.println(h +  " is gratest value" );
}
    }
}

