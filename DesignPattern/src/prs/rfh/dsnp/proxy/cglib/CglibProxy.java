package prs.rfh.dsnp.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

	private Object target = null;
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("begin");
		Object xx = proxy.invokeSuper(obj, args);
		System.out.println("end");
		return xx;
	}
	
	public Object getInstance(Object target){
		this.target = target;
		Object result = null;
		
		
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		
		
		return enhancer.create();
		
	}
	
}
