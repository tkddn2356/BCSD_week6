package week6.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TestSearch implements Search {
    private List<Integer> list = new ArrayList<Integer>();
    private int key = 9999999; // 찾으려는 키

    // 객체가 생성될 때 랜덤한 수들을 리스트에 넣는다.
    public TestSearch() {
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
    }
    // 순차 탐색을 수행한다.
    @Override
    public void SequentialSearch() {
        System.out.println("SequentialSearch");
        list.indexOf(key);
    }

    // 정렬 ~ 이진탐색까지 시간측정에 넣었다.
    @Override
    public void BinarySearch() {
        System.out.println("BinarySearch");
        Collections.binarySearch(list, key);
    }
}
