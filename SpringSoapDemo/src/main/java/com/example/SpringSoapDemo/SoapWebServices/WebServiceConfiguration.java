package com.example.SpringSoapDemo.SoapWebServices;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs // Used to enable Spring Web Services features in the application.

//'@Configuration' Indicates that this class contains bean definitions that should be processed 
//by the spring container to configure the application.
//'WebServiceConfiguration' extends 'WsConfigurerAdapter', which is a convenient adapter
//class for configuring Spring Web Services.
//It's used to configure and customize various aspects of the Spring Web Services 
//infrastructure.
@Configuration
public class WebServiceConfiguration extends WsConfigurerAdapter {

	// This bean configures the 'MessageDispatcherServlet', which is the front
	// controller for
	// Spring Web Services.
	// It sets the application context, transforms WSDL locations and registers the
	// servlet
	// with a URL mapping("/ws/*").
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");

	}

	// This bean defines the WSDL for the Web Service. It uses a
	// 'DefaultWsdl11Definition' and
	// sets properties such as 'portTypeName', 'locationUri', 'targetNameSpace', and
	// the
	// associated schema('bookSchema').
	// The 'locationUri' is the URI where the WSDL will be exposed.
	@Bean(name = "booksWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema booksSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("BooksPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("https://www/perscholas.com/xml/book");
		wsdl11Definition.setSchema(booksSchema);
		return wsdl11Definition;

	}

	// This bean defines the XSD for the web service. It specifies the location of
	// the XSD file
	// ("book.xsd").
	@Bean
	public XsdSchema booksSchema() {
		return new SimpleXsdSchema(new ClassPathResource("book.xsd"));
	}
}