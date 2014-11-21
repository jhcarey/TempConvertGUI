//------------------------------ Assignment -----------------------------------
//  	Programmer:John-Henry Carey		     Course-Section: BP
//  	E-mail address:john_henry_carey@yahoo.com    Assignment: convert with GUI
//	Creation Date:2/21/12                        Last Modified:
//-----------------------------------------------------------------------------
//	PURPOSE:GUI based temp. conversion program that converts from Fahrenheit
//              to celsius and vice-versa
//-----------------------------------------------------------------------------
//	INPUT:
//-----------------------------------------------------------------------------
//	OUTPUT:
//-----------------------------------------------------------------------------
//	NOTES: 1. No error checking is done on the information provided by user.
//-----------------------------------------------------------------------------
package convertwithgui;
import javax.swing.*;
import BreezySwing.*;

public class convertwithgui extends GBFrame
{
    //declare variables for the window obkects.
    private JLabel      fahrenheitLabel;
    private JLabel      celsiusLabel;
    private DoubleField fahrenheitField;
    private DoubleField celsiusField;
    private JButton     fahrenheitButton;
    private JButton     celsiusButton;

    //Constructor
    public convertwithgui()
    {
        //instantiate and add window objects to window
        fahrenheitLabel = addLabel      ("Fahrenheit" ,1,1,1,1);
        celsiusLabel    = addLabel      ("Celsius"    ,1,2,1,1);

        fahrenheitField = addDoubleField(32.0         ,2,1,1,1);
        celsiusField    = addDoubleField(0.0          ,2,2,1,1);
        fahrenheitButton= addButton     (">>>>>>"     ,3,1,1,1);
        celsiusButton   = addButton     ("<<<<<<"     ,3,2,1,1);
    }

    //Respond to button click events
    public void buttonClicked(JButton buttonObj)
    {
        //Local Variables
        Thermometer thermo = new Thermometer();

        //Determine which button as clicked.
        if (buttonObj == fahrenheitButton)
        {
            //Convert from Fahrenheit to Celsius
            thermo.setFahrenheit(fahrenheitField.getNumber());
            celsiusField.setNumber(thermo.getCelsius());

        }else
        {
            //convert from celsius to fahrenheit
            thermo.setCelsuius(celsiusField.getNumber());
            fahrenheitField.setNumber(thermo.getFahrenheit());
        }
    }

    //execution begins in the method main as usual.

   
    public static void main(String[] args)
    {
        convertwithgui theGUI = new convertwithgui();
        theGUI.setSize (250, 100);      //set windows size in pixels
                                        //width = 250, height = 100
        theGUI.setVisible(true);        //Make the window visible
    }

}
