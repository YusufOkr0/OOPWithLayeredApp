package OOPWithNLayeredApp.Logging;

public class CoreLog implements ILogger{
	
	public void log (String exception) {
		
		System.out.println(exception + " Core ile loglandi");
		
	}


}
