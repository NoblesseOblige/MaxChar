import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MaxChar {

    public static void main(String[] args) {
        String str = "hello,my name is shubam.What'syourname?";
        Map<Character,Integer> Cmap=new HashMap<>();
        char Letter[]=str.toCharArray();

        //taking characters from string and counting occurence of each
        for(char c:Letter)
        {
            if(Cmap.containsKey(c))
            {
                Cmap.put(c,Cmap.get(c)+1);
            }
            else
            {
                Cmap.put(c,1);
            }

        }

        //Finding the character having max occurence
        Set<Character> Schar=Cmap.keySet();
        char mChar=' ';
        int max=0;
        for(char c:Schar)
        {
            if(Cmap.get(c)>max)
            {
                mChar=c;
                max=Cmap.get(c);
            }
        }

        //displaying the character having max occurence in String
        System.out.println("max char: "+mChar+" appeared "+max+" times");

    }
}
