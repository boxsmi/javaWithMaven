

public class FractionNumbersImpls implements FractionNumber {
    private int divident;
    private int divisor;

    @Override
    public void setDividend(int dividend) {
        this.divident = dividend;
    }

    @Override
    public int getDividend() {
        return this.divident;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        if (divisor == 0)
            throw new IllegalArgumentException("divisor == 0");
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return (double)this.divident / (double)this.divisor;
    }

    public String toString(){

        return String.valueOf(this.divident)+'/'+String.valueOf(this.divisor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumbersImpls that = (FractionNumbersImpls) o;
        return divident == that.divident &&
                divisor == that.divisor;
    }


}
