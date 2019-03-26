package com.nimina;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by kowama
 * Package: com.nimina
 * User: kowama
 * Date: 03/22/2019
 * Time: 13:33
 */


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int year, int month, int day) {
        Date date = java.sql.Date.valueOf(LocalDate.of(year, month, day));
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        return simpleDateformat.format(date).toUpperCase();
    }

}

public class Calendar {
    public static void main(String[] args) throws IOException {
        System.out.println(Result.findDay(1995, 03, 26));
    }
}
