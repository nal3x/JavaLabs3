public class MyVector {
    
    private int[] v; // το διάνυσμα
    private String label; // και η ετικέτα του
	
// Θα δημιουργεί ένα μηδενικό διάνυσμα – δηλαδή θα έχει όλες τις συνιστώσες
// του μηδέν – με πλήθος συνιστωσών dimension και label=”0"
    public MyVector(int dimension) {
    
    }
    
// θα δημιουργεί ένα νέο διάνυσμα με συνιστώσες τα στοιχεία του πίνακα 
// vtemp και ετικέτα l
    public MyVector(int[] vtemp, String l) {
    
    }
    
    public MyVector(MyVector otherVector) {
        //copy constructor!!! should return a copy of otherVector
        
    }

// θα θέτει νέα ετικέτα label στο τρέχον διάνυσμα 
    public void setLabel(String l) {
    
    }

// θα θέτει νέα τιμή value στη θέση index του τρέχοντος διανύσματος 
    public void setValue(int index, int value) {
    
    }

// θα επιστρέφει την τιμή της θέσης index του τρέχοντος διανύσματος 
    public int getValue(int index) {   
    
    }
       
// θα επιστρέφει τον πίνακα με τιμές του τρέχοντος διανύσματος 
    public int[] getVector() {
    
    }
         
// θα επιστρέφει την ετικέτα του τρέχοντος διανύσματος 
    public String getLabel() {

    }
        
 // Θα επιστρέφει την αλφαριθμητική αναπαράσταση του διανύσματος. 
 // Οι τιμές θα τυπώνονται η μια δίπλα στην άλλη με ένα κόμμα ανάμεσά τους 
 // και στο τέλος δεξιά μετά από ένα κενό θα τυπώνεται η ετικέτα του 
 // διανύσματος π.χ. (2,9,7,3,label1) 
    public String toString() {
    
    }
        
// Θα επιστρέφει true εάν το otherVector έχει ίδιο μήκος, 
// τιμές και ετικέτα με το τρέχον διάνυσμα 
    public boolean equals(MyVector otherVector) {
    
    }
                
// Θα επιστρέφει την Ευκλείδεια απόσταση του τρέχοντος διανύσματος 
// από ένα άλλο διάνυσμα otherVector. Η ευκλείδεια απόσταση δυο 
// διανυσμάτων v(v1, v2,…) και u(u1, u2,…) ορίζεται ως 
// d(v,u) = sqrt( (v1-u1)^2 + (v2-u2)^2 + …), 
// (sqrt : συνάρτηση της τετραγωνικής ρίζας)
    public double distance(MyVector otherVector) {

    }
    
    public static void main (String[] args) {
        
    }
    
    
}
