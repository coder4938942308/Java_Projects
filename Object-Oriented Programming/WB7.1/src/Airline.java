import java.util.Arrays;

public class Airline {
    private Person[] seats;

    public Airline(){
        this.seats = new Person[11];
        System.out.println(Arrays.toString(this.seats));

    }
    public void setPerson(Person person) {
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }
    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }
    public String search(String name){
        for (int i = 0; i < this.name.length(); i++){
            if (this.people[i].getName().equals(name)){
                System.out.println();
        }
        return "No-one found ";
    }
}
