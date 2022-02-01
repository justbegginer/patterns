package facade.facades;

import facade.CrewProject;

public class BugFixStyleFacade extends Style{
    public BugFixStyleFacade(CrewProject project) {
        super(project);
    }

    @Override
    public void doProject() {
        project.doFix();
        project.doFix();
        project.doFix();
        project.doAddFeatures();
    }
}
