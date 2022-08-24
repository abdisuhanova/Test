public class Asan extends People{
    public Asan(int id, String firstName, String lastName, int age, String email, String city){
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Асан Optima банкта иштейт");
    }

    @Override
    public void ToRelax() {
        System.out.println("Асан Боз-Териде эс алат");
    }

    @Override
    public void communications() {
        System.out.println("Асан адамдар менен жакшы суйлошот");
    }

    @Override
    public void timetable() {
        System.out.println("Асан жумасына 5 беш жолу 8 сааттан иштейт");
    }
}
