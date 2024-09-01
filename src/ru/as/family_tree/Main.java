package ru.as.family_tree;

import ru.as.family_tree.model.FamilyTree;
import ru.as.family_tree.model.Gender;
import ru.as.family_tree.model.Human;
import ru.as.family_tree.presenter.FamilyTreePresenter;
import ru.as.family_tree.view.ConsoleFamilyTreeView;
import ru.as.family_tree.view.FamilyTreeView;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree model = new FamilyTree();
        FamilyTreeView view = new ConsoleFamilyTreeView();
        FamilyTreePresenter presenter = new FamilyTreePresenter(view, model);

        Human child = new Human("Александр", LocalDate.of(2000, 2, 1), Gender.MALE);
        Human mother = new Human("Наталья", LocalDate.of(1977, 6, 23), Gender.FEMALE);
        Human father = new Human("Сергей", LocalDate.of(1976, 5, 7), Gender.MALE);
        Human maternalGrandmother = new Human("Мария", LocalDate.of(1938, 6, 23), Gender.FEMALE);
        Human maternalGrandfather = new Human("Павел", LocalDate.of(1935, 1, 1), Gender.MALE);
        Human paternalGrandmother = new Human("Ольга", LocalDate.of(1936, 11, 8), Gender.FEMALE);
        Human paternalGrandfather = new Human("Вячеслав", LocalDate.of(1936, 7, 25), Gender.MALE);

        presenter.addFamilyMember(child);
        presenter.addFamilyMember(mother);
        presenter.addFamilyMember(father);
        presenter.addFamilyMember(maternalGrandmother);
        presenter.addFamilyMember(maternalGrandfather);
        presenter.addFamilyMember(paternalGrandmother);
        presenter.addFamilyMember(paternalGrandfather);

        presenter.sortFamilyTreeByName();
        presenter.sortFamilyTreeByBirthDate();
    }
}


