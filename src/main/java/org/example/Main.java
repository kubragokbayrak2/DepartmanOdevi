package org.example;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String teamLead;
    private List<String> personnelList;
    private List<String> assignmentList;

    public Department(String teamLead) {
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void changeTeamLead(String newTeamLead) {
        this.teamLead = newTeamLead;
    }

    public void addPersonnel(String person) {
        personnelList.add(person);
    }

    public void removePersonnel(String person) {
        personnelList.remove(person);
    }

    public void changePersonnel(String oldPerson, String newPerson) {
        int index = personnelList.indexOf(oldPerson);
        if (index != -1) {
            personnelList.set(index, newPerson);
        }
    }

    public void addAssignment(String assignment) {
        assignmentList.add(assignment);
    }

    public void markAssignmentCompleted(String assignment) {
        assignmentList.remove(assignment);
    }

    public String getTeamLead() {
        return teamLead;
    }

    public List<String> getPersonnelList() {
        return personnelList;
    }

    public List<String> getAssignmentList() {
        return assignmentList;
    }
}

class Male {
    private String firstName;
    private String lastName;
    private String birthDate;

    public Male(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int calculateRetirementAge() {
        return 65;
    }
}

class Female {
    private String firstName;
    private String lastName;
    private String birthDate;

    public Female(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int calculateRetirementAge() {
        return 60;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage of the classes

        Department department = new Department("John Doe");

        department.addPersonnel("Alice");
        department.addPersonnel("Bob");

        department.addAssignment("Task 1");
        department.addAssignment("Task 2");

        displayDepartmentState(department);

        department.changeTeamLead("Jane Smith");
        department.removePersonnel("Bob");
        department.changePersonnel("Alice", "Charlie");
        department.markAssignmentCompleted("Task 1");

        displayDepartmentState(department);

        Male male = new Male("John", "Doe", "1990-01-01");
        Female female = new Female("Jane", "Smith", "1995-05-15");

        int maleRetirementAge = male.calculateRetirementAge();
        int femaleRetirementAge = female.calculateRetirementAge();

        System.out.println("Male retirement age: " + maleRetirementAge);
        System.out.println("Female retirement age: " + femaleRetirementAge);
    }

    private static void displayDepartmentState(Department department) {
        System.out.println("Team Lead: " + department.getTeamLead());
        System.out.println("Personnel List: " + department.getPersonnelList());
        System.out.println("Assignment List: " + department.getAssignmentList());
        System.out.println("---------------");
    }
}