package org.work;

public class ControleDeFluxo {
    public static void main(String[] args) throws ParametrosInvalidosException {
         int param1 = Integer.parseInt(args[0]);
         int param2 = Integer.parseInt(args[1]);
        if (param1>param2){
            throw new ParametrosInvalidosException("O primeiro número deve ser mais que o segundo!");
        }
        int j = 0;
        for (int i = param1; i<param2; i++){
            System.out.println("Imprimindo o número: " + ++j);
        }
    }
}
