package com.ilearn.springboot.Dto;

import java.util.List;

public class SoftwareEngineerDto  {
    private String name;
    private List<String> techStacks;

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
}
