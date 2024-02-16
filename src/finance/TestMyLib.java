package finance;

import java.util.Arrays;
import java.util.List;

/**
 * Classe de test
 */
public class TestMyLib {

    public static void main(String[] args) {
        TestMyLib testMyLib = new TestMyLib();
        testMyLib.testCalculateAverage();
        testMyLib.testCalculateChange();
    }


    /**
     *
     */
    private void testCalculateAverage() {
        Financial financial = new Financial();
        List<Double> doubleList = Arrays.asList(1D, 2D, 3D, 4D);
        double avg = financial.calculateAverage(doubleList);
        System.out.println("Avg : " + avg);
    }

    /**
     *
     */
    private void testCalculateChange() {
        Financial financial = new Financial();
        try {
            double amount = financial.calculateChange("CHF", "EUR", 1000D);
            System.out.println("Montant du change : " + amount);
        } catch (RateUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }

}
