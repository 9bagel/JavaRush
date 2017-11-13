package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    /*public boolean equals(Object n) {
        if (n == this)
            return true;

        if (n.getClass() != Solution.class)
            return false;

        Solution solution = (Solution) n;
        return first != null && solution.first.equals(first) && last != null && solution.last.equals(last);
    }

    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + first.hashCode() + last.hashCode();
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) &&
                Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
