package com.example.shitanshu.currencyapplication.helpers;

import com.example.shitanshu.currencyapplication.Constants;
import com.example.shitanshu.currencyapplication.value_objects.Currency;

import org.json.JSONObject;

/**
 * Created by Shitanshu on 4/17/2017.
 */

public class CurrencyParserHelper {

    public static Currency parseCurrency(JSONObject obj, String currencyName){
        Currency currency = new Currency();
        currency.setBase(obj.optString(Constants.BASE));
        currency.setDate(obj.optString(Constants.DATE));
        JSONObject rateObject = obj.optJSONObject(Constants.RATES);
        if (rateObject != null){
            currency.setRate(rateObject.optDouble(currencyName));
        }
        currency.setName(currencyName);
        return currency;
    }
}
