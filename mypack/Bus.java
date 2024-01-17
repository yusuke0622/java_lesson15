package mypack;

public class Bus extends Vehicle implements Stopable {
    
    public Bus(int crewNum) {
        this.crewNum = crewNum;
    }
    // 継承
    public void showCrewNum() {
        System.out.println("バスの乗客:" + crewNum + "名");
    }
    // インターフェース
    public void stop() {
        System.out.println("次止まります");
    }
}