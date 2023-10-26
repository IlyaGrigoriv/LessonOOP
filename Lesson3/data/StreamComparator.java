package org.example.Repeat.Lesson3.data;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        if(stream1.getAmountGroup() > stream2.getAmountGroup()) {
            return 1;
        } else if (stream1.getAmountGroup() < stream2.getAmountGroup()) {
            return -1;
        }else return 0;
    }
}
/**
 * 1 реализует сравнение количества групп входящих в поток
 * 2 сравнивает сколько групп в потоке
 */
