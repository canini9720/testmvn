package com.test;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.apache.axis.soap.SOAPConnectionFactoryImpl;
import org.apache.axis.soap.SOAPConnectionImpl;
public class SAAJClientDemo2 {
	public static SOAPMessage createSoapRequest() throws Exception{
		 MessageFactory messageFactory = MessageFactory.newInstance();
		 SOAPMessage soapMessage = messageFactory.createMessage();
		 SOAPPart soapPart = soapMessage.getSOAPPart();
    	         SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
    	         //soapEnvelope.addNamespaceDeclaration("soapenv", "http://schemas.xmlsoap.org/soap/envelope/");
    	         soapEnvelope.addNamespaceDeclaration("ws", "http://ws.mkyong.com/");
		 SOAPBody soapBody = soapEnvelope.getBody();
		 SOAPElement soapElement = soapBody.addChildElement("getHelloWorld", "ws");
		 //SOAPElement element1 = soapElement.addChildElement("arg0");
		 //element1.addTextNode("EveryOne");
		 soapMessage.saveChanges();
		 System.out.println("----------SOAP Request------------");
		 soapMessage.writeTo(System.out);
		 return soapMessage;
	 }
	 public static void createSoapResponse(SOAPMessage soapResponse) throws Exception  {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		Source sourceContent = soapResponse.getSOAPPart().getContent();
		System.out.println("\n----------SOAP Response-----------");
		StreamResult result = new StreamResult(System.out);
		transformer.transform(sourceContent, result);
	 }
	 public static void main(String args[]){
	        try{
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
			SOAPMessage soapRequest = createSoapRequest();
			//hit soapRequest to the server to get response
			SOAPMessage soapResponse = soapConnection.call(soapRequest, endpoint);
			createSoapResponse(soapResponse);
			soapConnection.close();
		}catch (Exception e) {
		     e.printStackTrace();
		}
	 }
}