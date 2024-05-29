package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> history = new ArrayDeque<>();

    public void visitPage(String s) {
        System.out.println("방문: " + s);
        history.push(s);
    }

    public String goBack() {
        if (history.isEmpty()){
            return null;
        }
        String his = history.pop();
        System.out.println("뒤로 가기: " + his);
        return his;
    }
}
