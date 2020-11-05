/*
Write the disjunctAll method that accepts a list of IntPredicate's and returns a single IntPredicate.
The result predicate is a disjunction of all input predicates.

If the input list is empty then the result predicate should return false for any integer value
(always false).

Important. Pay attention to the provided method template. Do not change it.
 */

import java.util.List;
import java.util.function.IntPredicate;

public class Task_3_45 {
    public static void main(String[] args) {

    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        IntPredicate disjunction = t -> false;
        if(predicates.size() != 0){
            for(int i=0; i < predicates.size(); i++){
                disjunction = disjunction.or(predicates.get(i));
            }
        }
        return disjunction;
    }
}
