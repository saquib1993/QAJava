
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
 
public class SetDemo {
    private Set<String> studentHashSet;
    private Set<String> studentTreeSet;
    private Set<String> studentLinkedHashSet;
 
    public SetDemo() {
        studentHashSet = new HashSet<>();
        studentTreeSet = new TreeSet<>();
        studentLinkedHashSet = new LinkedHashSet<>();
    }
 
    public void addStudent(String name) {
        studentHashSet.add(name);
        studentTreeSet.add(name);
        studentLinkedHashSet.add(name);
    }
 
    public void removeStudent(String name) {
        studentHashSet.remove(name);
        studentTreeSet.remove(name);
        studentLinkedHashSet.remove(name);
    }
 
    public boolean checkStudent(String name) {
        return studentHashSet.contains(name);
    }
 
    public void displayStudentsOrderAdded() {
        System.out.println("Students in the order they were added:");
        for (String name : studentLinkedHashSet) {
            System.out.println(name);
        }
    }
 
    public void displayStudentsAlphabetically() {
        System.out.println("Students in alphabetical order:");
        for (String name : studentTreeSet) {
            System.out.println(name);
        }
    }
 
    public static void main(String[] args) {
    	SetDemo exercise = new SetDemo();
        
        exercise.addStudent("Alice");
        exercise.addStudent("Bob");
        exercise.addStudent("Charlie");
        exercise.addStudent("Diana");
 
        System.out.println("Check if 'Bob' is in the collection: " + exercise.checkStudent("Bob"));
 
        exercise.displayStudentsOrderAdded();
        exercise.displayStudentsAlphabetically();
 
        exercise.removeStudent("Charlie");
 
        System.out.println("After removing 'Charlie':");
        exercise.displayStudentsOrderAdded();
        exercise.displayStudentsAlphabetically();
    }
}
