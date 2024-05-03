package chapter12_2;

import java.util.Objects;

public record HashMap(String id, String name) {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashMap user = (HashMap) o;
        return Objects.equals(id, user.id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);

    }
}