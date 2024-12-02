package ru.vsu.cs.task1;

import java.util.Objects;

public class Illness {
    private String name = "Depression";
    private String category;

    {
        category = "hard";
    }

    public Illness(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Illness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Illness illness = (Illness) o;
        return Objects.equals(name, illness.name) && Objects.equals(category, illness.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

    @Override
    public String toString() {
        return "Illness{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
