package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        //우리가 지금까지 해온 방식
        PowerButton powerButton1 = new PowerButton();
        ChannelDownButton channelDownButton1 = new ChannelDownButton();
        ChannelUpButton channelUpButton1 = new ChannelUpButton();

        TvRemoteController tvRemoteController1 = new TvRemoteController(powerButton1, channelDownButton1, channelUpButton1);

        powerButton1.onPressed();
        powerButton1.onPressed();
        System.out.println();

        channelDownButton1.onPressed();
        channelDownButton1.onDown();
        System.out.println();

        channelUpButton1.onPressed();
        System.out.println(channelUpButton1.onUp());
        System.out.println();

        // TvRemoteController 클래스에서 각 기능들을 정의 및 호출
        TvRemoteController tvRemoteController = new TvRemoteController
                (new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), // 첫 실습에서 만든 argument
                        new VolumeDownButton(), new VolumeUpButton());  // 두 번째 실습에서 추가한 argument

        // 첫 실습
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        System.out.println();

        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println();

        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButtonBySout();   // void
        System.out.println(tvRemoteController.onUpChannelUpButtonByString());   // return String
        System.out.println();

        // 두 번째 실습
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        System.out.println();

        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButtonBySout();
        System.out.println(tvRemoteController.onUpVolumeUpButtonByString());

        // 오류 발생 부분 TvRemoteController 의 생성자 정의 부분에서
        // this.volumeDownButton = volumeDownButton;
        // this.volumeUpButton = volumeUpButton;
        // 위의 두 라인을 적어주지 않아서 -> `alt + ins` 를 사용하여 자동으로 생성하도록 하자
    }
}
