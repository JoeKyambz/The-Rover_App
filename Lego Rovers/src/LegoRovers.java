/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.lwuit.Command;
import com.sun.lwuit.Container;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import javax.microedition.midlet.*;

/**
 * @author Kyubi
 */
public class LegoRovers extends MIDlet implements ActionListener{
    
    private Form Mainmenu;
    private Label UltraSonic,Light,Motar,Temp,wheels;
    private Container ContMainmenu;
    private Command Exit;

    public void startApp() {
       //init the LWUIT theme to Display
Display.init(this);
// Setting the application theme by using the following code.
//the try...catch method is used to catch errors incase there is an error displaying the theme.
try {
    Resources r = Resources.open("/theme.res");
    UIManager.getInstance().setThemeProps(
    r.getTheme(r.getThemeResourceNames()[0])
    );
    } catch (java.io.IOException e) {
    }
    MainMenu();
    }
    public void MainMenu(){
      Mainmenu=new Form("             Lego Rovers");
      Mainmenu.setLayout(new BorderLayout());
      //Defining and initialising the Labels
      UltraSonic=new Label("UltraSonic Sensor");
      Light=new Label("Light Sensor");
      Motar=new Label("Motar Sensor");
    
      
      //Definign and initialising the container.
      ContMainmenu=new Container(new BoxLayout(BoxLayout.Y_AXIS));
      ContMainmenu.addComponent(UltraSonic);
      ContMainmenu.addComponent(Light);
      ContMainmenu.addComponent(Motar);
      
     
      Mainmenu.addComponent(BorderLayout.NORTH,ContMainmenu);
      //Adding the App Exit Command
      Exit=new Command("Exit");
      Mainmenu.show();
      Mainmenu.addCommand(Exit);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
