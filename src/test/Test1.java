package test;


import main.CalculateShiftService;
import main.Shift;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

    void test() throws Exception {

        Shift shift1 = new Shift();
        shift1.setStartTime(LocalTime.of(8,0));
        shift1.setStartTime(LocalTime.of(10,0));

        Shift shift2 = new Shift();
        shift1.setStartTime(LocalTime.of(10,0));
        shift1.setStartTime(LocalTime.of(12,0));

        Shift shift3 = new Shift();
        shift1.setStartTime(LocalTime.of(14,0));
        shift1.setStartTime(LocalTime.of(19,0));


        List<Shift> input = new ArrayList<>();
        input.add(shift1);
        input.add(shift2);
        input.add(shift3);

        List output = CalculateShiftService.getContiguousShifts(input);



    }
}
