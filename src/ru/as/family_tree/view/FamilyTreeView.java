package ru.as.family_tree.view;

import ru.as.family_tree.model.Human;

import java.util.List;

public interface FamilyTreeView {
    void displayFamilyTree(List<Human> familyTree);
    void displayError(String message);
}

