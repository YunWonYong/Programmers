// package Programmers.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 기능 개발 (42586)
 * - 스택 or 큐 적용해보기
 */

public class DevelopQue {
    public int[] solution(int[] progresses, int[] speeds) {
        Que que = new Que();
        for (int i = 0; i < progresses.length; i++) {
            int days = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            que.enqueDays(days);
        }

        que.proceedDays();
        return que.returnArr();
    }
}

class Que {
    private Queue<Integer> needDays;
    private Queue<Integer> waiting;
    private List<Integer> list;
    private int criterion;
    private int arrSize;
    private int[] arr;

    public Que() {
        needDays = new LinkedList<>();
        waiting = new LinkedList<>();
        list = new ArrayList<>();
    }

    public void enqueDays(int n) {
        needDays.add(n);
    }

    public boolean dequeDays() {
        if (needDays.isEmpty()) {
            distribute();
            return false;
        }

        if (needDays.peek() <= criterion) {
            enqueWaiting(needDays.remove());
        } else {
            if (!checkWaiting()) {
                distribute();
            }
            setBasis(needDays.peek());
        }

        return true;
    }

    public void proceedDays() {
        while(dequeDays()) {}
    }

    public void setBasis(int n) {
        this.criterion = n;
    }

    public boolean checkWaiting() {
        return waiting.isEmpty();
    }

    public void enqueWaiting(int n) {
        waiting.add(n);
    }

    public void distribute() {
        list.add(waiting.size());
        arrSize++;
        waiting.clear();
    }

    public int[] returnArr () {
        arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
