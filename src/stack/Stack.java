package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private List<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    // 구현할 메서드 목록은 push(), pop(), peek(), isEmpty(), size(), clear(), contains(element), toArray()

    public void push(T element) {
        elements.add(element);
    }

}
