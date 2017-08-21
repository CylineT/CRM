package interceptor;

import handler.Handler;

public interface Interceptor {
	
	
	
	String intercept(Handler handler, Integer i);
	
	
	
}
