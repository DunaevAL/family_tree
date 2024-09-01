package ru.as.family_tree.presenter;

import ru.as.family_tree.model.FamilyTree;
import ru.as.family_tree.model.Human;
import ru.as.family_tree.view.FamilyTreeView;

public class FamilyTreePresenter {
    private final FamilyTreeView view;
    private final FamilyTree model;

    public FamilyTreePresenter(FamilyTreeView view, FamilyTree model) {
        this.view = view;
        this.model = model;
    }

    public void addFamilyMember(Human member) {
        model.addMember(member);
        updateView();
    }

    public void sortFamilyTreeByName() {
        model.sort((h1, h2) -> h1.getName().compareToIgnoreCase(h2.getName()));
        updateView();
    }

    public void sortFamilyTreeByBirthDate() {
        model.sort((h1, h2) -> h1.getBirthDate().compareTo(h2.getBirthDate()));
        updateView();
    }

    private void updateView() {
        try {
            view.displayFamilyTree(model.getMembers());
        } catch (Exception e) {
            view.displayError("Ошибка при обновлении семейного древа.");
        }
    }
}

