package chapter10_2;

public class Rate1 implements Rateintf{
    @Override
    public double taxRate(int gaku) {
        return gaku > 100 ? 0.1 : 0.5;
    }
}
