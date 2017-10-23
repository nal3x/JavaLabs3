//MainClass -> I hate this name for a class...

public class AClass {
    
    private String name = "name"; 
        
    public static int mypow(int a, int b) {
        System.out.println(name);
        int result=1;
        
        for(int i=0; i<b; i++){    
            result = result * a;
        }
        return result;
    }
    
    
    
    public String toString() {
        return name;
    }
    
    
    public static void main(String[] args) {
        System.out.println(mypow(2,10));    
 
        AClass A = new AClass();
        AClass B = new AClass();
        
        System.out.println(A);
        System.out.println(B);
        
        A.name = "newName";
        System.out.println(A);
        System.out.println(B);
        
    }
}
