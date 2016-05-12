package javaLearing;
import javax.jws.WebService;

@WebService(endpointInterface="comm.javaLearing.HelloWorld")
public class HelloWorldImpl  implements HelloWorld{
@Override
public String getHelloWorldAsString( String name){
	return " Hello World Jax-WS"+name;
}
}
