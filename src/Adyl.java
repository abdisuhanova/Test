public class Adyl extends People{
    public Adyl(int id, String firstName, String lastName, int age, String email, String city){
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Адыл Peaksoftто иштейт");
    }

    @Override
    public void ToRelax() {
        System.out.println("Адыл Турцияда эс алат");
    }

    @Override
    public void communications() {
        System.out.println("Адыл адамдар менен коп суйлошпойт");
    }

    @Override
    public void timetable() {
        System.out.println("Адыл жумасына 5 беш жолу 7 сааттан иштейт");
    }
}
