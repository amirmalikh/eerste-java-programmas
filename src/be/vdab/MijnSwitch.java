package be.vdab;

public class MijnSwitch {
    public static void main(String[] args) {

        String maand = "nov";

        switch (maand) {
            case "sep":
                System.out.println("te klein ");
                break;

            case "okt":
            case "nov":
            case "dec":
                System.out.println("superlekker");
                break;

            case "jan":
            case "feb":
            case "maa":
            case "apr":
                System.out.println("einde seizoen");
                break;

            default:
                System.out.println("geen mosselen");

        }
    }
}
