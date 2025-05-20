import java.util.Scanner;

public class ListaRepeticao {
    public static void main(String[] args) throws Exception {
        Scanner entrada=new Scanner(System.in);

        // Menu
        System.out.println("+===========================+");
        System.out.println("       Atividade Lista 2     ");
        System.out.println("     LISTA DE EXERCICIOS     ");
        System.out.println("+===========================+");
        System.out.println("1 - Exibe 30 vezes");
        System.out.println("2 - Incrementa 1000");
        System.out.println("3 - Inteiros 100 a 1");
        System.out.println("4 - Media Vida Radioatividade");
        System.out.println("5 - Posto de Gasolina");
        System.out.println("6 - Media Aritmética");
        System.out.println("7 - Verifica Primo");
        System.out.println("8 - Soma Intervalo");
        System.out.println("9 - Divisores N");
        System.out.println("10 - Adivinha Numero");
        System.out.println("11 - População Bruzundangas");
        System.out.println("12 - Média População");


        // Repetir o aplicativo
        int encerrar = 1;
        while (encerrar != 0) {

            // Selecionar questão
            int selecionarQuestao;
            while (true) {
                System.out.print("Qual atividade gostaria de executar: ");
                selecionarQuestao = entrada.nextInt();
                if (selecionarQuestao < 1 || selecionarQuestao > 12) {
                    System.out.println("Número inválido! Digite uma opção de 1 e 12");
                }
                else {
                    break;
                }
            }

            // Atividade Selecionada
            System.out.println("Exercício " + selecionarQuestao + " selecionado");
            System.out.println("Enunciado: ");
            
            // Atividades
            switch(selecionarQuestao){
                case 1:{}
                case 2:{}
                case 3:{}
                case 4:{}
                case 5:{}
                case 6:{}
                case 7:{}
                case 8:{}
                case 9:{}
                case 10:{}
                case 11:{}
                case 12:{}



            
            // Chave switch
            }
        
        // Chave da repetição do aplicativo
        }











        entrada.close();
    // Chave static void
    }
// Chave classe
}
