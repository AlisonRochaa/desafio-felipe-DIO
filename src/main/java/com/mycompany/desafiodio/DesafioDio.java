/*
O que deve ser usado: variáveis, operadores, laços de repetição, estrutura de decisões(if,else,switch)
Crie uma variável para armazenar o nome e a quantidade de XP de um herói, depois utilize uma estrutura de decisões para apresentar alguma
das mensagens abaixo:
Se xp menor que 1000 = ferro
Se xp for entre 1001 e 2000 = bronze
Se xp for entre 2001 e 6000 = prata
Se xp for entre 6001 e 7000 = ouro 
Se xp for entre 7001 e 8000 = platina
Se xp for entre 8001 e 9000 = ascendente
Se xp for entre 9001 e 10000 = imortal
Se xp for maior ou igual a 10001 = radiante

Ao final deve-se exibir a mensagem:
O herói de nome "nome" está no nível de "nível" 
*/
package com.mycompany.desafiodio;
import java.util.Scanner;
public class DesafioDio {

    public static void main(String[] args) {;
        Scanner digite = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("Digite o nome do herói: ");
            String nomeHeroi = digite.next();
            System.out.println("Digite a quantidade de XP do seu herói: ");
            int quantidadeXp = digite.nextInt();
            String nivelHeroi = "definir"; 
                if(quantidadeXp < 1000){
                     nivelHeroi = "Ferro";   
                } else if(quantidadeXp >= 1001 && quantidadeXp <= 2000){
                     nivelHeroi = "Bronze";
                }else if(quantidadeXp >= 2001 && quantidadeXp <= 6000){
                     nivelHeroi = "Prata";
                }else if(quantidadeXp >= 6001 && quantidadeXp <= 7000){
                     nivelHeroi = "Ouro";
                }else if(quantidadeXp >= 7001 && quantidadeXp <= 8000){
                     nivelHeroi = "Platina";
                }else if(quantidadeXp >= 8001 && quantidadeXp <= 9000){
                     nivelHeroi = "Ascendente";
                }else if(quantidadeXp >= 9001 && quantidadeXp <= 10000){
                     nivelHeroi = "Imortal";
                }else if(quantidadeXp >= 10001){
                     nivelHeroi = "Radiante";
        }
            System.out.println("O herói de nome "+nomeHeroi+" está no nível de " +nivelHeroi+"!!");
            System.out.println("Digite 1 para realizar nova consulta: ");
                int novaConsulta = digite.nextInt();
                switch(novaConsulta){
                    case 1:
                        i++;
                        break;
                    default: 
                        i--;
        }
        } while(i==1);
            System.out.println("Obrigado por utilizar nossos serviços!");
        }
    }
    
