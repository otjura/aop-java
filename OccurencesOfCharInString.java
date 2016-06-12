//demo 5.3
//write method that gets two parametres, one string and one letter
//method returns number of occurences of char in string case not mattering

class OccurencesOfCharInString {
    public static void main(String[] args) {
        int aaa = occurences("viisikko viidakossa", 'k');
        System.out.println(aaa);
    }

    private static int occurences(String str, char x) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == x) {
                count++;    
            }
        }
        return count;
    }
}