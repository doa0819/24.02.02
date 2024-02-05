package com.ohgiraffer.setion05.logical;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.*/
        /* 필기.
        *   논리 연산자의 우선순위와 활용
        *   논리 & 연산자와 논리 | 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *   논리 && 연산자의 우선순위가 논리 || 연산자 우선순위 보다 높다.*/

        /*목차. 1. 1부터 100  사이의 값인지 확인*/
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >=1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인: " + (num2 >=1 && num2<= 100));

        /* 목차. 2. 영어 대문자인지 확인*/
        char ch1 = 'G';
        int convertCharToInt = ch1;    // 형변환 -> 다른 자료값으로 넘어 갈때 작은거 에서 큰거로 갈때에는 자동형변환이 진행
        System.out.println("convertCharToInt = " + convertCharToInt);

        int convertIntToChar = 100;
        char result = (char) convertIntToChar;      //강제형변환 시킴 -> 작은거에서 큰거로 넘어가기 때문에 강제형변환을 시켜줘야 한다.

        System.out.println("result = " + result);


        System.out.println("영어 대문자 인지 확인 : " + (ch1 >='A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자 인지 확인: " +(ch2 >= 'A' && ch2 <= 'Z'));

        // true or false 로 출력값이 나온다.

        /* 목차. 3. 대소문자 상관 없이 영문자 y 인 지 확인 */
        char ch3 = 'Y';
        System.out.println("영문자 Y 인지 확인: " + (ch3 == 'y' || ch3 == 'Y')); // || 은 둘중 하나만 맞아도 true

        /* 목차. 4. 영문자인지 확인 */   // A-Z , a-z 범위 이면 영어인지 확인 가능
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        // && 가 || 보다 우선순위 이기 때문에 () 한번 더 써줘서 앞에 중가로 먼저 확인 하고 or 로 뒤에 중가로 확인 후 맞으면 true 아니면 false 로 나타난다.
        // () 한번 더 쓰는 이유는 연산자의 우선순위 때문에 써야한다.

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " +( (ch6 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));






    }
}
