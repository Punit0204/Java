

public class string_methods {
    
    public static void main(String[] args) {
        String name = "Punit";
       int value = name.length();
        System.out.println(value);


        String uString = name.toUpperCase();
        System.out.println(uString);


        String lString = name.toLowerCase();
        System.out.println(lString);
        

        String nonTrimmedString ="   Punit    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2)); // print words after givin number;
        System.out.println(name.substring(2,5)); // here starting is included
                                                 // and enD is excluded;
        System.out.println(name.replace("unit", "uneet"));// it replace all n by p;
        
        System.out.println(name.startsWith("Pun")); // check weather it start with given name or not;
        System.out.println(name.endsWith("Pun"));

        System.out.println(name.charAt(2)); // what char is at that index;

        System.out.println(name.indexOf("n",1)); // It check string from given indexno.;
        // If it does not match the given index than it returns -1;
        
        String newname = "Puneeteet";
        System.out.println(newname.lastIndexOf("eet",4));

 
        System.out.println(name.equals("punit"));
        // To ignore cases we use new methodd;

        System.out.println(name.equalsIgnoreCase("puNiT"));
    }
}
