import java.util.ArrayList;
public abstract class People {
    static ArrayList<Integer> idNumbers = new ArrayList<Integer>();
    private int id, age;
    protected String firstName, lastName;
    private String email, city;
    public abstract void work();
    public abstract void ToRelax();
    public abstract void communications();
    public abstract void timetable();
    public void checkName(String name) {
        if (! getClass().getName().equals(name)) {
            System.out.println("Аттарын алмаштырып жатасыз");
        }
        this.firstName = name;
    }
    public void checkAge(int age){
        if (age >= 0 && age <= 110){
            this.age = age;
        }
        else {System.out.println("Tерс сан берууго жана жок жаш берууго болбойт");}
        this.age = 0;
    }
    public void checkiId(int id){
        for (Integer i : idNumbers){
            if (i == (Integer) id){
                System.out.println("Id номер уникалдуу болбоду!");
            }
        }
        this.id = id;
    }
    public void checkEmail(String email){
        if (! email.contains("@")){
            System.out.println("Error");
        }
        this.email = email;
    }
    public People(int id, String firstName, String lastName, int age, String email, String city){
        idNumbers.add(id);
        checkName(firstName);
        checkAge(age);
        checkEmail(email);
        checkiId(id);
        this.lastName = lastName;
        this.city = city;
    }
    public void setId(int id){checkiId(id);}
    public void setEmail(String email){checkEmail(email);}
    public void setAge(int age){checkAge(age);}
    public void setFirstName(String firstName){checkName(firstName);}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setCity(String city){this.city = city;}
    public int getId(){return id;}
    public int getAge(){return age;}
    public String getEmail(){return email;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getCity(){return city;}
}
