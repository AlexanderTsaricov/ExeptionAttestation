package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Checks {
    public boolean dataCheck (String data) {
        String[] arrData = data.split(".");
        int[] intArrData = new int[arrData.length];
        for (int i = 0, j = 2; i < intArrData.length; i++, j--) {
            try {
                intArrData[i] = Integer.parseInt(arrData[j]);
            } catch (Exception e){
                System.out.println(e.getMessage());
                return false;
            }
        }
        try {
            DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(intArrData[0], intArrData[1], intArrData[2]));
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean countInputDataCheck (String[] input) {
        if (input.length == 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sexCheck (String sex) {
        if (sex.equals("m") || sex.equals("f")) {
            return true;
        } else {
            return false;
        }
    }
}
