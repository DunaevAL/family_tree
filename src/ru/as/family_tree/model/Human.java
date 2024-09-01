package ru.as.family_tree.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Human implements Serializable {
    private String name;
    private LocalDate birthDate;
    private Gender gender;

    public Human(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Дата рождения: " + birthDate + ", Пол: " + gender;
    }
}

