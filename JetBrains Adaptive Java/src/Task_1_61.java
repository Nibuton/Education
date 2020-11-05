/*
You should write a program that can transform some units of measurement into others.

The following transformations should be supported:

miles (1 mile = 1609 m),
yards (1 yard = 0.9144 m),
feet (1 foot = 30.48 cm),
inches (1 inch = 2.54 cm),
kilometres (1 km = 1000 m),
meters (m),
centimetres (1 cm = 0.01 m)
millimetres (1 mm = 0.001 m)
Use the units of measurement specified in the problem description with the exact specified accuracy.

Input format:
Single line in the following format:
<number> <unit_from> in <unit_to>
For example: if you get the line "15.5 mile in km", then you should transform 15.5 miles into kilometers.

Output format:
Real number in scientific format (exponential), with an accuracy of exactly two digits after decimal point.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1_61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] command = scanner.nextLine().split(" ");
        Map<String, Double> measures = new HashMap<String, Double>();
        setParams(measures);
        Double answer = measures.get(command[1]) / measures.get(command[3]) * Double.valueOf(command[0]);
        System.out.format("%.2e", answer);
    }

    static void setParams(Map<String, Double> map){
        map.put("mile", 1609.0);
        map.put("yard", 0.9144);
        map.put("foot", 0.3048);
        map.put("inch", 0.0254);
        map.put("km", 1000.0);
        map.put("m", 1.0);
        map.put("cm", 0.01);
        map.put("mm", 0.001);
    }
}
