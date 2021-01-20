import java.util.Scanner;

class zadanie2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Prosze podac imie: ");
        String imie = sc.next();
        System.out.print("\nProsze podac nazwisko: ");
        String naziwsko = sc.next();
        System.out.print("Imie ma: "+imie.length()+" znakow a nazwisko: "+naziwsko.length()+" znakow");
    }
}
