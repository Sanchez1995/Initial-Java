package TVDemo;

public class TVMain {
    public static void main(String[] args) {
        _03_TVDemo tv1 = new _03_TVDemo();
        _03_TVDemo tv2 = new _03_TVDemo();

        tv1.turnOn();
        tv2.turnOn();

        tv1.setChannel(30);
        tv1.setVolume(3);
        tv2.setChannel(3);
        tv2.setVolume(3);

        System.out.println(tv1.channel + tv2.volumeLevel);
        System.out.println(tv2.channel + tv2.volumeLevel);


    }
}
