package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)
        long l = 9223372036854775807L; //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //실수
        float f = 10.0f;
        double d = 10.0;

        // 저렴한 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초첨을 맞추는 것이 더 효과적이다.
        // 실무에서 자주 사용하는 타입 : 정수 - int , long / 실수 - double /불린형 - boolean / 문자열 - String

    }
}
