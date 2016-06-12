//demo 3.4
/* write a class intersection(String a, String b), 
which returns all the characters which are in both strings */

class StringIntersection {
    public static void main(String[] args) {
        System.out.println(intersection(args[0],args[1]));
    }

    public static String intersection(String a, String b) {
        if(b.length() < a.length()) {
            String c = a;
            a = b;
            b = c;
        }
        String ab = "";
        for(int i=0; i < a.length(); i++) {
            for(int j=0; j < b.length(); j++) {
                if(((a.charAt(i) == b.charAt(j))) 
                    && !ab.contains(a.subSequence(i,i+1))) {
                    ab = ab + a.charAt(i);
                }
            }
        }
        return ab;
    }
}