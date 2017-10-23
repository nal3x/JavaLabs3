public class StringExamples {
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("Welcome to");
        sb1.append(" University of Aegean");
        System.out.println("string : "+sb1);

        char c = '!';
        sb1.append(c);
        System.out.println("string : "+sb1);

        sb1.insert(8, "everyone ");
        System.out.println("string : " + sb1);
        
        StringBuilder sb2 = new StringBuilder(15);
        sb2.append(123456789);
        System.out.println("string with length "+ sb2.length() +
                " and capacity "+ sb2.capacity() +
                " appends an int: "+sb2);

        // using String
        String s1 = "Αυτό είναι το αρχικό String";

        // Δεν αλλάζουμε το s1. Δημιουργείται νέο αλφαριθμητικό με κεφαλαία
        // και παραμένει στην μνήμη μέχρι να διαγραφεί κάποια στιγμή
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        
        String s2 = s1.substring(0, 11);
        String s3 = s2.concat("το τροποποιημένο String");
        System.out.println(s3);

        // using StringBuilder
        StringBuilder sb = new StringBuilder("Αυτό είναι το αρχικό StringBuilder");

        // θέτει το μήκος του sb ίσο με 11 και οι χαρακτήρες που 
        // υπολείπονται θα χαθούν
        sb.setLength(11);

        sb.append("το τροποποιημένο StringBuilder");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}


