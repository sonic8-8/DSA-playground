package arrayList;

import java.util.Arrays;

public class MyArrayList<T> {

    // Array는 만들때 크기를 정해야하고 이후 변경이 불가능하죠
    // 이를 자동으로 크기가 변경되게끔 보완한 것이 ArrayList입니다.
    // Array는 정적 배열, ArrayList는 동적 배열이라고 기억하면 됨.

    // 기본 메서드 기능 요구사항 정리
    // 1. MyArrayList는 요소를 추가할 수 있다.
    // 2. MyArrayList는 특정 인덱스의 요소를 반환할 수 있다.
    // 3. MyArrayList는 특정 인덱스의 요소를 변경할 수 있다.
    // 4. MyArrayList는 특정 인덱스의 요소를 제거할 수 있다.
    // 5. MyArrayList는 size를 반환할 수 있다.
    // 6. MyArrayList는 비어있는 상태인지 확인할 수 있다.
    // 7. MyArrayList는 초기화할 수 있다.
    // 8. MyArrayList에 특정 요소가 포함돼있는지 확인할 수 있다.
    // 9. MyArrayList는 자동으로 크기가 조정된다.
    // 10. MyArrayList의 요소를 문자열로 출력할 수 있다.
    // 11. MyArrayList에 포함된 특정 요소의 첫 번째 인덱스를 반환할 수 있다.

    // 추가 구현 목록
    // 메모리 관리
    // 성능 최적화
    // 정렬 (sort)
    // 확장 전략
    // Iterator
    // 스레드 안정성

    // 배열
    // 현재 크기
    // 초기 용량

    private Object[] space;
    private int currentSize;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.space = new Object[DEFAULT_CAPACITY];
        this.currentSize = 0;
    }

    // 1. MyArrayList는 요소를 추가할 수 있다.
    public void add(T element) {
        if (currentSize == space.length) {
            resize();
        }

        space[currentSize] = element;
        currentSize++;
    }

    // 2. MyArrayList는 특정 인덱스의 요소를 반환할 수 있다.
    public T get(int index) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException();
        }

        return (T) space[index];
    }

    // 3. MyArrayList는 특정 인덱스의 요소를 변경할 수 있다.
    public void set(int index, T element) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException();
        }
        space[index] = element;
    }

    // 4. MyArrayList는 특정 인덱스의 요소를 제거할 수 있다.
    public T remove(int index) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException();
        }

        T removedElement = (T) space[index];

        for (int i = index; i < currentSize - 1; i++) {
            space[i] = space[i + 1];
        }
        space[currentSize] = null;
        currentSize--;
        return removedElement;
    }

    // 5. MyArrayList는 size를 반환할 수 있다.
    public int size() {
        return currentSize;
    }

    // 6. MyArrayList는 비어있는 상태인지 확인할 수 있다.
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // 7. MyArrayList는 초기화할 수 있다.
    public void clear() {
        currentSize = 0;
        space = null;
    }

    // 8. MyArrayList에 특정 요소가 포함돼있는지 확인할 수 있다.
    public boolean contains(T element) {
        boolean check = false;

        for (int i = 0; i < currentSize; i++) {
            if (space[i].equals(element)) {
                check = true;
                break;
            }
        }
        return check;
    }

    // 9. MyArrayList는 자동으로 크기가 조정된다.
    private void resize() {
        int newCapacity = space.length * 2;
        space = Arrays.copyOf(space, newCapacity);
    }

    // 10. MyArrayList의 요소를 문자열로 출력할 수 있다.
    public String toString() {
        return Arrays.toString(Arrays.copyOf(space, currentSize));
    }

    // 11. MyArrayList에 포함된 특정 요소의 첫 번째 인덱스를 반환할 수 있다.
    public int indexOf(T target) {
        int index = 0;
        for (int i = 0; i < currentSize; i++) {
            if (space[i].equals(target)) {
                index = i;
                break;
            }
        }
        return index;
    }

}
