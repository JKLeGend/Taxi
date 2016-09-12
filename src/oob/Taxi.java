package oob;

/**
 * Created by jukzhang on 9/12/16.
 */
public class Taxi {

    public double count(int miles){
        final int INITIAL_PRICE = 6;
        double result;
        if(miles >2){
            result = INITIAL_PRICE + (miles-2) * 0.8;
        }else {
            result = (miles +1)/2 * INITIAL_PRICE;
        }

        return result;
    }
}
