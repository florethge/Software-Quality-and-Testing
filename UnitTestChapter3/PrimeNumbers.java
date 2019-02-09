import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    private List<Integer> primes = new ArrayList<Integer>();

    public void computePrimes(int n){

        int count=1;
        int number = 2;
        boolean isPrime;
        while(count<=n){
            isPrime=true;
            for(int i=0;i<n;i++){
                for(int j=0;j<primes.size();j++){
                    if(number%primes.get(j)==0){
                        isPrime=false;
                    }
                if(isPrime){primes.add(number);}
                if(isPrime&&(number%10!=9)){
                    primes.add(number);
                }
                }
            }
            number ++;
        }
/*
As this algorithm reaches to check multiples of 9 the least it would take a big deal of tests considering 
that you have a number that is large enough, even with the base case for this case which is reaching 19.
Since the algorithm relies on "crossing" numbers by considering them to be multiples of a prime number, it would 
take forever to even see the first fault on a very large number.
*/
 



    }
    @Override
    public String toString(){
        return primes.toString();
    }



}