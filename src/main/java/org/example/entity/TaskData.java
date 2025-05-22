package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name){

        switch (name){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;

            case "carol":
                return carolsTasks;
            default:
                return unassignedTasks;
        }

    }

    public Set<Task> getUnion(Set<Task> task1,Set<Task> task2){
     unassignedTasks.addAll(task1);
     unassignedTasks.addAll(task2);
       return unassignedTasks;
    }

    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2) {
        Set<Task> intersection = new HashSet<>(task1);
         intersection.retainAll(task2);
         return intersection;
    }

    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2) {
        Set<Task> intersection = new HashSet<>(task1);
        intersection.removeAll(task2);
        return intersection;
    }
}
