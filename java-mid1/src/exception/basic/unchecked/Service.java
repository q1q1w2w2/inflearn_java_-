package exception.basic.unchecked;

// UnChecked 예외는 예외를 잡거나 던지지 않아도 된다
public class Service {
    Client client =  new Client();

    public void callCatch(){
        try{
            client.call();
        } catch (MyUncheckedException e){
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    // 체크 예외와 다르게 throws 선언 안해도 됨
    public void callThrow(){
        client.call();
    }
}
