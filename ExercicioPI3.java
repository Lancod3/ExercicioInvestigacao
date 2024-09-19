import java.util.Scanner;

public class ExercicioPI3 {

    public static void main(String[]args){

    Scanner teclado = new Scanner(System.in);

        System.out.println("Você é suspeito numa investigação criminal! \nResponda as perguntas com 1 para sim, e 2 para não!");

        System.out.println("Primeira pergunta: \nVocê telefonou para a vítima?");

        int p = teclado.nextInt();
        int ponto = 0;

        if(p <0 || p>2){
            System.out.println("opção inválida! o programa será encerrado. Tente de novo!");
            return;
}
        if(p == 1){
            ponto++;
        }

        System.out.println("Segunda pergunta: \nVocê esteve no local do crime?");
        p = teclado.nextInt();

        if(p == 1){
            ponto++;
        }

        System.out.println("Terceira pergunta: \nVocê mora perto da vitima?");
        p = teclado.nextInt();

        if(p == 1){
            ponto++;
        }

        System.out.println("Quarta pergunta: \nVocê devia dinheiro para a vitima?");
        p = teclado.nextInt();
        if(p == 1){
            ponto++;
        }

        System.out.println("Última pergunta: \nVocê já trabalhou com a vitima???");
        p = teclado.nextInt();
        if(p == 1){
            ponto++;
        }

        if (ponto == 2){

            System.out.println("Sua classificação é: " + ponto +"! \nVocê é considerado suspeito! Estamos de olho em você!!!");
        }else if(ponto ==3 || ponto ==4){

            System.out.println("Sua classificação é: "+ ponto + "! \nRenda-se, você é considerado cumplice!!!");
        }else if (ponto ==5){

            System.out.println("Sua classifcação é: "+ ponto +"! \nVocê é o assassino e está preso!!!");

        }else{

            System.out.println("Sua classifcação é: "+ ponto +"! \nVocê é considerado inocente e está liberado!");


        }
    }
    }
