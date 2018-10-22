public class Person{

    private String name;
    private String dateofBirth;

    public Person(String name, String dateofBirth){
            this.name = name;
            this.dateofBirth = dateofBirth;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name; 
    }

    public String getBirthDate(){
        return this.dateofBirth;
    }

    public void setBirthDate(String dateofBirth){
        this.dateofBirth = dateofBirth;
    }
}