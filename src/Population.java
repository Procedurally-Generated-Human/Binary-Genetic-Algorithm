import java.util.Arrays;

public class Population {

    private Individual[] individuals;

    public Population(int size){
        individuals = new Individual[size];
        for(int i=0; i!=individuals.length; i++){
            individuals[i] = new Individual();
        }
    }

    public void saveIndividual(Individual indiv, int index){
        individuals[index] = indiv;
    }

    public Individual[] getIndividuals(){
        return individuals;
    }

    public Individual getIndividual(int index){
        return individuals[index];
    }

    public Individual getFittest(){
        Individual fittest = individuals[0];
        for(int i=0; i!=individuals.length; i++){
            if(fittest.calculateFitness() < individuals[i].calculateFitness()){
                fittest = individuals[i];
            }
        }
        return fittest;
    }

    public int size(){
        return individuals.length;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i=0; i!=individuals.length; i++){
            result.append(individuals[i].getData()+"\n");
        }
        return result.toString();
    }


}
