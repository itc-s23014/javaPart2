package chapter7_5;

public class StaticJoining {
    private static String csv;
    private static String delimiter;

    public static void init(String _csv,String _delimiter) {
        csv = _csv;
        delimiter = _delimiter;
    }
    public static String add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
        return  s;
    }
    public static String getCsv() {
        return csv;
    }
}

