import java.util.*;
class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {

        if (p.length() > s.length())
            return new ArrayList<>();

        //sliding window technique
        List<Integer> result = new ArrayList<>();

        // Holds String s
        int[] s1count = new int[26];

        // Holds String p
        int[] s2count = new int[26];

        for (int i = 0; i<p.length(); i++){
            s1count[s.charAt(i) - 'a']++;
            s2count[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1count, s2count)){
            result.add(0);
        }



        int l = 0;
        for (int r = p.length(); r<s.length(); r++){
            s1count[s.charAt(l) - 'a']--;

            s1count[s.charAt(r) - 'a']++;

            if (Arrays.equals(s1count, s2count)){
                result.add(l+1);
            }

            l++;
        }
        return result;
    }
}