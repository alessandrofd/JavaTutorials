package collections.interfaces;

import java.util.HashSet;
import java.util.Set;

public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
