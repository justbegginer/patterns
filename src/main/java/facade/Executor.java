package facade;

import facade.facades.BalancedFeaturesStyleFacade;
import facade.facades.BugFixStyleFacade;
import facade.facades.FastFeatureStyleFacade;
import facade.facades.Style;

import java.util.ArrayList;

public class Executor {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer(Post.Trainee));
        developers.add(new Developer(Post.Junior));
        Project project = new Project();
        CrewProject crewProject = new CrewProject(project, developers);
        Style style = new FastFeatureStyleFacade(crewProject);
        style.start();
        Thread.sleep(5000);
        style.stop();
        style = new BugFixStyleFacade(crewProject);
        style.start();
        Thread.sleep(10000);
        style.stop();
        style = new BalancedFeaturesStyleFacade(crewProject);
        style.start();
    }
}
