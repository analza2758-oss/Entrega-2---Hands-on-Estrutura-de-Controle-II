import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int letras = 0;
        int espaco = 0;
        int numeros = 0;
        int outros = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
              numeros++;
            } else if (Character.isWhitespace(c)) {
                espaco++;
            } else {
                outros++;
            }
        }

        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Espaços: " + espaco);
        System.out.println("Outros caracteres: " + outros);

        sc.close();

    }
}
