package execise;

import java.time.LocalDate;

public class seniorMember extends Member {

    private LocalDate birthday;

    public seniorMember(long id, String name, LocalDate birthday) {
        super(id, name);
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int fee() {
        return 700;
    }
}
