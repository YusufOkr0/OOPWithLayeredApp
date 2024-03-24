package OOPWithNLayeredApp.Logging;

public class EmailLog implements ILogger{
	
	public void log (String exception) {
		
		System.out.println(exception + " Email ile loglandi");
		
	}

}
