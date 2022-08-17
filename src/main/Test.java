package main;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {


    public static void main (String []args){
        System.out.println("test");
        Shift shift1 = new Shift();
        shift1.setStartTime(LocalTime.of(8,0));
        shift1.setEndTime(LocalTime.of(10,0));

        Shift shift2 = new Shift();
        shift2.setStartTime(LocalTime.of(12,0));
        shift2.setEndTime(LocalTime.of(14,0));

        Shift shift3 = new Shift();
        shift3.setStartTime(LocalTime.of(7,0));
        shift3.setEndTime(LocalTime.of(19,0));

        Shift shift4 = new Shift();
        shift4.setStartTime(LocalTime.of(15,0));
        shift4.setEndTime(LocalTime.of(19,0));


        List<Shift> input = new LinkedList<>();
        input.add(shift1);
        input.add(shift2);
        input.add(shift3);
        input.add(shift4);

        List output = CalculateShiftService.getContiguousShifts(input);


    }
}
