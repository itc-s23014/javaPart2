package kimatuTest;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class mario implements Attack {
    @Override
    public void attack() {
        System.out.println("マリオがパンチした");

    }
    public void  Deathblow() {
        System.out.println("マリオがスーパーパンチ");
    }

}



