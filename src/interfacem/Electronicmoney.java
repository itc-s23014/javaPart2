package interfacem;

public class Electronicmoney implements Paymentmethod,getttengname{
    @Override
    public void pay() {
        System.out.println("端末にかざしてください");
    }

    @Override
    public void names() {
        System.out.println("2:電子マネー");
    }
}
