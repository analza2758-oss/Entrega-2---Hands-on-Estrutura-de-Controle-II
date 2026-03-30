import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        char resposta;
        int tentativas = 0;
        boolean acertou = false;

        do {
            System.out.println("Qual linguagem é mais usada para desenvolvimento Android?");
            System.out.println("a) Python");
            System.out.println("b) Java");
            System.out.println("c) C++");
            System.out.println("d) PHP");
            System.out.println("e) Ruby");

            System.out.println("Digite sua resposta: ");
            resposta = sc.next().charAt(0);

            tentativas++;

            switch (resposta) {
                case 'b':
                case 'B':
                    System.out.println("Resposta correta!");
                    acertou = true;
                    break;
                default:
                     System.out.println("Resposta incorreta.");
            }
        }   while (!acertou && tentativas < 3);
        if (acertou) {
            System.out.println("Você acertou na tentativa " + tentativas);
        } else {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }
  
     sc.close();
    }
}
