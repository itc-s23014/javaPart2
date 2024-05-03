package foodshop;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<piza> pizzaList = new ArrayList<>();

    private int total;

    public void piza_add(piza pizars) {

            pizzaList.add(pizars);
        }

        public List<piza> getPizzaList() {
            return pizzaList;
        }
    public void input_total(int price) {
        total+= price;
    }
        public int getTotal() {
        return total;
        }
    }




