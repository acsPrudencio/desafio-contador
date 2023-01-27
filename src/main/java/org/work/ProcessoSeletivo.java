package org.work;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        ligarParaCandidato();
    }

    static void ligarParaCandidato(){
        String [] candidatos = {"FILIPE", "JOAO", "ANA", "RAFAELA", "RONALDO"};

        for (int i = 1; i<=candidatos.length; i++){
            Random gerador = new Random();
            for (int  j = 1; j<=3; j++){
                boolean atendeu = gerador.nextInt()%2==0;
                if (atendeu){
                    System.out.println("CONSEGUIMOS CONTATO COM O " + "[" + candidatos[i-1] + "] " + "APOS " + j + " TENTATIVA(S)");
                    break;
                }
                if (j == 3 && !atendeu){
                    System.out.println("NAO CONSEGUIMOS CONTATO COM O(A) " + "[" + candidatos[i-1] + "]");
                }

            }
        }

    }

    static void imprimirCandidatosSelecionados(){
        String [] candidatos = {"FILIPE", "JOAO", "ANA", "RAFAELA", "RONALDO"};

        for (int i = 1; i<=candidatos.length; i++){
            System.out.println("Candidato número: " + i + " " + candidatos[i-1]);
        }


        for (String candidato: candidatos){
            System.out.println("Candidato selecionado: " + candidato);
        }

    }
    public static void selecaoCandidatos() {
        String [] candidatos = {"FILIPE", "JOAO", "ANA", "RAFAELA", "RONALDO", "LUIZ", "LUNA", "BRENA", "JONAS", "SARA"};

        int candidatosSelecionados  = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000d;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            Double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "Solicitou este salario " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    private static Double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000d;
        if (salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
