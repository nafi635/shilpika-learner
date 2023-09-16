package Day16Package;

public class RGBInversion {
    public static void main(String[] args) {
        RGB inversion1 = new RGB(243,242, 235);
        int invertedRed = (255 - inversion1.red);
        int invertedGreen = (255 - inversion1.green);
        int invertedBlue = (255 - inversion1.blue);
        System.out.println(invertedRed);
        System.out.println(invertedGreen);
        System.out.println(invertedBlue);
        }
    }
