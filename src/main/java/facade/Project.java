package facade;

public class Project {
    private int features;
    private int bugs;
    public Project(){
        this.features = 0;
        this.bugs = 0;
    }
    public void show(){
        int sum = features + bugs;
        int greenZonePoints = features*40/sum;
        StringBuilder string = new StringBuilder("[");
        string.append("\u001B[32m");// make string green
        for (int i = 0; i < greenZonePoints; i++) {
            string.append("=");
        }
        string.append("\u001B[31m");// make string red
        for (int i = 0; i < 40 - greenZonePoints; i++) {
            string.append("=");
        }
        string.append("\u001B[0m");// reset color
        string.append("]");
        string.append("\u001B[33m");
        string.append(" Total features -> ");
        string.append("\u001B[0m");// reset color
        string.append(features);
        System.out.println(string);

    }
    public void fixBags(){
        if (this.bugs>=0)
            this.bugs--;
    }
    public void addFeatures(){
        this.features++;
        this.bugs+=2;
    }
}
