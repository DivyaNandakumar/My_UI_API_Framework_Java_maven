package ui.api.framework;

import ui.api.framework.ConfigProcessor;

public class FrameworkBase extends ConfigProcessor {	
	
	public FrameworkBase() 
	{
		try{
			ConfigProcessor conf;
			conf=ConfigProcessor.getInstance();
			//load();
			System.out.println("Base class loaded configs and logger "+ConfigProcessor.SESSION);
			
		}catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	
	public synchronized void apirequest(String body) throws Exception{
	}
	
	public synchronized void  apiresponse() throws Exception{
		
		System.out.println("entered api");
		Thread.sleep(6000);
	}
	
	public synchronized void uirequest() throws Exception{
		
	}

	public synchronized void uiresponse() throws Exception{
		
	}
	
}
