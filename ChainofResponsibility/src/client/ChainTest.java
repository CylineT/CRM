package client;

import java.util.LinkedList;
import java.util.List;

import handler.Handler;
import handler.handlerImp.HandlerImp;
import interceptor.Interceptor;
import interceptor.interceptorImps.FirstImp;
import interceptor.interceptorImps.FourthImp;
import interceptor.interceptorImps.SecondImp;
import interceptor.interceptorImps.ThirdImp;

public class ChainTest {
	
	private static Integer object;
	@SuppressWarnings("static-access")
	public void setI(Integer object) {
		this.object = object;
	}

	static List<Interceptor> interceptors;
	
	static{
		interceptors = new LinkedList<Interceptor>();
		interceptors.add(new FirstImp());
		interceptors.add(new SecondImp());
		interceptors.add(new ThirdImp());
		interceptors.add(new FourthImp());
	}

	public static void main(String[] args) {
		new ChainTest().setI(4);
		Handler h = new HandlerImp(interceptors,object);
		String resultStr = h.tochain();
		System.out.println(resultStr);
	}
	
	



	
}
