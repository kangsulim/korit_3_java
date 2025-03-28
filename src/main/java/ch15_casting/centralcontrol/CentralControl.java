package ch15_casting.centralcontrol;

public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;


    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 전자 제품을 CentralControl의 객체의 필드인 배열에 집어넣는 메서드
    public void addDevice(Power device) {
        // 왜 매개변수가 Power 인가 : 하위 클래스의 객체를 받기 위해서
        int emptyIndex = checkEmpty();

        if (checkEmpty() == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println("(" + (emptyIndex + 1) + "번째 포트에) " + device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        /*
            객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력되는 getter
            객체명.getClass().getSimpleName() -> 클래스명만 출력되는 getter
         */
    }

    // 지금 보니까 배열 개수는 정해져있는데 객체가 너무 많으면 문제가 생길 듯 하다
    // 체크할 메서드 정의
    private int checkEmpty() {   // 비어있는 배열의 index 넘버를 반환
        // 반복문을 사용해서 배열 내부에 비어있는 index 뽑기
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
        /*
         Java의 index 넘버는 음수가 없기 때문에
         실패를 나타낼 때 -1을 사용하는 경우가 많다
         */
    }



    public void powerOn() {
        // 배열 내부에 있는 element들은(Power의 서브 클래스들의 인스턴스) Power를 implements 했디 때문에
        // 전부 .on()과 .off()를 공통적으로 가진다.
        // -> 그러면 배열 내부를 반복문을 사용하여 전원과 관련된 메서드들의 실행이 가능하겠다.

        int powerOnIndex = 0;

        for (Power device : deviceArray) {

            powerOnIndex++;
            if (device == null) {
                System.out.println("(" +  powerOnIndex  + "번째 포트에) 장치가 없어 전원을 켜지 않았습니다.");
                continue;   // 다음 반복문으로 건너뛰기 (break, return과 비교하기)
            }
            System.out.print("(" + powerOnIndex + "번째 포트에) ");
            device.on();
        }
    }


    public void powerOff() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("(" + (i + 1) +"번째 포트에) 장치가 없어 전원을 켜지 않았습니다.");
                continue;
            }
            System.out.print("(" + (i + 1) + "번째 포트에) ");
            deviceArray[i].off();
        }
    }


    // 임의의 번지에 device를 할당하고 powerOn(), powerOff()가 정상적으로 동작하는 지 확인
    public void setDeviceArray(Power device, int index) {
        deviceArray[index - 1] = device;
        System.out.print("(" + "누군가가 임의로 [ ");
        System.out.println((index ) + " ] 번 포트에 " + device.getClass().getSimpleName() + " 장치를 연결했습니다.)");
    }

    // 현재 배열 내에 각 객채가 들어가있다.
    // 객체명.getClass().getSimpleName()을 활용하여 클래스 네임을 출력했다.
    // deviceArray 배열을 반복문을 사용하여 몇 번 인덱스에 어떤 클래스의 객체가 있는지 출력하는
    // displayInfo() 메서드를 정의하시오.
    public void displayInfo() {
        for (int i = 0; i < deviceArray.length; i++) {
            int portIndex = i + 1;
            if (deviceArray[i] == null){
                System.out.println("포트 [ " + portIndex + " ] 번 : 빈 슬롯");
                continue;
            }
            System.out.println("포트 [ " + portIndex + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
        }
    }
    
    // 배열 내부를 돌면서 각 element의 고유 메서드를 호출하는 메서드
    public void performSpecificMethod() {
        for (Power device : deviceArray) {
//            if (device == null) {
//                continue;
//            }
            
            if (device instanceof Tv) { // 조건문이 참이라면 배열 내부의 element가 Tv 클래스로 생성되었다가 Power로 업캐스팅 된 element라는 뜻
                Tv tv = (Tv) device;
                tv.changeChannel();
            } else if (device instanceof Computer) {
                /*
                    갑자기 Computer, LED, Mouse 3가지 클래스의 객체가 computer.compute()를 실행함
                    -> 컴퓨터의 순서를 뒤로 보내니까 되기는 함
                    -> ** 알고 보니 'LED 와 Mouse' 가 Computer 를 상속받고 있었음 **
                    -> implement 로 수정하니 정상 동작 함을 확인
                 */
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.color();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device == null) {
                System.out.println("장치가 연결되지 않았습니다.");
            }

            else {
                System.out.println("아직 지원하지 않는 장치입니다.");
            }
        }
    }
}
