package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateShiftService {

    public static List<Shift> getContiguousShifts(List<Shift> inputShifts){

        List<Shift> responseList = new ArrayList<Shift>();

        //to do sort list
        List<Shift> sortedList = sort(inputShifts);


        //check for overlapping shifts
        for(int i=0;i<sortedList.size()-1;i++) {
            //compare two shifts and find overlap
            Shift output = new Shift();
            Shift shift1 = sortedList.get(i);
            Shift shift2 = sortedList.get(i + 1);
            Shift lastContiguousShift = null;
            if (shift2.getStartTime().getHour() == shift1.getEndTime().getHour() ||
                    shift2.getStartTime().isBefore(shift1.getEndTime())) {

                if (!responseList.isEmpty()) {
                    lastContiguousShift = responseList.get(responseList.size() - 1);
                    if (shift2.getStartTime().isAfter(lastContiguousShift.getEndTime())) {
                        output.setStartTime(shift1.getStartTime());
                        output.setEndTime(shift2.getEndTime());
                        responseList.add(output);
                    } else if (shift2.getEndTime().isBefore(lastContiguousShift.getEndTime())) {
                        System.out.println(("do nothing"));
                    } else {
                        lastContiguousShift.setEndTime(shift2.getEndTime());
                    }
                } else {
                    output.setStartTime(shift1.getStartTime());
                    output.setEndTime(shift2.getEndTime());
                    responseList.add(output);
                }


            } else {

                if (!responseList.isEmpty()) {
                    lastContiguousShift = responseList.get(responseList.size() - 1);
                    if (!shift2.getEndTime().isBefore(lastContiguousShift.getEndTime())) {
                        output.setStartTime(shift2.getStartTime());
                        output.setEndTime(shift2.getEndTime());
                        responseList.add(output);
                    }

                }
            }
        }
           return responseList;
    }

    private static List<Shift> sort(List<Shift> inputShifts) {

        inputShifts.sort((o1, o2) -> {
            if(o1.getStartTime().isBefore(o2.getStartTime()))
                return -1;
            return 1;
        });
        
        return inputShifts;
    }
}
