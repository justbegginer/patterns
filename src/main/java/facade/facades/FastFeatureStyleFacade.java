package facade.facades;

import facade.CrewProject;

public class FastFeatureStyleFacade extends Style {

    public FastFeatureStyleFacade(CrewProject project) {
        super(project);
    }

    @Override
    public void doProject() {
        project.doAddFeatures();
        project.doAddFeatures();
        project.doAddFeatures();
        project.doAddFeatures();
        project.doFix();
    }

}
