package ru.as.family_tree;

import ru.as.family_tree.generation_tree.FamilyTree;
import ru.as.family_tree.human.Gender;
import ru.as.family_tree.human.Human;
import ru.as.family_tree.human.Parents;
import ru.as.family_tree.generation_tree.FileHandler;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Human> familyTree = new FamilyTree<>();

        Human human1 = new Human("Александр", LocalDate.of(2000, 2, 1), Gender.Male);
        Human human2 = new Parents("Наталья", LocalDate.of(1977, 6, 23), Gender.Female, "Mother");
        Human human3 = new Parents("Сергей", LocalDate.of(1976, 5, 7), Gender.Male, "Father");
        Human human4 = new Parents("Мария", LocalDate.of(1938, 6, 23), Gender.Female, "Grandmother");
        Human human5 = new Parents("Павел", LocalDate.of(1935, 1, 1), Gender.Male, "Grandfather");
        Human human6 = new Parents("Ольга", LocalDate.of(1936, 11, 8), Gender.Female, "Grandmother");
        Human human7 = new Parents("Вячеслав", LocalDate.of(1936, 7, 25), Gender.Male, "Grandfather");

        familyTree.addMember(human1);
        familyTree.addMember(human2);
        familyTree.addMember(human3);
        familyTree.addMember(human4);
        familyTree.addMember(human5);
        familyTree.addMember(human6);
        familyTree.addMember(human7);

        familyTree.sortByName();
        familyTree.sortByBirthDate();

        FileHandler fileHandler = new FileHandler();
        try {
            fileHandler.save("family_tree.txt", familyTree);
            System.out.println("Family tree saved successfully.");
            FamilyTree<Human> loadedFamilyTree = fileHandler.load("family_tree.txt");

            //loadedFamilyTree.sortByName();
            //loadedFamilyTree.sortByBirthDate();

            System.out.println("Loaded family tree:\n" + loadedFamilyTree);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}