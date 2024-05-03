package execise;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;

    private int glade;

    private ArrayList<String> coser;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGlade() {
        return glade;
    }

    public void setGlade(int glade) {
        this.glade = glade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", glade=" + glade +
                '}';
    }


    public ArrayList<String> getCoser() {
        return coser;
    }

    public void setCoser(ArrayList<String> coser) {
        this.coser = coser;
    }

    public void  addlist(String kyouka) {
        coser.add(kyouka);

    }

    public Student(String name, int glade, ArrayList<String> coser) {
        this.name = name;
        this.glade = glade;
        this.coser = new ArrayList<String>();
    }
}





