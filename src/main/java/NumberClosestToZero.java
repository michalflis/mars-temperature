import java.util.List;

import static java.lang.Math.abs;

public class NumberClosestToZero {

    public int getNumberClosestToZero(List<Integer> list) {
        int length = list.size();
        for (int i = 0; i <= length - 1; i++) {
            if (list.get(i) == 0) return 0;
            else {
                for (int j = 0; j < length - i - 1; ++j) {

                    if (abs(list.get(j)) < abs(list.get(j + 1))) {

                        int swap = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set((j + 1), swap);
                    }
                }
            }
        }
        return list.get(length - 1);
    }
}