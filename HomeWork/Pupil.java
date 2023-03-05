package HomeWork;

public abstract class Pupil {
    private static int num = 1;
    private int id;
    private String name;
    private int demage;
    private int endurance;

    public Pupil(String name) {
        
    }

    public void getDemage(int demage){}

    public void attack(Pupil pupil){}

    public void heal(Pupil pupil){}

    public void getHealed(){}


}
