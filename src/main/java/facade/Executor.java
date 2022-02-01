package facade;

import facade.facades.BalancedFeaturesStyleFacade;
import facade.facades.FastFeatureStyleFacade;
import facade.facades.Style;

import java.util.ArrayList;

public class Executor {
    public static void main(String[] args) {
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer(Post.Trainee));
        developers.add(new Developer(Post.Junior));
        Project project = new Project();
        CrewProject crewProject = new CrewProject(project, developers);
        Style style = new FastFeatureStyleFacade(crewProject);
        style.start();
    }
}
