package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<Integer>();

    //for(int j=1; j <= 49; ++j){
    //    numbers.add(j);
    //}
    /*SquareSequence qwe = new SquareSequence(0);
    for(int i = 0; i < 5; i++){
        System.out.println(qwe.next());
    }*/
    //SquareSequence asd = new SquareSequence.of(1,2,3,4,5);
    //System.out.println(qwe.of(33, 2, 3, 4, 88, 6, 7, 8));
    //System.out.println(qwe.of());
    //ok dobra nie rozumiem tego zadania
    //jutro zabarc sie za zadanie 1
    //albo jak sie bede czul na silach to za pliki (zad3)

        BigInteger[] testbigint = new BigInteger[3];
        testbigint[0] = BigInteger.valueOf(456456456);
        testbigint[1] = BigInteger.valueOf(556456456);
        testbigint[2] = BigInteger.valueOf(656456456);
        BigInteger[] testbigintf = new BigInteger[3];
        testbigintf[0] = BigInteger.valueOf(456456456);
        testbigintf[1] = BigInteger.valueOf(756456456);
        testbigintf[2] = BigInteger.valueOf(656456456);
        System.out.println(isSorted(testbigint));
        System.out.println(isSorted(testbigintf));

        String[] teststring = new String[3];
        teststring[0] = "abcdef";
        teststring[1] = "bbcdef";
        teststring[2] = "cbcdef";
        String[] teststringf = new String[3];
        teststringf[0] = "zbcdef";
        teststringf[1] = "dbcdef";
        teststringf[2] = "abcdef";
        System.out.println(isSorted(teststring));
        System.out.println(isSorted(teststringf));

        LocalDate[] testtime = new LocalDate[3];
        testtime[0] = LocalDate.of(2000, 8, 27);
        testtime[1] = LocalDate.of(2000, 9, 27);
        testtime[2] = LocalDate.of(2000, 10, 27);
        LocalDate[] testtimef = new LocalDate[3];
        testtimef[0] = LocalDate.of(2000, 10, 27);
        testtimef[1] = LocalDate.of(2000, 9, 27);
        testtimef[2] = LocalDate.of(2000, 8, 27);
        System.out.println(isSorted(testtime));
        System.out.println(isSorted(testtimef));

    }

    //inne klasy
    public static <T extends Comparable<T>> boolean isSorted(T[] tab){
        for(int i = 0; i< tab.length-1; i++){
            if(tab[i].compareTo(tab[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

    /*public class squares implements IntSequence{
        @Override
        public boolean hasNext() {
            return true;
        }
        @Override
        public int next() {
            return 0;
        }
    }*/
    /*public interface IntSequence {
        int i = 0;
        boolean hasNext();
        int next();
        static int of(Integer ... a) {
            ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(a));
            IntSequence ones = new IntSequence() {
                @Override
                public boolean hasNext() {
                    return true;
                }
                @Override
                public int next() {
                    while (n.size() != 0) {
                        return n.remove(0);
                    }
                    return 1;
                }
            };
        return i;
        }
    }*/

    /*public static class SquareSequence implements IntSequence{
        private int i;
        public boolean hasNext(){
            return true;
        }
        public int next(){
            int temp = i;
            i++;
            return temp*temp;
        }
        public SquareSequence(int n){
            i = n;
        }
    }*/


    /*File myObj = new File("sony.txt");
    try {
        if(myObj.createNewFile()){
            System.out.println("jest git");
        } else {
            System.out.println("nie jest git, plik juz istnieje w podanej sciezce:");
            System.out.println(myObj.getAbsolutePath());
        }
    } catch (IOException e){
        System.out.println("nie jest giteeee");
        }


    try {
        FileWriter myWriter = new FileWriter("sony.txt");
        myWriter.write(numbers.get(1));
        myWriter.close();
        System.out.println("gitówa zapisano");
    } catch (IOException e){
        System.out.println("jest źle");

    }*/





}
