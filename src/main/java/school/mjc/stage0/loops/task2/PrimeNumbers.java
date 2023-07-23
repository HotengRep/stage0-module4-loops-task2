package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        int primeCalc = 0;

        while (counter <= printToInclusive){
            primeCalc = 0;
           for( int i = 2; i < counter; i++ )
           {
               primeCalc = counter%i==0? primeCalc + 1: primeCalc ;
           }
           if(primeCalc == 0){
               System.out.println(counter);
           }

            counter++;

        }
    }
}
