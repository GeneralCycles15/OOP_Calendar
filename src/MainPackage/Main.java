/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;
import CalendarPackage.Calendars;
import CalendarFactoryPackage.CalendarFactory;
import java.util.Scanner;


/**
 *
 * @author jacob
 */
public class Main {    
    public static void main(String[] args){
        CalendarFactory factory = new CalendarFactory();
        @SuppressWarnings("resource")
		Scanner reader =  new Scanner(System.in);
        Calendars item = null;
        System.out.print("Type in the kind of calendar you want: ");
        if(reader.hasNextLine()){
            String calendarType = reader.nextLine();
            item = factory.getCalendar(calendarType);
        }
        
        if(item != null){
            System.out.println("Making Calendar.");
            item.makeCalendar();
            
        }
        else{
           System.out.println("Input doesn't match."); 
        }
        
        
    }
}
