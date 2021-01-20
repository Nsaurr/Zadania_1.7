import java.util.Scanner;

class zadanie3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Prosze podac zdanie: ");
        String zdanie = sc.nextLine();
        System.out.print(zdanie.toUpperCase());
    }
}
