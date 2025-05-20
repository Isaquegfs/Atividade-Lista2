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
                case 1:{
                    System.out.println("Exiba 30 vezes na tela a mensagem “Não vou colar na prova”");
                    for (int i = 1;  i <31; i++){
                        System.out.println(i + " - Não vou colar na prova!");
                    }
                    break;
                }

                case 2:{
                    System.out.println("Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil)");
                    for (int i = 0; i <= 100000; i = i + 1000){
                        System.out.println(i);
                    }
                    break;
                }

                case 3:{
                    System.out.println("Faça um programa que exiba na tela os números inteiros de 100 até 1");
                    for (int i = 100; i >= 1; i = i -1){
                        System.out.println(i);
                    }
                    break;
                }
                
                case 4:{
                    System.out.println("Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Este tempo é chamado na físico-química de MEIA-VIDA.");
                    System.out.println("Dada a massa inicial, em gramas, faça um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0.5 gramas.");
                    System.out.println("Ao final do algoritmo escreva a massa inicial e o tempo calculado em horas, minutos e segundos.");
                    int horas,minutos,segundos = 0;
                    float material, material_inicial;
                    System.out.print("Digite a massa do material em gramas: ");
                    material_inicial = entrada.nextFloat();
                    material = material_inicial;
                    while (material >= 0.5){
                        material = material / 2;
                        segundos = segundos + 50;
                    }
                    minutos = segundos / 60;
                    horas = minutos / 60;
                    segundos = segundos % 60;
                    
                    System.out.println("Massa inicial: " + material_inicial + "g");
                    System.out.println("O tempo total foi de " + horas + "h " + minutos + "m " + segundos + "s");
                    System.out.println("Massa final: " + material + "g");
                    
                    break;
                }

                case 5:{
                    System.out.println("Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.");
                    System.out.println("Faça um algoritmo para ler o tipo de combustível abastecido codificado da seguinte forma:\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim");
                    System.out.println("Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido)");
                    System.out.println("Ao ser informado o código do combustível, o seu respectivo nome deve ser impresso na tela.");
                    System.out.println("O programa será encerrado quando o código informado for o número 4 escrevendo então a mensagem : 'MUITO OBRIGADO' e a quantidade de clientes que abasteceram cada tipo de combustível");
                    int alcool = 0, gasolina = 0, diesel = 0, clientes = 0, leitor;
                    while (true){
                        System.out.print("Digite o combustível abastecido: ");
                        leitor = entrada.nextInt();
                        if (leitor == 1){
                            alcool = alcool + 1;
                            clientes = clientes + 1;
                        }
                        else if (leitor == 2){
                            gasolina = gasolina + 1;
                            clientes = clientes + 1;
                        }
                        else if (leitor == 3){
                            diesel = diesel + 1;
                            clientes = clientes + 1;
                        }
                        else if (leitor == 4){
                            break;
                        }
                        else {
                            System.out.println("Valor Inválido, digite um numero de 1 a 4");
                        }
                    }
                    System.out.println("Muito Obrigado!!");
                    System.out.println("Alcool = " + alcool);
                    System.out.println("Gasolina = " + gasolina);
                    System.out.println("Diesel = " + diesel);
                    break;
                }   
                
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
