package array;

public class MyArray<T> {

    // 배열은 Java 언어 수준에서 기본적으로 제공해주는 자료 구조입니다.
    // 즉, 라이브러리가 따로 제공되는게 아니라 JVM 수준에서 구현해야한다는 것임.
    // 이를 위해선 JVM 내부 구조를 이해해야하는데, 이러면 배보다 배꼽이 커지기때문에
    // 나중에 해보기로 하고 우선 배열의 동작 원리를 흉내내는 수준에서 개발해보겠습니다.

    // 1. 고정된 크기
    // 2. 인덱스
    // 3. 연속으로 값이 할당됨
    // 4. 조회가 빠름 (인덱스로 접근할 수 있어서)

    private Object[] space;
    private int capacity; // 용량
    private int elementCount;

    /**
     * 배열 생성자로
     * 고정된 크기와 추가, 삭제가 불편한 것을 구현함
     */
    public MyArray(int capacity) {
        this.capacity = capacity;
        this.elementCount = 0;
        this.space = new Object[capacity];
    }

    /**
     * 배열에 요소를 추가하는 메서드,
     * 인덱스 0부터 순서대로 요소가 채워짐
     */
    public void add(T element) {
        if (elementCount == capacity) {
            throw new IllegalStateException("배열이 가득 찼습니다.");
        }
        space[elementCount] = element;
        elementCount++;
    }

    /**
     * 인덱스로 접근해 요소를 조회할 수 있기 때문에 getter를 구현함
     */
    public T get(int index) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException("잘못된 인덱스 범위입니다.");
        }
        return (T) space[index];
    }

    /**
     * 인덱스로 접근해 요소를 수정할 수 있기 때문에 setter를 구현함
     */
    public void set(int index, T element) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException("잘못된 인덱스 범위입니다.");
        }
        space[index] = element;
    }

    /**
     * 배열의 크기를 반환해주는 메서드
     */
    public int size() {
        return this.capacity;
    }
}
