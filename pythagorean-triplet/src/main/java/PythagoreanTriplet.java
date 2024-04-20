import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class PythagoreanTriplet {
    int a,b,c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        PythagoreanTriplet pythagoreanTriplet = (PythagoreanTriplet) obj;
        return this.a == pythagoreanTriplet.a &&
                this.b == pythagoreanTriplet.b &&
                this.c == pythagoreanTriplet.c;
    }

    static TripletListBuilder makeTripletsList() {
        TripletListBuilder tripletListBuilder = new TripletListBuilder();
        return tripletListBuilder;
    }

    static class TripletListBuilder {
        int sum;
        int maxFactor=-1;
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> pythagoreanTripletsList = new ArrayList<>();
            for(int a=1;a<=sum/3;a++) {
                for(int b=a+1;b<=sum/2;b++) {
                    int c =  sum-a-b;

                    if(a+b+c == sum) {
                        if((a*a + b*b == c*c)) {
                            if((maxFactor != -1) && ((a > maxFactor) || (b > maxFactor) || (c > maxFactor))) {
                                continue;
                            }
                            PythagoreanTriplet triplet = new PythagoreanTriplet(a,b,c);
                            pythagoreanTripletsList.add(triplet);
                        }
                    }
                }
            }

            return pythagoreanTripletsList;
        }

    }

}