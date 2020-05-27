package week6.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TestSearch implements Search {
    private List<Integer> list = new ArrayList<Integer>();
    private int key = 9000000;

    public TestSearch() {
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
    }
    @Override
    public void SequentialSearch() {
        System.out.println("SequentialSearch");
        list.indexOf(key);
    }

    @Override
    public void BinarySearch() {
        System.out.println("BinarySearch");
        Collections.binarySearch(list, key);
    }
}
