public class Main {
    public static void main(String[] args) {
        People asan = new Asan(12568, "Asan", "Ibraev", 25, "asan@gmail.com", "Naryn");
        People uson = new Uson(12569, "Uson", "Ibraev", 25, "uson@gmail.com", "Naryn");
        People adyl = new Adyl(12570, "Adyl", "Aydarov", 20, "adyl@gmail.com", "Byshkek");
        People akyl = new Akyl(12571, "Akyl", "Kokosherov", 28, "akyl@gmail.com", "Osh");
        People ainur = new Ainur(12572, "Ainur", "Daminova", 30, "ainur@gmail.com", "Osh");
        People[] people = {asan, uson, adyl, akyl, ainur};
        for (People p : people){
            p.work();
            p.ToRelax();
            p.communications();
            p.timetable();
        }
    }
}