package array;

public class MyArrayPlayground {
    public static void main(String[] args) {
        MyArray<String> stringArray = new MyArray<>(5);

        System.out.println(stringArray.get(0));

        stringArray.add("Hello");
        stringArray.add("World");

        System.out.println(stringArray.get(0) + " " + stringArray.get(1));

        stringArray.set(0, "Wow");
        System.out.println(stringArray.get(0) + " " + stringArray.get(1));

        System.out.println("배열의 크기는 " + stringArray.size() + " 입니다.");

    }
}
