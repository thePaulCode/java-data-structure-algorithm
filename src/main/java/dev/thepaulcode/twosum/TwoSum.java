package dev.thepaulcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Metodo para retonar os indices que somados resultam no alvo - target
    public int[] twoSum(int[] nums, int target){
        // HashMap para armazenar os valores e seus indices
        Map<Integer, Integer> mapa = new HashMap<>();

        for(int i = 0; i < nums.length; i++  ){
            // Calculo do complemento para atingir o alvo
            int complemento = target - nums[i];

            // Verifica se o complemento ja existe no mapa
            if(mapa.containsKey(complemento))
                // Se existir, retorna os indices do complemento e do numero atual
                return new int[] {mapa.get(complemento), i};

            // Caso contrario, adicionamos o numero atual a seu indice no mapa
            mapa.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String args[]){

        int[] myArray = {7, 2, 9, 8 , 1 , 5};
        int target = 6;

        TwoSum calcular = new TwoSum();

        System.out.println("\n\t Retorno: " + Arrays.toString(calcular.twoSum(myArray, target)));

    }
}
