

public class FractionNumbersOperationImpls implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null)
            throw new NullPointerException("a == null || b == null");
        FractionNumbersImpls c = new FractionNumbersImpls();
        int delit = 1;
        if (a.getDivisor() == b.getDivisor()) {
            c.setDividend(a.getDividend() + b.getDividend());
            c.setDivisor(a.getDivisor());
        } else {
            c.setDivisor(a.getDivisor() * b.getDivisor());
            c.setDividend(a.getDividend() * b.getDivisor() + b.getDividend() * a.getDivisor());
        }
        for (int i = 1; i < c.getDividend() * c.getDivisor(); i++) {
            if (c.getDividend() % i == 0 && c.getDivisor() % i == 0) {
                c.setDividend(c.getDividend() / i);
                c.setDivisor(c.getDivisor() / i);
            }
        }
        return c;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null)
            throw new NullPointerException("a == null || b == null");
        FractionNumbersImpls c = new FractionNumbersImpls();
        if (a.getDivisor() == b.getDivisor()) {
            c.setDividend(a.getDividend() - b.getDividend());
            c.setDivisor(a.getDivisor());
        } else {
            c.setDivisor(a.getDivisor() * b.getDivisor());
            c.setDividend(a.getDividend() * b.getDivisor() - b.getDividend() * a.getDivisor());
        }
        for (int i = 1; i < c.getDividend() * c.getDivisor(); i++) {
            if (c.getDividend() % i == 0 && c.getDivisor() % i == 0) {
                c.setDividend(c.getDividend() / i);
                c.setDivisor(c.getDivisor() / i);
            }
        }
        return c;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null)
            throw new NullPointerException("a == null || b == null");
        FractionNumbersImpls c = new FractionNumbersImpls();
        c.setDividend(a.getDividend() * b.getDividend());
        c.setDivisor(a.getDivisor() * b.getDivisor());
        for (int i = 1; i < c.getDividend() * c.getDivisor(); i++) {
            if (c.getDividend() % i == 0 && c.getDivisor() % i == 0) {
                c.setDividend(c.getDividend() / i);
                c.setDivisor(c.getDivisor() / i);
            }
        }

        return c;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        if (a == null || b == null)
            throw new NullPointerException("a == null || b == null");
        if (b.getDividend() == 0 || b.getDivisor() == 0)
            throw new ArithmeticException("b.getDividend() == 0 || b.getDivisor() == 0");
        FractionNumbersImpls c = new FractionNumbersImpls();
        c.setDividend(a.getDividend() * b.getDivisor());
        c.setDivisor(a.getDivisor() * b.getDividend());
        for (int i = 1; i < c.getDividend() * c.getDivisor(); i++) {
            if (c.getDividend() % i == 0 && c.getDivisor() % i == 0) {
                c.setDividend(c.getDividend() / i);
                c.setDivisor(c.getDivisor() / i);
            }
        }
        return c;
    }
}
