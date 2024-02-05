package com.ohgiraffer.setion05.logical;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 논리연결연산자의 진리표에 대해 이해할 수 있다. */
        /* 필기.
        *    AND 연산과 OR 연산의 특징
        *   논리식 && 논리식 : 앞이 결고가 false 이면 뒤를 실행 안 함.
        *   논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안 함.*/

        /* 목차. 1. 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실헹 인 힘.*/
        /*필기.
        *  조건식 두 개가 모두 만족해야 true 를 반환 하지만, 앞에서 미리 false 가 나오면
        *  뒤의 조건을 확인할 필요가 없이 false 를 반환한다.
        *  띠라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false 가 나올 가능성이 높은
        *  편을 작성하는 것이 좋다*/

        int num1 = 10;
        int result1 = (false && ++num1 > 0)? num1 : num1; // 앞이 false 이기 때문에 애초에 이 식은 false 이다.
        // && 은 앞에 false 이면 뒤에 연산을 아예 안한다.

        System.out.println("&& 실행 확인 : " + result1  );

        /* 목차. 2. 논리식 || : 앞의 결과가 true 이면 뒤를 실행하지 않는다.*/
        /* 필기.
        *   조건식 둘 중 하나라도 true 를 반환 하면 true 를 반환하기 때문에 앞에서 미리 true 가
        *   나오게 되면 뒤의 조건을 할 필요 없이 true 를 반환한다.
        *   따라서 연산 횟수를 줄이기 위해서는 || 연산의 경우 앞에 true 가 나올 가능성이 높은
        *   조건을 작성하는 편이 좋다. */

        int num2 = 10;
        int result2 = (true || ++num2 > 0)? num2 : num2; // || 앞이 true 이면 뒤에 연산을 하지 않는ㄴ다.

        System.out.println("|| 실행 확인 : "+ result2);

        int nim3 = 10;
        int resul1 = (false || ++nim3 > 0)? nim3 : nim3;
        System.out.println(resul1);

    }
}
