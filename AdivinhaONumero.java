import java.util.Scanner;
import java.util.Random;

public class AdivinhaONumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Os Boas vindas
        print("Bem-vindo  ao adivinha");
        print("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.printf("Que nome bonito %s :D, Bom jogo!", nome);
        print("");

            //O loop do Jogo
            boolean jogar = true;
            Random numberAleatorio = new Random();

            while (jogar) {
                print("=============🤔PENSANDO EM UM NÚMERO🤔=============");
                int numero_correto = numberAleatorio.nextInt(10);
                print("loading...");
                print("Prontinho! Está na hora de você tentar acertar em que número eu pensei.");


                // tentativa do usuario
                print("Digite um número de 1 e 10: ");
                int tentativa = teclado.nextInt();

                //verificação da tentativa do usuario
                if (tentativa == numero_correto) {
                    print("BOOOUUUAAA! Está \033[32;40mCORRETO\033[m. O número que eu pensei foi " + numero_correto + "😎.");
                    jogar = false;
                } else {
                    print("Que pena, você NÃO ACERTOU!!! ");
                }
                if (tentativa < numero_correto) {
                    print("Quase Acertou! O número que eu pensei foi " + numero_correto + "😐.");
                }
                // se a tentativa for com numero maior que 10 ou menor que 1
                if (tentativa >= 11 || tentativa == 0) {
                    print("EU FALEI PARA DIGITAR UM NÚMERO DE 1 E 10 BOBINHO!!! 🤡😕");
                    jogar = false;
                }

                //Jogar novamente
                print("Você quer tentar adivinhar novamente? Digite '1' para SIM e '0' para NÃO: ");
                int respostaJogarNovamente = teclado.nextInt();

                if (respostaJogarNovamente == 0) {
                    print("Ok, Até outro dia!");
                    break;
                }
                else if (respostaJogarNovamente == 1) {
                    jogar = true;
                }
                else if (respostaJogarNovamente == 0 && respostaJogarNovamente == 1) {
                    break;
                }
            }

    }
    
    public static void print(String palavra) {
        System.out.println(palavra);
    }

}