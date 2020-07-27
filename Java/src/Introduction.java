public class Introduction {
    public static void main(String[] args) {
        // 변수 정의
        String name = new String();
        int year, month, day;
        boolean married;

        // 값 대입
        name = "코드잇";
        year = 2015;
        month = 7;
        day = 20;
        married = false;

        // 자기 소개
        System.out.printf("이름: %s\n", name);
        System.out.printf("생일: %d년 %d월 %d일\n", year, month, day);
        System.out.printf("결혼: %b", married);

    }
}
