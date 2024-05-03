package chapter12_2;

import java.util.Objects;

public record User(String id, String name) {



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);



    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }
}


