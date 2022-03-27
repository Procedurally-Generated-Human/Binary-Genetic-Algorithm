import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        /*
        Population population = new Population(100);
        FitnessCalculator cal = new FitnessCalculator();
        cal.setSolution("0101110101110111010111010111011101011101011101110101110101110111");
        for(int i=0; i!=100; i++){
            population.getIndividuals()[i].calculateFitness();
        }
        System.out.println(population);
        System.out.println(population.getFittest().getData());

         */
        // Set a candidate solution
        FitnessCalculator.setSolution("1111000000000000000000000000000000000000000000000000000000001111");

        // Create an initial population
        Population myPop = new Population(100);

        // Evolve our population until we reach an optimum solution
        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCalculator.maxFitness()) {
            generationCount++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getData());
            myPop = Algorithm.evolvePopulation(myPop);
        }
        System.out.println("Solution found!");
        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());
    }

}
