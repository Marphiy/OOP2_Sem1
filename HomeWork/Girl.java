package HomeWork;

public class Girl extends Pupil{

    private static int num = 1;
    private int id;
    private String name;
    private int demage = 8;
    private int endurance = 50;
    
    public Girl(String name) {
        super(name);
        this.name = name;
        this.id = num++;
        System.out.println(this);
    }

    public void getDemage(int demage){
        if(this.endurance > 0) {
            this.endurance -= demage;
            System.out.printf("%s's got demage %d, Endurance is %d\n", this.name, demage, this.endurance);
        }
        else System.out.printf("%s: Stop it, I'm not plaing anymore!\n", this.name);
    }

    public void attack(Pupil pupil){
        if(pupil instanceof Boy) {
            System.out.printf("%s: Here's your kick!...\n", this.name);
        }
        else System.out.printf("%s's pulling pigtails!...\n", this.name);
        pupil.getDemage(this.demage);
    }

    public void heal(Pupil pupil){
        System.out.printf("%s: Got sweets, dear!\n", this.name);
        pupil.getHealed();
    }

    public void getHealed(){
        this.endurance += 7;
        System.out.printf("%s's endurance Encreeses to %d\n", this.name, this.endurance);
    }

    @Override
    public String toString() {
        return String.format("Girl_%d: %s, Endurance %d", id, name, endurance);
    }
    
}
