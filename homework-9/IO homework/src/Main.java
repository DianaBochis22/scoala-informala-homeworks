/**
 * Created by Diana Bochis on 08/02/2017.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.text.*;
import java.util.Date;


public class Main  {

    public static void main(String[] args) throws IOException, ParseException {

        //read from the file
        FileReader file = new FileReader("C://Users//Alex Bochis//Desktop//Athletes.csv");
        BufferedReader reader = new BufferedReader(file);

        String lines = "";
        String unparsedFile = "";
        String myArray[];

        while ((lines = reader.readLine()) != null) {
            unparsedFile += lines;
        }
        reader.close();
        myArray = unparsedFile.split(",");

        for (String item : myArray) {
            System.out.println(item);
        }

        //unordered list with all the athletes from the file
        List<Athlete> athletes = new ArrayList<>();

       Athlete athlete1 = new Athlete(11, "Umar Jorgson", "SK", 27, 30,30-27,"xxxox","xxxxx","xxoxo" );
       Athlete athlete2 = new Athlete(1, "Jimmy Smiles", "UK", 15, 29, 29-15, "xxoox", "xooxo", "xxxxo");
       Athlete athlete3 = new Athlete(27, "Piotr Smitzer", "CZ", 10, 30, 30-10, "xxxxx", "xxxxx", "xxxxx");

        //add athletes to our list and after evaluate them, sort them according to their time performance
        athletes.add(athlete1);
        athletes.add(athlete2);
        athletes.add(athlete3);

        System.out.println("Unordered list of athletes:" + athletes);

//small chronometer which mimics that it prints the minutes and the seconds an athlete achieves;
        Chronometer ch = new Chronometer();

        ch.start();
        for (int i = 1; i < 10000000; i++) {
        }
        ch.stop();
        System.out.println(ch.getTime());

        ch.start();
        for (int i = 10000000; i > 0; i--) {
        }
        ch.stop();
        System.out.println(ch.getTime());

        //method that adds seconds to initial time of the athlete;
        DateFormat df = new SimpleDateFormat("mm:ss"); //pattern used for time
//first athlete, his initial time and 30 penalty seconds added to it.
        Date date = df.parse("30:27");
        System.out.println("time:" + df.format(date));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.SECOND, 30); //penalty seconds
        date = cal.getTime();
        System.out.println("time for Umar Jorgson +30 seconds penalty: " + df.format(date));

//second athlete, his initial time and 60 penalty seconds added to it.
        DateFormat df2 = new SimpleDateFormat("mm:ss"); //pattern used for time
        Date date2 = df2.parse("29:15");
        System.out.println("time:" + df2.format(date2));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        cal2.add(Calendar.SECOND, 60); //penalty seconds
        date2 = cal2.getTime();
        System.out.println("time for Jimmy Smiles  +60 seconds penalty: " + df.format(date2));

//third athlete, his initial time and 0 penalty seconds added to it.
        DateFormat df3 = new SimpleDateFormat("mm:ss"); //pattern used for time
        Date date3 = df3.parse("30:10");
        System.out.println("time:" + df3.format(date3));
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(date3);
        cal3.add(Calendar.SECOND, 0); //penalty seconds
        date3 = cal3.getTime();
        System.out.println("time for Piotr Smitzer  +0 seconds penalty: " + df.format(date3));

//method that compares the athletes and orders them according to their performance;
        //prints them in a new list;
        // sort the list


    }

    }

