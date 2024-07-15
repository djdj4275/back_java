package section10.access;

class Sample {
    private String secret; // secret 자체는 private 이지만

    String getSecret() { // 이 메소드와는 같은 클래스 내부라서 값에 접근이 가능하고
        return this.secret;
    }

    protected String setSecret(String secret) {
        this.secret = secret;
        return this.secret;
    }
}

public class Practice {
    // 접근 제한자 (접근 제어자)

    // private : 같은 클래스
    // default : 같은 패키지
    // protected : 같은 패키지 or 다른 패키지라면 자식 클래스
    // public : 모든 패키지, 모든 클래스

    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.getSecret()); // 메소드 자체가 default이기에 사용가능
        System.out.println(s.setSecret("비밀"));
    }
}
