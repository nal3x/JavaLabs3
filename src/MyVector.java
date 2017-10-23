public class MyVector {
    
    private int[] v; // το διάνυσμα
    private String label; // και η ετικέτα του
	
    public MyVector(int dimension) {
        v = new int[dimension];
        label = "0";
    }
    
    public MyVector(int[] vtemp, String l) {
        v = vtemp; 
        label = l;
    }
    
    public MyVector(String l, int[] vtemp) { //overloaded contructor
        label = l;
        v = new int[vtemp.length];
        for (int i = 0; i < v.length; i++)
            v[i] = vtemp[i];  
    }
    
    public MyVector(MyVector otherVector) { //copy constructor
        label = otherVector.label;
        v = otherVector.v;       
        
    }
//
// θα θέτει νέα ετικέτα label στο τρέχον διάνυσμα 
    public void setLabel(String l) {
        label = l;    
    }

// θα θέτει νέα τιμή value στη θέση index του τρέχοντος διανύσματος 
    public void setValue(int index, int value) {
        v[index] = value;    
    }

//// θα επιστρέφει την τιμή της θέσης index του τρέχοντος διανύσματος 
//    public int getValue(int index) {   
//    
//    }
//       
//// θα επιστρέφει τον πίνακα με τιμές του τρέχοντος διανύσματος 
//    public int[] getVector() {
//    
//    }

    public String getLabel() {
        return label;
    }
       
    public String toString() {
        String s = new String(label + ""
                + "(");
        for (int i : v) {
            s += i + ",";
        }
        s += "\b)";  
        return s;
    }
        
//// Θα επιστρέφει true εάν το otherVector έχει ίδιο μήκος, 
//// τιμές και ετικέτα με το τρέχον διάνυσμα 
//    public boolean equals(MyVector otherVector) {
//    
//    }
                
// Θα επιστρέφει την Ευκλείδεια απόσταση του τρέχοντος διανύσματος 
// από ένα άλλο διάνυσμα otherVector. Η ευκλείδεια απόσταση δυο 
// διανυσμάτων v(v1, v2,…) και u(u1, u2,…) ορίζεται ως 
// d(v,u) = sqrt( (v1-u1)^2 + (v2-u2)^2 + …), 
// (sqrt : συνάρτηση της τετραγωνικής ρίζας)
//    public double distance(MyVector otherVector) {
//
//    }
    
    public static void main (String[] args) {
        
        MyVector vector1 = new MyVector(2);
        System.out.println("Using first constructor " + vector1);
        
        String label = new String("v2");
        int[] components = {1,1};
        
        MyVector vector2 = new MyVector(components, label);
        System.out.println("Using second constructor " + vector2);  
        
        System.out.println();
        label += "1"; //reminder: strings are immutable
        System.out.println("label becomes " + label);
        System.out.println("v2 is not affected(Strings are immutable) " + vector2);
        
        
        components[0] = 4;
        System.out.println("components[0] has changed to " + components[0]);
        System.out.println("v2 is affected(arrays are mutable) " + vector2);
        
        System.out.println();
        components[0] = 1;
        System.out.println("components[0] has changed to " + components[0]);
        MyVector vector3 = new MyVector("v3", components);
        
        System.out.println("v3 is built with 3rd constructor using components[]");
        System.out.println(vector3);
        components[0] = 4;
        System.out.println("components[0] has changed to " + components[0]);
        System.out.println("v3 is not affected " + vector3);
        
        
        System.out.println();
        MyVector vector1Copy = new MyVector(vector1);
        System.out.println("vector1.label == vector1Copy.label is " + 
                (vector1.label == vector1Copy.label));
        System.out.println("v1 is " + vector1);
        System.out.println("Copy of v1 is " + vector1Copy);
        
        System.out.println();
        System.out.println("Using setLabel to change v1's label doesn't affect copy");
        String newLabel = new String("new_label");
        vector1.setLabel(newLabel);
        System.out.println("v1 is " + vector1);
        System.out.println("Copy of v1 is " + vector1Copy);
        
        System.out.println();
        System.out.println("Using setValue to change v1 affects the SHALLOW copy");
        vector1.setValue(0, 5);
        System.out.println("v1 is " + vector1);
        System.out.println("Copy of v1 is " + vector1Copy);
               
    }
    
    
}
