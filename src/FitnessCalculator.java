public class FitnessCalculator {

    static final int solution_size = 64;
    static byte[] solution = new byte[solution_size];

    public static void setSolution(byte[] newSolution){
        solution = newSolution;
    }
    static void setSolution(String newSolution) {
        solution = new byte[newSolution.length()];
        for (int i = 0; i < newSolution.length(); i++) {
            String character = newSolution.substring(i, i + 1);
            if (character.contains("0") || character.contains("1")) {
                solution[i] = Byte.parseByte(character);
            } else {
                solution[i] = 0;
            }
        }
    }

    static int calculate(Individual individual){
        int result = 0;
        for(int i=0; i!=solution_size; i++){
            if(individual.getGenes()[i]==solution[i]){
                result += 1;
            }
        }
        return result;
    }

    static int maxFitness(){
        return solution.length;
    }
}
