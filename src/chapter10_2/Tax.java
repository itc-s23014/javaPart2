package chapter10_2;

public class Tax {

    private long number;
    private String name;
    private int shotoku;

    public Tax(long number, String name, int shotoku) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
    }
    public int zeigaku(Rateintf f) {
        return (int)(shotoku * f.taxRate(shotoku));

    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getShotoku() {
        return shotoku;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", shotoku=" + shotoku +
                '}';
    }
}
