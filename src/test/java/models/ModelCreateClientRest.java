package models;

import lombok.SneakyThrows;

import java.time.LocalDate;

public class ModelCreateClientRest {
    private String name;
    private LocalDate birthday;
    private String email;
    private Integer gender;

    public ModelCreateClientRest() {
    }

    public ModelCreateClientRest(String name, LocalDate dateOfBirth, String email, Integer gender) {
        this.name = name;
        this.birthday = dateOfBirth;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return birthday;
    }

    public void setDateOfBirth(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender){ this.gender = gender;}

    @SneakyThrows
    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name + '\"' +
                ", \"birthday\":"+ '\"'  + birthday+ '\"' +
                ", \"email\":\"" + email + '\"' +
                ", \"gender\":" + gender  +
                '}';
    }

}
