package w04_java_topic_2_loops_and_arrays;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args){
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles *1.6;
        System.out.println("You live " + km + " kilometers from school.");
    }

}
