public class Main {

    public static void main(String[] args){
        // Set a candidate solution
        FitnessCalculator.setSolution("1111000000000000000000000000000000000000000000000000000000001111");

        // Create an initial population
        Population myPop = new Population(100);

        // Evolve our population until we reach an optimum solution
        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCalculator.maxFitness()) {
            generationCount++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest());
            myPop = Algorithm.evolvePopulation(myPop);
        }
        System.out.println("Solution found!");
        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());
    }

}
