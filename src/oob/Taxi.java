package oob;

/**
 * Created by jukzhang on 9/12/16.
 */
public class Taxi {
    final int INITIAL_DISTANCE = 2;
    final int NORMAL_DISTENCE = 8;
    final int INITIAL_PRICE = 6;
    final double UNIT_PRICE = 0.8;
    final double EXTRA_PERCENT = 0.5;
    final double UNIT_PRICE_OF_WAITING = 0.25;

    public double counter(double miles, int waitingTime) {
        if (miles == 0) return 0;

        double result;
        if (miles > NORMAL_DISTENCE) {
            result = INITIAL_PRICE + this.basicFeeCounter(miles) + this.extraFeeCounter(miles);
        } else if (miles > INITIAL_DISTANCE) {
            result = INITIAL_PRICE + this.basicFeeCounter(miles);
        } else {
            result = (miles + 1) / INITIAL_DISTANCE * INITIAL_PRICE;
        }

        return this.priceRounder(result + this.timeCharger(waitingTime));
    }

    public double basicFeeCounter(double miles) {
        return (miles - INITIAL_DISTANCE) * UNIT_PRICE;
    }

    public double extraFeeCounter(double miles) {
        return (miles - NORMAL_DISTENCE) * UNIT_PRICE * EXTRA_PERCENT;
    }

    public double timeCharger(double waitingTime) {
        return waitingTime * UNIT_PRICE_OF_WAITING;
    }

    public int priceRounder(double price) {
        return (int) Math.round(price);
    }
}
