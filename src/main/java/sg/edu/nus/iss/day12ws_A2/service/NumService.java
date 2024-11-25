package sg.edu.nus.iss.day12ws_A2.service;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class NumService 
{
    public Set<Integer> generateNumbers(Integer n)
    {
        Set<Integer> randomNumbers = new LinkedHashSet<>(); // Holds unique numbers

        Random rand = new Random();
        

        while(randomNumbers.size() < n)
        {
            randomNumbers.add(rand.nextInt(1,21));
        }

        return randomNumbers;
    }
    
}
