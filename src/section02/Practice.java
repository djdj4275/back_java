package section02;

public class Practice {
  public static void main(String[] args) {
    String name = "김일남";
    byte age = 99;
    // float 형에 맞는 범위로 사용하면 메모리를 줄일 수 있지만
    // 단일 변수로 인한 메모리 절약은 큰 차이가 없고, double이 더 높은 정밀도를 가지기에
    // 금융계산과 같은 정밀 계산시에는 double이 적합하며, 현대의 하드웨어가 double에 적합하도록
    // 최적화 되어있어서 double에 대한 연산이 훨씬 빠르다
    // 프로그래밍 관행적으로도 대부분의 수치연산은 double을 사용이 권장되며 java에서도 기본적으로
    // 숫자 리터럴은 double로 취급되기때문에 특별한 이유가 없는한 double 사용이 나음
    // (또한, Math 클래스의 메소드들도 기본적으로 double을 매개변수로 받음)
    double height = 169.9;
    float weight = 59.9f;
    char bloodType = 'A';

    System.out.println(name);
    System.out.println(age);
    System.out.println(height);
    System.out.println(weight);
    System.out.println(bloodType);

    // ex1 (한 변수를 응용해서 x, y값 자리 바꾸기)
    // * swap
    int x = 5;
    int y = 10;
    int temp;

    // 내 풀이
    temp = y - x; 
    y = x;
    x = x + temp;

    // 정답 풀이
    temp = x;
    x = y;
    y = temp;

    System.out.println(x); // x : 10 
    System.out.println(y); // y : 5 

    // ex2 (pi를 상수로 바꾸기)
    // 보통 상수는 main 밖에서 선언후 사용하는것이 보통 관례
    final double PI = 3.141592653589793; // final로 변경
    double redius = 5.0;

    double circumference = 2 * redius * PI;

    System.out.println("원의 둘레 : " + circumference);

    // char 타입은 증감 연산자 사용가능
    char a = 'a';

    System.out.println(++a); // b
    System.out.println(++a); // c
    System.out.println((int)a); // 99

    // 이항 - 논리 연산자

    // 논리곱 (AND)
    System.out.println("true && true\t: "+ (true && true)); // true
    System.out.println("true && false\t: "+ (true && false)); // false
    System.out.println("false && true\t: "+ (false && true)); // false
    System.out.println("false && false\t: "+ (false && false)); // false

    // 논리합 (OR)
    System.out.println("true || true\t: "+ (true || true)); // true
    System.out.println("true || false\t: "+ (true || false)); // true
    System.out.println("false || false\t: "+ (false || false)); // false

    // 베타적 논리합(XOR) - 두개의 논리 값이 다를때 true 리턴, 같을때 false 리턴
    System.out.println("true ^ true\t: "+ (true ^ true)); // false
    System.out.println("false ^ true\t: "+ (false ^ true)); // true
    System.out.println("true ^ false\t: "+ (true ^ false)); // true
    System.out.println("false ^ false\t: "+ (false ^ false)); // false

    // * 비트연산자 &(AND), |(OR), ^(XOR), ~(NOT), <<, >> 

    // & (AND) : 두 비트 모두 1면 1, 아니면 0
    // 01101010 & 11001101 = 01001000

    // | (OR) : 두 비트 모두 0면 0, 아니면 1
    // 01101010 | 11001101 = 11101111

    // ^ (XOR) : 두 비트가 다르면 0, 같으면 1
    // 01101010 ^ 11001101 = 10100111

    // ~(NOT) : 0를 1로, 1를 0로 반환 (모든 비트를 반전시킴)
    // ~01101010 = 10010101

    // * 비트 시프트 연산 (>>, >>>, <<)

    // a >> b : 정수 a의 각 비트를 b만큼 오른쪽으로 이동 (빈자리는 정수 a의 최상위 부호비트와 같은값 채움)
    // a >>> b : 정수 a의 각 비트를 b만큼 오른쪽으로 이동 (빈자리는 0으로 채움)
    // a << b : 정수 a의 각 비트를 b만큼 왼쪽으로 이동 (빈자리는 0으로 채움)

    // * 삼항연산자
    boolean result = ( 2 > 1 ) ? true : false; 
    System.out.println(result); // true;

    // ex3 
    int num1 = 15;
    int num2 = 4;

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 / num2;
    int remainder = num1 % num2;
    
    System.out.println("합 :" + sum);
    System.out.println("차 :" + difference);
    System.out.println("곱 :" + product);
    System.out.println("나눗셈 :" + quotient);
    System.out.println("나머지 :" + remainder);

    // ex4
    int n1 = 10;
    int n2 = 20;

    boolean isEqual = n1 == n2;
    boolean isNotEqual = n1 != n2;
    boolean isGreater = n1 > n2;
    boolean isLess = n1 < n2;
    boolean isGreaterOrEqual = n1 >= n2;
    boolean isLessOrEqual = n1 <= n2;

    System.err.println("n1과 n2는 같다\t: " + isEqual);
    System.err.println("n1과 n2는 다르다\t: " + isNotEqual);
    System.err.println("n1과 n2보다 크다\t: " + isGreater);
    System.err.println("n1과 n2보다 작다\t: " + isLess);
    System.err.println("n1과 n2 이상이다\t: " + isGreaterOrEqual);
    System.err.println("n1과 n2 이하이다\t: " + isLessOrEqual);

    // ex5
    boolean bool1 = true;
    boolean bool2 = false;

    boolean andResult = bool1 && bool2;
    boolean orResult = bool1 || bool2;
    boolean notBool1 =!bool1;
    boolean notBool2 =!bool2;

    System.err.println("bool1 AND bool2\t: " + andResult);
    System.err.println("bool1 OR bool2\t: " + orResult);
    System.err.println("NOT bool1\t: " + notBool1);
    System.err.println("NOT bool2\t: " + notBool2);

    // ex6
    int s = 10;

    System.err.println("연산 결과는 11\t: " + (++s));
    System.err.println("연산 결과는 10\t: " + (--s));
    System.err.println("연산 결과는 11\t: " + (++s));
    System.err.println("연산 결과는 11\t: " + (s++));
    System.err.println("연산 결과는 12\t: " + (s));

    // ex7
    int d = 10;

    d += 3;
    System.out.println("결과는 15\t: " + d);

    d -= 3;
    System.out.println("결과는 12\t: " + d);

    d *= 2;
    System.out.println("결과는 24\t: " + d);

    d /= 4;
    System.out.println("결과는 6\t: " + d);

    d %= 6;
    System.out.println("결과는 0\t: " + d);

    // ex8
    int q = 2;
    int w = 5;
    char e = 'A';

    // 연산자의 우선순위
    // 1. 증감(++,--), 부호(+,-), 논리(!)
    // 2. 산술(*, /, %)
    // 3. 산술(+, -)
    // 4. 비교(<, >, <=, >=, instanceof)
    // 5. 비교(==, !=)
    // 6. 논리(&)
    // 7. 논리(^)
    // 8. 논리(|)
    // 9. 논리(&&)
    // 10. 논리(||)
    // 11. 조건(?:)
    // 12. 대입(=, +=, -=, *=, /=, %=, &=)

    System.err.println((int)e); // 65
    System.err.println(w >= 5 || q < 0 && q > 2); // true
    System.err.println(w += 10 - q++); 
    System.err.println(!('A' <= e && e <= 'Z')); // false 
    System.err.println(++e); // 'B'
    System.err.println(e+1); // 67 (정수와 함께 연산되면 숫자로 반환)

    // ex9
    int i = 5;
    int o = 2;

    System.err.println("출력 결과가 2.5\t: " + ((double)i / o));

    // ex10
    String rs = true ? "Java" : "Python";
    rs += " ";
    rs += "Class!";

    System.err.println(rs); // Java Class!
  }
}
