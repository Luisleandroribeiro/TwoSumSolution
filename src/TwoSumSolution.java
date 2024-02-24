import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        // Mapa para armazenar os números e seus índices
        Map<Integer, Integer> numMap = new HashMap<>();

        // Itera sobre o array de números
        for (int i = 0; i < nums.length; i++) {
            // Valor atual no índice i
            int cur = nums[i];

            // Calcula a diferença entre o target e o valor atual
            int x = target - cur;

            // Verifica se a diferença já foi vista anteriormente
            if (numMap.containsKey(x)) {
                // Retorna os índices dos dois números encontrados
                return new int[] {numMap.get(x), i};
            }

            // Armazena o número atual e seu índice no mapa
            numMap.put(cur, i);
        }

        // Retorna null se nenhum par de números for encontrado
        return null;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        if (result != null) {
            System.out.println("Índices dos números que somam ao target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Nenhum par de números encontrado.");
        }
    }
}
