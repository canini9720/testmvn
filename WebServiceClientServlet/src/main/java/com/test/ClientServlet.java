package com.test;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;

import org.apache.axis.soap.SOAPConnectionImpl;

/**
 * Servlet implementation class ClientServlet
 */
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("invoked");
		try{
			SAAJClientDemo2 demo=new SAAJClientDemo2();
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			//SOAPConnectionFactoryImpl scf = new SOAPConnectionFactoryImpl();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();
			//SOAPConnectionImpl soapConnection = (SOAPConnectionImpl)scf.createConnection();
			//soapConnection.setTimeout(1000);
			URL endpoint =
					  new URL(new URL("http://localhost:9090/"),
					          "/web_services/hello",
					          new URLStreamHandler() {
					            @Override
					            protected URLConnection openConnection(URL url) throws IOException {
					              URL target = new URL(url.toString());
					              URLConnection connection = target.openConnection();
					              // Connection settings
					              connection.setConnectTimeout(2000); // 10 sec
					              connection.setReadTimeout(2000); // 1 min
					              return(connection);
					            }
					          });
			
			String url = "http://localhost:9090/web_services/hello?wsdl";
			SOAPMessage soapRequest = demo.createSoapRequest();
			//hit soapRequest to the server to get response
			SOAPMessage soapResponse = soapConnection.call(soapRequest, endpoint);
			demo.createSoapResponse(soapResponse);
			soapConnection.close();
		}catch (Exception e) {
		     e.printStackTrace();
		}
		StringBuilder bu=new StringBuilder();*/
		
		
		ElephantWSClient ws=new ElephantWSClient();
		ws.invokdws();
		 getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
