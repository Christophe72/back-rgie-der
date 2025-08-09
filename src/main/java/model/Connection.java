package model;

import java.util.List;

public class Connection {
    private String name;
    private String description;
    private String diagram;
    private List<String> steps;
    private List<String> bestPractices;

    public Connection() {}

    public Connection(String name, String description, String diagram, List<String> steps, List<String> bestPractices) {
        this.name = name;
        this.description = description;
        this.diagram = diagram;
        this.steps = steps;
        this.bestPractices = bestPractices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiagram() {
        return diagram;
    }

    public void setDiagram(String diagram) {
        this.diagram = diagram;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public List<String> getBestPractices() {
        return bestPractices;
    }

    public void setBestPractices(List<String> bestPractices) {
        this.bestPractices = bestPractices;
    }
}
