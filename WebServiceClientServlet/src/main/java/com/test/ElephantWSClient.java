package com.test;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;

import org.apache.axis.message.SOAPEnvelope;


public class ElephantWSClient extends WSClientUtil {
	
	private String endPoint;

    private String userName;

    private String password;
    
    private String trafficTimeout;
	
    
	
	@PostConstruct
	public void initialize(){
		
		//endPoint = "http://localhost:18080/testservice-web/elephantRiding";
		//trafficTimeout =  "1000";
	}
	
	
	void invokdws(){
		
		System.out.println("calling servlet");
		ElephantWSClient client = new ElephantWSClient();
		this.endPoint = "http://localhost:18080/testservice-web/elephantRiding";
		this.trafficTimeout="20";
		
	try{
		
			SOAPEnvelope envelope = new SOAPEnvelope();
		
			envelope.addNamespaceDeclaration("tes","http://testservice.com/");
			//ElephantRidingDTO dto=new ElephantRidingDTO();
			SOAPBody body = (SOAPBody)envelope.getBody();
			SOAPElement getFines = body.addChildElement("horseRidingRequest","tes");
			SOAPElement fineRequest = getFines.addChildElement("elephantRidingRequest","");
			
			fineRequest.addChildElement("emiratesID").addTextNode("423423");
			
		
		String request = envelope.toString();
		
		System.out.println("<<< REQUEST >>> "+request);
		
		
		String response = this.callServiceByAxis(envelope, this.endPoint, "",trafficTimeout);
			//client.callServiceByAxis(request, endpoint, soapAction, timeout);
		System.out.println("<<< Response >>> "+response);
			
			
//			new FineManagementWSClient().getTicketImage(123L));
		
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		ElephantWSClient client = new ElephantWSClient();
		client.endPoint = "http://localhost:18080/testservice-web/elephantRiding";
		client.trafficTimeout="1000";
		client.invokdws();
		
	}
}
