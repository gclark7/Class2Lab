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
    
    
    public String timeFrame(){
        String greeting="";
        String EARLY="It is early morning.";
        String MORN="It is morning.";
        String AFTERNOON="It is afternoon.";
        String EVEN="It is evening.";
        String NIGHT="It is night.";
        
        if(calendar.HOUR_OF_DAY < 5){
            greeting=EARLY;
        }else if(calendar.HOUR_OF_DAY < 12){
            greeting=MORN;
        }else if(calendar.HOUR_OF_DAY < 17){
            greeting=AFTERNOON;
        }else if(calendar.HOUR_OF_DAY < 20){
            greeting=EVEN;
        }else if(calendar.HOUR_OF_DAY < 23){
            greeting=NIGHT;
        }
        return greeting;
    }
    
    public String welcomeUser(String userName){
        String welcome="Welcome";
        if(userName==null||userName.isEmpty()||isNumeric(userName)){
            userName="Anonymous";
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
