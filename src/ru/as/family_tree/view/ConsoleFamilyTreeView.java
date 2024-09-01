package ru.as.family_tree.view;

import ru.as.family_tree.model.Human;

import java.util.List;

public class ConsoleFamilyTreeView implements FamilyTreeView {
    @Override
    public void displayFamilyTree(List<Human> familyTree) {
        System.out.println("=== Семейное древо ===");
        for (Human human : familyTree) {
            System.out.println(human);
        }
    }

    @Override
    public void displayError(String message) {
        System.err.println("Ошибка: " + message);
    }
}

