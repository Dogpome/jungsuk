public class ch03_반올림 {
    // math.round()
    // 실수를 소수점 첫 째자리에서 반올림한 정수를 반환
    // long result = Math.round(4.52); // result 에 5가 저장됨.

    // random한 값 만들기
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <= 5; i+=1){
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
        }
    }


}
