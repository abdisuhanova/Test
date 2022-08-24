public class Ainur extends People{
    public Ainur(int id, String firstName, String lastName, int age, String email, String city){
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Айнур Usaidде иштейт");
    }

    @Override
    public void ToRelax() {
        System.out.println("Айнур Дубайда эс алат");
    }

    @Override
    public void communications() {
        System.out.println("Айнур адамдар менен тез тил табышат");
    }

    @Override
    public void timetable() {
        System.out.println("Айнур жумасына 4 торт жолу 8 сааттан иштейт");
    }
}
