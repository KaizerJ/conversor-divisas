/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jonay
 */
public class RESTExchangeRateLoader {
    
    public static double getEURtoUSDRate(){
        double rate = 0.0;
        try {
            URL url = new URL("https://api.exchangeratesapi.io/latest?base=EUR&symbols=USD");
            Scanner scanner = new Scanner(url.openStream());
            String exchangeJson = scanner.nextLine();
            
            Pattern pattern = Pattern.compile("\"USD\":(\\d+\\.\\d+)");
            Matcher matcher = pattern.matcher(exchangeJson);
            
            if(matcher.find()){
                rate = Double.parseDouble(matcher.group(1));
            }

        } catch (IOException ex) {
            Logger.getLogger(RESTExchangeRateLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rate;
    }

    public static double getUSDtoEURRate() {
        double rate = 0.0;
        try {
            URL url = new URL("https://api.exchangeratesapi.io/latest?base=USD&symbols=EUR");
            Scanner scanner = new Scanner(url.openStream());
            String exchangeJson = scanner.nextLine();
            
            Pattern pattern = Pattern.compile("\"EUR\":(\\d+\\.\\d+)");
            Matcher matcher = pattern.matcher(exchangeJson);
            
            if(matcher.find()){
                rate = Double.parseDouble(matcher.group(1));
            }

        } catch (IOException ex) {
            Logger.getLogger(RESTExchangeRateLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rate;
    }
}
