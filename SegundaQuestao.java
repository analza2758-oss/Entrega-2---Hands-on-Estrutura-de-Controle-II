import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double RaiodaTerra = 6371.01;

        System.out.print("Latitude 1: ");
        double lat1 = Math.toRadians(sc.nextDouble());

        System.out.print("Longitude 1: ");
        double long1 = Math.toRadians(sc.nextDouble());

        System.out.print("Latitude 2: ");
        double lat2 = Math.toRadians(sc.nextDouble());

        System.out.print("Longitude 2: ");
        double long2 = Math.toRadians(sc.nextDouble());

        double d = RaiodaTerra * Math.acos(
            Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) *Math.cos(long1 - long2)
        );

        System.out.println("Distância entre pontos: " + d + " km");

        sc.close();

    }
}
