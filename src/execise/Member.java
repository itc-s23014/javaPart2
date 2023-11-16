package execise;

import chapter7_9.Id;

public class Member {
    private long Id;
    private  String name;

    public Member(long id, String name) {
        Id = id;
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int fee () {
        return 0;
    }
}
