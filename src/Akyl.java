public class Akyl extends People{
    public Akyl(int id, String firstName, String lastName, int age, String email, String city){
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Акыл мектепте иштейт");
    }

    @Override
    public void ToRelax() {
        System.out.println("Акыл Ысык Колдо эс алат");
    }

    @Override
    public void communications() {
        System.out.println("Акыл адамдар менен ото жакшы суйлошот");
    }

    @Override
    public void timetable() {
        System.out.println("Акыл жумасына 5 беш жолу 6 сааттан иштейт");
    }
}
