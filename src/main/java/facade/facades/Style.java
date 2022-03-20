package facade.facades;

import facade.CrewProject;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Style extends Thread implements StyleInterface {
    protected CrewProject project;

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
