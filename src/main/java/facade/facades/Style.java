package facade.facades;

import facade.CrewProject;

public abstract class Style extends Thread implements StyleInterface {
    protected CrewProject project;
    protected Style(CrewProject project){
        this.project = project;
    }

    @Override
    public void run() {
        while (true) {
            doProject();
            project.show();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
