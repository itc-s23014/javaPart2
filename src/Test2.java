import javax.lang.model.element.NestingKind;

public class Test2 {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.order("SMALL");

        Drink drink2 = new Drink();
        drink2.order2(Size.EXTRALARGE);
    }
    }
    class Drink {


       /* public static final String SMALL = "SMALL";
        public static final String MEDIUM = "MEDIUM";
        public static final String LAEGE = "LAEGE";
        public static final String EXTRALARGE = "EXTRALARGE";*/

        void order  (String size) {
            System.out.println(size+"が注文されました");


        }
        void order2(Size size){
            System.out.println(size+"が注文されました");
        }
    }

    enum Size {
            SMALL,
            MEDIUM,
            LAEGE,
          EXTRALARGE
    }

