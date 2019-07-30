package net.codejava.customer.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {  //WebApplicationInitializer class is from servlet api to provide
	                         //  ServletContext Obj programmatically

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		//AnnotationConfigWebApplicationContext class is from Spring mvc
		
		appContext.register(WebMvcConfig.class);
		
	    ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
	    		       "SpringDispatcher",new DispatcherServlet(appContext));
	    
	    dispatcher.setLoadOnStartup(1);
	    dispatcher.addMapping("/");    		
	}
}
