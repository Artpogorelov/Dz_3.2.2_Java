public class Main {
    public static void main(String[] args) {

        int balanc = 100;
        int payment = 2000;
        int bonus ;
        if (payment < 1000)
             bonus=0;
        else
           bonus = payment / 100;
        int itog = balanc + payment + bonus;
        System.out.println(itog);
        System.out.println(bonus);
    }
}
