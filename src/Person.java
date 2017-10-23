public class Person {
	
    private String name;
    private int age;

    public Person(String n, int a) {
        name=n;
        age=a;
    }

    public void addYear() {
        age++;
    }
    
    public String toString() {
        return name + " " + age; 
    }

    public static void main(String args[]) {
        // Δημιουργία του πίνακα με αναφορές αντικειμένων τύπου Person
        Person[] persons = new Person[3];
        // Δημιουργία αντικειμένου για κάθε στοιχείο του πίνακα
        persons[0]=new Person("Maria", 20);
        persons[1]=new Person("Anna", 25);
	persons[2]=new Person("Nikos", 40);

        for (int i=0; i < persons.length; i++)
            System.out.println(persons[i]);  
        
        for (int i = 0; i < persons.length; i++) 
            for (int j = 0; j < 2; j++)
                persons[i].addYear();  
        
        for (int i=0; i < persons.length; i++)
            System.out.println(persons[i]);
    
    } 
}


