// Ques 25

import java.applet.*;

import java.awt.*;

public class Banner extends Applet implements Runnable

{

    String text = " Sample Banner ";

    Thread t;

    //Initialize the applet

    public void init()

    {

        setBackground(Color.white);

    }

    //Function to start the thread

    public void start()

    {

	t = new Thread(this);

	t.start();

    }

    //Function to execute the thread

    public void run()

    {

        while(true)

	{

	    try

	    {

	        repaint();

		//Delay each thread by 1000ms or 1 seconds

                Thread.sleep(1000);

		//Shift the first character of banner text to the last postion

                text = text.substring(1) + text.charAt(0);

	    }

	    catch(Exception e)

	    {

	    }

	}

    }

    //Function to draw text

    public void paint(Graphics g)

    {

	g.setFont(new Font("TimesRoman",Font.BOLD,15));

	g.drawString(text,200,200);

    }

}