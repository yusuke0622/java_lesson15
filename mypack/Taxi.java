package mypack;

public class Taxi extends Vehicle implements Stopable {
   
    public Taxi(int crewNum) {
        this.crewNum = crewNum;
    }
    // 継承
    public void showCrewNum() {
        System.out.println("タクシーの乗客:" + crewNum + "名");
    }
    // インターフェース
    public void stop() {
        System.out.println("ここで降ります");
    }
}