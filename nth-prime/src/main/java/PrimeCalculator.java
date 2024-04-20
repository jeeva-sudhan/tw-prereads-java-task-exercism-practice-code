class PrimeCalculator {

    int nth(int nth) {

        if(nth == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        int primeNum = 2;
        while(count < nth) {
            if(isPrime(primeNum)) {
                count++;
                if(count == nth) {
                    break;
                }
            }
            primeNum++;
        }
        return primeNum;
    }

    boolean isPrime(int num) {
        for(int iterator=2;iterator<=Math.sqrt(num);iterator++) {
            if(num%iterator == 0) {
                return false;
            }
        }
        return true;
    }

}
