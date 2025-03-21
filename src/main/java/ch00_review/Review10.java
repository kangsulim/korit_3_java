package ch00_review;

class Data {
    private int intData;
    private String strData;

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    public int getIntData() {
        return intData;
    }

    public String getStrData() {
        return strData;
    }
}

public class Review10 {



    public static void main(String[] args) {
        Data data1 = new Data();

        int intData;
        String strData;

        data1.setIntData(1750);
        data1.setStrData("집 가는 시간 !!!");

        intData = data1.getIntData();
        strData = data1.getStrData();

        System.out.println("오늘 " + intData + "은 " + strData);
    }
}
