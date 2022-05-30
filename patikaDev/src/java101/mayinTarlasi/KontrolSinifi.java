public class KontrolSinifi {
    String girdi1;
    String girdi2;


    KontrolSinifi(String girdi1, String girdi2) {
        this.girdi1 = girdi1;
        this.girdi2 = girdi2;

    }

    boolean isDigit(String row, String col) {
        if (row == null || row == "") {
            return false;
        }
        if (col == null || col == "") {
            return false;
        }

        try {
            int Ival1 = Integer.parseInt(row);
            int Ival2 = Integer.parseInt(col);
            if (Ival1 > 0 && Ival2 > 0) {
                return true;
            }
        } catch (NumberFormatException e) {

        }
        return false;
    }

}


