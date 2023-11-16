package chapter7_2;

public class joining {

    private String csv;
    private String delimiter;

    public joining(String csv, String delimiter) {
        this.csv = csv;
        this.delimiter = delimiter;
    }


    public joining(String delimiter) {
        this.csv = "";
        this.delimiter = delimiter;
    }
    public joining() {
        this.csv = "";
        this.delimiter = ",";
    }

    public  void add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
    }


    public String getCsv() {
        return csv;
    }
}
