package models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.time.LocalDate;

public class ModelCreateStudentRest {
    private String name;
    private LocalDate dateOfBirth;
    private String email;

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
