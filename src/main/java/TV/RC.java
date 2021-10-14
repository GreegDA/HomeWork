package TV;

public class RC {
    public int volume = 0;
    public String up;
    public String down;

    public void Button1Presed() {
        System.out.println("On");
    }

    public int getVolume() {
        return volume;
    }

    public int volumePlus() {

        return volume + 1;
    }

    public int volumeMinus() {
        return volume - 1;
    }

    public String Up() {

        return "Up";
    }

    public String Down() {
        return "Down";
    }
}
