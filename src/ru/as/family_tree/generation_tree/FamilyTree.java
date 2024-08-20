package ru.as.family_tree.generation_tree;

import ru.as.family_tree.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T> implements Serializable,  Iterable<T> {
    private List<T> members;

    public FamilyTree() {
        members = new ArrayList<>();
    }

    public int size() {
        return members.size();
    }

    public void addMember(T member) {
        members.add(member);
    }

    @Override
    public Iterator<T> iterator() {
        return members.iterator();
    }

    public void sortByName() {
        if (members.get(0) instanceof Human) {
            members.sort((m1, m2) -> ((Human) m1).getName().compareTo(((Human) m2).getName()));
        }
    }

    public void sortByBirthDate() {
        if (members.get(0) instanceof Human) {
            members.sort((m1, m2) -> ((Human) m1).getBerthDate().compareTo(((Human) m2).getBerthDate()));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Древо: ").append("\n");
        if (!members.isEmpty()) {
            stringBuilder.append(members.get(0)).append("\n");
            stringBuilder.append("---------------------------------------------------------\n");
            if (members.size() > 2) {
                stringBuilder.append("Родители: \n");
                stringBuilder.append(members.get(1)).append("\n");
                stringBuilder.append(members.get(2)).append("\n");
                stringBuilder.append("---------------------------------------------------------\n");
            }
            if (members.size() > 4) {
                stringBuilder.append("Родители мамы: \n");
                stringBuilder.append(members.get(3)).append("\n");
                stringBuilder.append(members.get(4)).append("\n");
                stringBuilder.append("---------------------------------------------------------\n");
            }
            if (members.size() > 6) {
                stringBuilder.append("Родители папы: \n");
                stringBuilder.append(members.get(5)).append("\n");
                stringBuilder.append(members.get(6)).append("\n");
                stringBuilder.append("---------------------------------------------------------\n");
            }
        }
        return stringBuilder.toString();
    }
}
