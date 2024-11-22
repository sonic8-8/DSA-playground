package array;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyArrayTest {

    @DisplayName("MyArray는 size() 메서드로 크기를 확인할 수 있다.")
    @Test
    void size() {
        // given
        MyArray<String> array = new MyArray<>(5);

        // when
        int size = array.size();

        // then
        assertThat(size).isEqualTo(5);
    }

    @DisplayName("MyArray는 인덱스로 접근해 데이터를 변경할 수 있다.")
    @Test
    void set() {
        // given
        MyArray<String> array = new MyArray<>(5);

        // when
        array.set(0, "Hello");
        array.set(1, "World");

        // then
        assertThat(array.get(0)).isEqualTo("Hello");
        assertThat(array.get(1)).isEqualTo("World");

    }



}