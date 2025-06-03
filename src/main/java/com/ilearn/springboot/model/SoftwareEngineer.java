package com.ilearn.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private List<String> techStacks;


    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, List<String> techStacks) {
        this.id = id;
        this.name = name;
        this.techStacks = techStacks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTechStacks() {
        return techStacks;
    }

    public void setTechStacks(List<String> techStacks) {
        this.techStacks = techStacks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStacks, that.techStacks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStacks);
    }
}
