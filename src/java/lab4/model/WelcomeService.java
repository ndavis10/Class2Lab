/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.model;

import java.util.Calendar;

/**
 *
 * @author viewt_000
 */
public class WelcomeService {
    private Calendar today;
    
    public WelcomeService()
    {
        today = Calendar.getInstance();
    }
    
    public String getTimeOfDay()
    {
        if(today.get(Calendar.HOUR_OF_DAY) >= 17)
        {
            return "evening";
        }
        else if(today.get(Calendar.HOUR_OF_DAY) >= 12)
        {
            return "afternoon";
        }
        else
        {
            return "morning";
        }
    }
    
    public String getWelcome(String name)
    {
        return "Good " + getTimeOfDay() + ", " + name + ". Welcome!";
    }
}
