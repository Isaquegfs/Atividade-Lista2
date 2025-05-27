package ListaRepeticao;
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
            entrada.nextLine(); // limpa o buffer

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
                    int horas,minutos,segundos = 0;
                    float material, material_inicial;
                    System.out.println("Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Este tempo é chamado na físico-química de MEIA-VIDA.");
                    System.out.println("Dada a massa inicial, em gramas, faça um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0.5 gramas.");
                    System.out.println("Ao final do algoritmo escreva a massa inicial e o tempo calculado em horas, minutos e segundos.");
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
                    int alcool = 0, gasolina = 0, diesel = 0, clientes = 0, leitor;
                    System.out.println("Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.");
                    System.out.println("Faça um algoritmo para ler o tipo de combustível abastecido codificado da seguinte forma:\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim");
                    System.out.println("Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido)");
                    System.out.println("Ao ser informado o código do combustível, o seu respectivo nome deve ser impresso na tela.");
                    System.out.println("O programa será encerrado quando o código informado for o número 4 escrevendo então a mensagem : 'MUITO OBRIGADO' e a quantidade de clientes que abasteceram cada tipo de combustível");
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

                case 6:{
                    int inteiro = -1, media = 0, contador = 0, contador_par = 0;
                    System.out.println("Faça um programa que solicita ao usuário uma quantidade indeterminada de números inteiros.");
                    System.out.println("O programa deve calcular e escrever a média aritmética apenas dos números pares.");
                    System.out.println("A entrada de dados deve ser encerrada quando o número ZERO for digitado. ");
                    while (true){
                        System.out.print("Digite um numero inteiro: ");
                        inteiro = entrada.nextInt();
                        if (inteiro == 0){
                            break;
                        }
                        if (inteiro % 2 == 0){
                            media = media + inteiro;
                            contador_par = contador_par + 1;
                        }
                        contador = contador + 1;
                    }
                    System.out.println("Quantidade de entradas: " + contador);
                    System.out.println("Media Aritimética: " + media / contador_par);
                    break;   
                }


                case 7:{
                    int numero, validador = 1;
                    double primo;
                    System.out.println("Dado um número N inteiro qualquer digitado pelo usuário, verificar se ele é ou não primo.");
                    System.out.print("Digite o numero: ");
                    numero = entrada.nextInt();
                    for (int i = 2; i < numero; i++){
                        primo = numero % i;
                        if (primo == 0){
                            System.out.println("Esse numero NÃO é primo!");
                            validador = 0;
                            break;
                        } 
                    }
                    if (validador == 1){
                        System.out.println(numero + " É primo!");
                    }
                    break;
                }

                case 8:{
                    int numero, soma = 0;
                    System.out.println("Implemente um algoritmo que leia um número e realize a soma dos números entre zero e o número lido.");
                    System.out.println("OBS:: utilize um acumulador para a soma e o contador para a quantidade de repetições do comando.");
                    System.out.print("Digite um numero: ");
                    numero = entrada.nextInt();
                    for (int i = 0; i <= numero; i++){
                        soma = soma + i;
                    }
                    System.out.println("A soma dos numeros é: " + soma);
                    System.out.println("A quantidade de vezes que o comando foi executado: " + (numero + 1) );
                    break;
                }

                case 9:{
                    int numero;
                    System.out.println("Faça um programa que leia um número N e imprima os valores entre 2 e N que são divisores de N");
                    System.out.print("Digite um numero: ");
                    numero = entrada.nextInt();
                    for (int i = 2; i < numero; i++){
                        if (numero % i == 0){
                            System.out.println("O numero: "+ i + " é divisivel");
                        }
                    }
                    System.out.println("Fim");
                    break;
                }

                case 10:{
                    int numero;
                    String bit1, bit2, bit3;
                    System.out.println("Faça um programa que solicita ao usuário para pensar um número de 1 até 8.");
                    System.out.println("Seu número está nesta lista? 1, 3, 5, 7");
                    bit1 = entrada.nextLine();

                    System.out.println("Seu número está nesta lista? 2, 3, 6, 7");
                    bit2 = entrada.nextLine();

                    System.out.println("Seu número está nesta lista? 4, 5, 6, 7");
                    bit3 = entrada.nextLine();
                    
                    int b1 = bit1.equalsIgnoreCase("sim") ? 1 : 0;
                    int b2 = bit2.equalsIgnoreCase("sim") ? 1 : 0;
                    int b3 = bit3.equalsIgnoreCase("sim") ? 1 : 0;

                    numero = (b3 << 2) + (b2 << 1) + b1;
                    if (numero == 0) {
                        numero = 8;
                    }
                    System.out.println("O número que você pensou foi: " + numero + "!");
                    break;
                }

                case 11:{
                    double bruzundangas, milanos;
                    int anos;
                    bruzundangas = 90000000;
                    milanos = 200000000;
                    anos = 0;
                    System.out.println("População da República Democrática dos Bruzundangas");
                    while (bruzundangas <= milanos) {
                        anos = anos + 1;
                        bruzundangas = bruzundangas + (bruzundangas * 0.03);
                        milanos = milanos + (milanos * 0.015);
                    }
                    System.out.println("Demorou " + anos + " anos para Bruzundangas ultrapassar Milanos.");
                    break;
                }

                case 12:{
                    int idade = 0, maior_idade_grupo = 0, menor_idade_grupo = 100, idade_menor_salario = 0, mulheres = 0, homens = 0, indefinido = 0, contador = 0;
                    double salario, media_salario = 0, menor_salario = Double.POSITIVE_INFINITY;
                    String sexo, sexo_menor_salario = null;
                    System.out.println("Para a realização de uma pesquisa entre os habitantes de uma região, faça um algoritmo que receba os dados da população correspondentes à idade, sexo (M/F/I) e salário.");
                    System.out.println("Faça um programa que calcule e mostre:");
                    System.out.println("• A média dos salários do grupo; \n"+
                                        "• A maior e a menor idade do grupo; \n"+
                                        "• A quantidade de mulheres na região; \n"+
                                        "• A idade e o sexo da pessoa que possui o menor salário;");
                    System.out.println("Finalize o programa quando for digitado uma idade negativa.");
                    while (true){
                        // IDADE
                        while (true){
                            System.out.print("Digite a idade: ");
                            idade = entrada.nextInt();
                            if (idade > 100){
                                System.out.println("Idade invalida, digite um valor mais realista");
                            }
                            else {
                                break;
                            }
                        }
                        if (idade < 0){
                            break;
                        }

                        if (idade > maior_idade_grupo){
                            maior_idade_grupo = idade;
                        }
                        if (idade < menor_idade_grupo){
                            menor_idade_grupo = idade;
                        }
                        entrada.nextLine(); // limpa o buffer
                        // SEXO
                        System.out.print("Digite o sexo (M / F / I): ");
                        sexo = entrada.nextLine().trim().toUpperCase();
                        if (sexo.equals("M")) {
                            homens = homens + 1;
                        }
                        else if (sexo.equals("F")) {
                            mulheres = mulheres + 1;
                        }
                        else if (sexo.equals("I")){
                            indefinido = indefinido + 1;
                        }

                        // SALARIO
                        System.out.print("Digite o salário: R$ ");
                        salario = entrada.nextDouble();
                        if (salario < menor_salario){
                            menor_salario = salario;
                            idade_menor_salario = idade;
                            sexo_menor_salario = sexo;
                            if (sexo_menor_salario.equals("M")){
                                sexo_menor_salario = "Homem";
                            }
                            else if (sexo_menor_salario.equals("F")){
                                sexo_menor_salario = "Mulher";
                            }
                            else {
                                sexo_menor_salario = "Indefinido";
                            }
                        }
                        media_salario += salario;
                        contador++;
                    }
                    media_salario = media_salario / contador;

                    System.out.println("A media de salarios do grupo é: R$" + media_salario);
                    System.out.println("A maior idade do grupo é " + maior_idade_grupo + " e a menor idade é " + menor_idade_grupo);
                    System.out.println("A quantidade de mulheres é " + mulheres + " a quantidade de homens é " + homens + " e indefinidos é " + indefinido);
                    System.out.println("A pessoa com menos salario é um(a) " + sexo_menor_salario + " e tem " + idade_menor_salario + " anos.");
                    break;
                }



            
            // Chave switch
            }
            System.out.print("Digite 1 para repetir ou 0 para encerrar: ");
            encerrar = entrada.nextInt();
        // Chave da repetição do aplicativo
        }











        entrada.close();
    // Chave static void
    }
// Chave classe
}
