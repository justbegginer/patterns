package facade;

import java.util.ArrayList;

public class CrewProject {
    private Project project;
    private ArrayList<Developer> crew;
    public CrewProject(Project project,ArrayList<Developer> crew){
        this.project = project;
        this.crew = crew;
    }
    public void show(){
        project.show();
    }
    private int countProductivity(){
        int result = 0;
        for (int i = 0; i < crew.size(); i++) {
            result += crew.get(i).getProductivity();
        }
        return result;
    }
    public void doFix(){
        for (int i = 0; i < countProductivity(); i++) {
            project.fixBags();
        }
    }
    public void doAddFeatures(){
        for (int i = 0; i < countProductivity(); i++) {
            project.addFeatures();
        }
    }
}
