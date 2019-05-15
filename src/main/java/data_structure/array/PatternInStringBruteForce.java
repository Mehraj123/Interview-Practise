package data_structure.array;

/**
 * Find the pattern in string by brute force algorithm.
 * return the index of starting point of pattern in string
 * else return -1.
 */
public class PatternInStringBruteForce {

    public static int findPattern(String[] a, String[] pattern) {
        int startIndex = 0;
        for (int i = 0; i < a.length; i++) {
            startIndex = i;
            for (int j=0;j< pattern.length;j++){
                if (a[i] == pattern[j]){
                    i = i+1;
                    if(j == (pattern.length -1)){
                        return startIndex;
                    }
                    if (i>=a.length){
                        return -1;
                    }
                    continue;
                }
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] string = {"A","B","C","D","X","Y","C","D","M","X"};
        String[] pattern = {"D","M","X",};
        System.out.println(findPattern(string,pattern));
        String[] pattern2 = {"D","M","X","N"};
        System.out.println(findPattern(string,pattern2));
        String[] pattern3 = {"D"};
        System.out.println(findPattern(string,pattern3));
    }
}
