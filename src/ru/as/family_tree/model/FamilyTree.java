package ru.as.family_tree.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FamilyTree implements Serializable {
    private List<Human> members;

    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    public void addMember(Human member) {
        members.add(member);
    }

    public List<Human> getMembers() {
        return new ArrayList<>(members);
    }

    public void sort(Comparator<Human> comparator) {
        members.sort(comparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Древо семьи:\n");
        for (Human member : members) {
            sb.append(member).append("\n");
        }
        return sb.toString();
    }
}

