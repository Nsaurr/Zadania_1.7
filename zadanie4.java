import java.util.Scanner;

class zadanie4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Prosze podac jakies slowo: ");
        String slowo = sc.next();
        System.out.print("\nOto pierwsza litera zdania: "+slowo.charAt(0)+" a to ostatnia: "+slowo.substring(slowo.length() - 1));
    }
}
