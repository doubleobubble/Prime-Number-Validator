package me.soaresb.primevalidator;

import java.util.*;

public class PrimeValidator {

    public static void main(String[] args) {

        int i, num = 3, x = 0, temp1;
        List<Integer> primes = new ArrayList<Integer>();

        primes.add(2);
        System.out.println("2");

        while(x == 0) {
            for(i = 0; i < primes.size(); i++) {

                temp1 = num % primes.get(i);

                if(temp1 == 0) {
                    i = primes.size() + 1;
                }
                else if(i == primes.size() - 1) {
                    primes.add(num);
                    System.out.println(num);
                }
            }
            num++;
        }
    }
}
