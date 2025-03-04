import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // 변수
    int age = 20;
    age = 30;

    // char는 '', String은 ""
    char gender = 'M';
    String name = "John Doe";
    boolean married = false;
    float avgAge = 52.1f;
    double avgAge2 = 52.1;

    // byte 최대 크기는 127, 넘으면 -128됨
    byte max = 127;
    byte min = -128;

    // 정수는 기본적으로 int임
    byte sum = (byte)(max + 1);
//    System.out.println(sum); // sout 자동완성

    double a = 0.1;
    double b = 0.2;
//    System.out.println(a + b); // 0.3000~0004

    BigDecimal bd = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    BigDecimal bdsum = bd.add(bd2);
//    System.out.println(bdsum); // 0.3

    // 스트링 풀로 a2와 b2는 같은 변수로 참조됨. 값이 같이바뀜
    String a2 = "Hello World";
    String b2 = "Hello World";
//    System.out.println(a2.equals(b2)); // 문자열 비교

    // 1~100 3과 7의 배수만 출력
//    for(int i = 1; i <= 100; i++) {
//      if(i % 3 == 0 || i % 7 == 0) {
//        System.out.print(i);
//      }
//    }

    // 자바 배열은 길이가 선언시 고정, 늘리고 줄이지 못함
    // 데이터 타입이 하나로 고정됨, 각각 다른방에 int나 string따로 못넣음
    int[] arrInt = {1, 2, 3, 4, 5}; // 잘안씀, 어레이 리스트만 씀
    String[] arrString = {"a", "b", "c"};

    int[] arrInt2 = Arrays.copyOf(arrInt, arrInt.length);

    arrInt2[0] = 100;

    System.out.println(Arrays.toString(arrInt));
  }
}