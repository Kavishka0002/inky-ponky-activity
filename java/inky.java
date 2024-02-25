public class inky {
    public inky(String x) {
        System.out.println(x);
    }

    public inky(String pinky, String blinky, String rinky) {
        System.out.println(blinky + " " + pinky);
        System.out.println(pinky + " " + rinky);
        System.out.println(blinky + " " + pinky + " " + rinky);
    }

    public static void main(String args[]) {
        String pinky = "donky";
        inky ponky = new inky(pinky);

        String blinky = "pinky";
        String rinky = "Monkey";

        inky ponky2 = new inky(pinky, blinky, rinky);
    }
}
