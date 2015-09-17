package com.fanhanfei.innerclass.javacore;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {

	public static void main(String[] args) {
		TalkingClock talkingClock = new TalkingClock(1000,true);
		talkingClock.start();
		JOptionPane.showMessageDialog(null, "quit ?");
		System.exit(0);

	}
	
	

}

class TalkingClock{
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval,boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start(){
		ActionListener listener = new TimePrinter();
		Timer timer = new Timer(interval, listener);
		timer.start();
	}
	
	private class TimePrinter implements ActionListener{
		public TimePrinter(){
			System.out.println("132456456");
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
			System.out.println(" ±º‰ «£∫"+ date);
			if(beep)
				Toolkit.getDefaultToolkit().beep();
		}
		
	}
	
}
