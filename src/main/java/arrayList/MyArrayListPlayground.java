package arrayList;

import java.util.ArrayList;

public class MyArrayListPlayground {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.add("B");
        System.out.println("arrayList 생성");
        System.out.println(myArrayList.toString());

        System.out.println("index 1인 요소 : " + myArrayList.get(1));
        System.out.println("크기 : " + myArrayList.size());

        System.out.println("isEmpty : " + myArrayList.isEmpty());

        System.out.println(myArrayList.toString());
        System.out.println("A 포함 여부 : " + myArrayList.contains("A"));
        System.out.println("B 포함 여부 : " + myArrayList.contains("B"));
        System.out.println("C 포함 여부 : " + myArrayList.contains("C"));

        myArrayList.set(1, "C");
        System.out.println("arrayList 변경");

        System.out.println(myArrayList.toString());
        System.out.println("A 포함 여부 : " + myArrayList.contains("A"));
        System.out.println("B 포함 여부 : " + myArrayList.contains("B"));
        System.out.println("C 포함 여부 : " + myArrayList.contains("C"));

        System.out.println("제거한 요소 : " + myArrayList.remove(1));

        System.out.println(myArrayList.toString());
        System.out.println("A 포함 여부 : " + myArrayList.contains("A"));
        System.out.println("B 포함 여부 : " + myArrayList.contains("B"));
        System.out.println("C 포함 여부 : " + myArrayList.contains("C"));

        myArrayList.clear();
        System.out.println("초기화");

        System.out.println("isEmpty : " + myArrayList.isEmpty());

    }
}
