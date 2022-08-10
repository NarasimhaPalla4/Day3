import java.lang.*;
public class DemoException {
    public static void main(String[] args) {
        try{
            int i;
            int[] arr= new int[5];
            int a=4,b=0,c;
            for(i=0;i<5;i++){
                arr[i]=i;
            }
            System.out.println(arr[6]);
            c=a/b;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundsException handled successfully");
       }
        try{
            int a=4,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException a){
            System.out.println("ArithmeticException handled successfully");
        }
        finally {
            System.out.print("Perfect");
        }
    }
}
