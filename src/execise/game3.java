package execise;

import java.nio.channels.spi.SelectorProvider;

public class game3 {
    public static void main(String[] args) {
        Sports s = new Sports();
            s.display();


        }
    }

    class Sports {

        String getName() {
            return "一般的なスポーツ";
        }

        void display() {
            System.out.println(getName() + "の試合人数はn人です");
        }
    }
    class Soccer extends Sports{

        @Override
        String getName() {
            return "一般的なスポーツです";
        }
        @Override
        void display(){
            System.out.println(getName() + "の試合人数はn人です");
        }
    }

