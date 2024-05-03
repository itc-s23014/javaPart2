public class Test3 {
    public static void main(String[] args) {
        Season sp = Season.SPRING;
        System.out.println(sp);
        System.out.println(sp.ordinal());
        for (Season s: Season.values()){
            System.out.println(s.name());
        }
    }
}
enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}