package chapter7_3;

public class joining {

    private String csv;
    private String delimiter;

    public joining(String csv, String delimiter) {
        this.csv = csv;
        this.delimiter = delimiter;
    }

    public joining(String delimiter) {
        this("",delimiter);
    }


    public joining() {
        this("",",");
    }


    public  void add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
    }


    public String getCsv() {
        return csv;
    }
}
