package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> list = new ArrayList<>();
            for (int element :
                    x) {
                list.add(element / divider);
            }
            return list;
        };
    }
}
