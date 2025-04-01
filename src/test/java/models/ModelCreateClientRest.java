package models;

import lombok.SneakyThrows;

import java.time.LocalDate;

public class ModelCreateStudentRest {
    {
        "email": "client@email.com",
            "name": "Client Client",
            "gender": 0,
            "birthday": "2005-03-31T19:29:57.8132473-05:00"
    }
    private String name;
    private LocalDate birthday;
    private String email;

    private String gender;

    public ModelCreateStudentRest() {
    }

    public ModelCreateStudentRest(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @SneakyThrows
    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name + '\"' +
                ", \"dateOfBirth\":"+ '\"'  + dateOfBirth+ '\"' +
                ", \"email\":\"" + email + '\"' +
                '}';
    }

}
