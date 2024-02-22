package finance;

import java.util.List;

public interface FinancialInterface {

    /**
     * Calcule la moyenne d'une liste de double
     * @param doubleList
     * @return
     */
    double calculateAverage(final List<Double> doubleList);

    /**
     * Calcule la somme d'une liste de double
     * @param doubleList
     * @return
     */
    double calculateSum(final List<Double> doubleList);

    /**
     * Calcule le change entre 2 monnaies
     * @param fromCurrency
     * @param toCurrency
     * @param amount
     * @return
     * @throws RateUnavailableException
     */
    double calculateChange(final String fromCurrency, final String toCurrency, final double amount) throws RateUnavailableException;
}
