import java.util.Scanner;
class InputAgeException extends Exception{
    InputAgeException(){
        System.out.println("Your age must be greater than 25 for Nomination");
    }
}
public class Elections {
    public static void main(String[] args) {
        try{
            int age;
            Scanner s=  new Scanner(System.in);
            age=s.nextInt();
            if(age>25){
                System.out.println("Nomination successful");
            }
            else{
                throw new InputAgeException();
            }
        }
        catch (Exception e) {
            System.out.println("So Nomination is rejected");
        }

        finally{
            System.out.println("Done");
            }
        }
    }