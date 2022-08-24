public class Uson extends People{
    public Uson(int id, String firstName, String lastName, int age, String email, String city){
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Усон фермада иштейт");
    }

    @Override
    public void ToRelax() {
        System.out.println("Усон санаторийде эс алат");
    }

    @Override
    public void communications() {
        System.out.println("Усон адамдар менен анча суйлошпойт");
    }

    @Override
    public void timetable() {
        System.out.println("Усон жумасына 7 жети жолу 12 сааттан иштейт");
    }
}
