package ch14_abstraction.interfaces;

public class ACController {
    private PowerButton powerButton;
    private TempDownButton tempDownButton;
    private TempUpButton tempUpButton;

    public ACController(PowerButton powerButton, TempDownButton tempDownButton, TempUpButton tempUpButton) {
        this.powerButton = powerButton;
        this.tempDownButton = tempDownButton;
        this.tempUpButton = tempUpButton;
    }

    public void onPressedOnPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTempDownButton() {
        tempDownButton.onPressed();
    }

    public void onDownTempDownButton() {
        tempDownButton.onDown();
    }

    public void onPressedTempUpButton() {
        tempUpButton.onPressed();
    }

    public void onUpTempUpButton() {
        System.out.println(tempUpButton.onUp());
    }
}
