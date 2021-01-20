import java.util.Scanner;

class zadanie5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Prosze podac jakies zdanie: ");
        String zdanie = sc.nextLine();
        zdanie = zdanie.replaceAll(".", "$0 \n");
        System.out.print("\n"+zdanie);
    }
}
