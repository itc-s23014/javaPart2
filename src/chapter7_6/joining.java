package chapter7_6;

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

    public static void main(String[] args) {
        joining j = new joining("",",");

        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
    }
}


