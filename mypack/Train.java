package mypack;

public class Train extends Vehicle {
    
    public Train(int crewNum) {
        this.crewNum = crewNum;
    }
    // 継承
    public void showCrewNum() {
        System.out.println("電車の乗客:" + crewNum + "名");
    }
}