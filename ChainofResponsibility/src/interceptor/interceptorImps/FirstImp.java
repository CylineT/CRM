package interceptor.interceptorImps;

import handler.Handler;
import interceptor.Interceptor;

public class FirstImp implements Interceptor{

	@Override
	public String intercept(Handler handler, Integer i) {
		String info = "一号lose";
		if(i==1) {
			System.out.println("数字为1，被拦截");
			return "一号success";
		}
		System.out.println(info+"， 继续调用下一个拦截器");
		System.out.println(handler.tochain());
		System.out.println("一号lose后处理");
		return "一号执行完毕，全部拦截器执行完毕";
	}

}
