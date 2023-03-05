package HomeWork;
/***
 * На переменке мальчики и девочки играют в догонялки. Мальчиков пинают, девочек дергают за косички.
 * Изначальный предел выносливости (endurance) мальчиков - 40, девочек - 50.
 * Мальчики приносят урон выносливости 10 у.е., девочки - 8. И те и другие могут повысить
 * выносливость другого, угостив его конфеткой. Чье терпение подходит к концу - 
 * тот выбывает из игры
***/
public class Main {
    public static void main(String[] args) {
        Pupil p1 = new Boy("Mark");
        Pupil p2 = new Boy("Jack");
        Pupil p6 = new Boy("Andy");
        Pupil p7 = new Boy("Loo");
        Pupil p3 = new Girl("Eva");
        Pupil p9 = new Girl("Zoe");
        Pupil p4 = new Girl("Hellen");
        Pupil p8 = new Girl("Ann");
        System.out.println("---------------");
        p6.attack(p1);
        p1.heal(p8);
        p4.attack(p1);
        p1.attack(p8);
        p9.attack(p3);
        p3.heal(p4);
        p2.attack(p7);
        p2.attack(p7);
        p2.attack(p7);
        p2.attack(p7);
        p2.attack(p7);
    }
}
