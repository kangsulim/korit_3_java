package ch14_abstraction.interfaces;

public class TvRemoteController {
    // [ 클래스명 객체명; ] 을 이용한 필드 선언 (ex. String str 등)
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }

    // 객체를 `argument`로 하는 생성자 정의
    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton,VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 필드(객체)를 이용한 TvRemoteController 고유 메서드 정의
    // 메서드 내부에서 객체의 메서드를 호출하는 방식
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButtonBySout() {
        System.out.println(channelUpButton.onUp());
    }

    public String onUpChannelUpButtonByString() {
        return channelUpButton.onUp();
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButtonBySout() {
        System.out.println(volumeUpButton.onUp());
    }

    public String onUpVolumeUpButtonByString() {
        return volumeUpButton.onUp();
    }
}
