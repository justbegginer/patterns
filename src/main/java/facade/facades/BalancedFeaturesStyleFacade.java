package facade.facades;

import facade.CrewProject;

public class BalancedFeaturesStyleFacade extends Style{
    public BalancedFeaturesStyleFacade(CrewProject project) {
        super(project);
    }

    @Override
    public void doProject() {
        project.doAddFeatures();
        project.doAddFeatures();
        project.doFix();
    }
}
