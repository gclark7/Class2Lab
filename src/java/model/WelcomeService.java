/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Calendar;

/**
 *
 * @author gcDataTechnology
 */
public class WelcomeService {
    
    private Calendar calendar = Calendar.getInstance();
    private final String EARLY="It is early morning.";
    private final String MORN="It is morning.";
    private final String AFTERNOON="It is afternoon.";
    private final String EVEN="It is evening.";
    private final String NIGHT="It is night.";
    private final String WELCOME = "Welcome";
    private final String DEFAULT_NAME="Anonymous";
    
    public String timeFrame(){
        String greeting="";
        
        
        if(calendar.get(Calendar.HOUR_OF_DAY) < 5){
            greeting=EARLY;
        }else if(calendar.get(Calendar.HOUR_OF_DAY) < 12){
            greeting=MORN;
        }else if(calendar.get(Calendar.HOUR_OF_DAY) < 17){
            greeting=AFTERNOON;
        }else if(calendar.get(Calendar.HOUR_OF_DAY) < 20){
            greeting=EVEN;
        }else if(calendar.get(Calendar.HOUR_OF_DAY) < 23){
            greeting=NIGHT;
        }
        return greeting;
    }
    
    public String welcomeUser(String userName){
        String welcome=WELCOME;
        if(userName==null||userName.isEmpty()||isNumeric(userName)){
            userName=DEFAULT_NAME;
        }
        welcome+=", " + userName + ".  " + timeFrame();
        return welcome;
    }
    
    private boolean isNumeric(String userName){
        boolean isNumeric=false;
            try{
                Double.parseDouble(userName);
                isNumeric=true;
            }catch(Exception e){
                isNumeric=false;
            }
        return isNumeric;
    }
}
