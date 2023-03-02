import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            System.out.println("1.Parallelepiped\n2.Cylinder\nPlease choose option(1/2): ");
            int chooseOption = in.nextInt();
            if (chooseOption==1){
                System.out.println("Enter height of Parallelepiped: ");
                double height =  in.nextDouble();
                if(height > 0){
                    System.out.println("Correct");
                }else {
                    throw new Exeption("Can not use negative number");
                }
                System.out.println("Enter length of Parallelepiped: ");
                double length =  in.nextDouble();
                if (length>0){
                    System.out.println("Correct");
                }else {
                    throw new Exeption("Can not use negative number");
                }
                System.out.println("Enter width of Parallelepiped: ");
                double width =  in.nextDouble();
                if (width>0){
                    System.out.println("Correct");
                }else {
                    throw new Exeption("Can not use negative number");
                }

                Parallelepiped parallelepiped = new Parallelepiped();
            }
        } catch (Exeption e) {
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Can not use letter");
        }
    }
}