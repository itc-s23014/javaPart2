package execise;


public class menseki {
    private double tate;
    private double yoko;


    @Override
    public String toString() {
        return "menseki{" +
                "tate=" + tate +
                ", yoko=" + yoko +
                '}';
    }

    public double goukei() {
            return (double) (tate * yoko);
        }

    }


