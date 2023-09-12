package batchPagos.util;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
	private final static Logger log = Logger.getLogger(HeaderHandler.class);

	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		try {
			if (outboundProperty) {
				Map <String, List<String>> headers = new HashMap<String, List<String>>();
				//Headers Prod
				headers.put("Bes-usuario", Arrays.asList("102"));
				headers.put("Bes-password", Arrays.asList("H2dhEEe38A/uzjcEqQmjCXNnQycn8KtsxVvQnVXhhR2rAEl0PxhpR8Bp9WL/Jxqb"));
				//Headers Preprod
//				headers.put("Bes-usuario", Arrays.asList("bes10003"));
//				headers.put("Bes-password", Arrays.asList("lhjiSs6FZS6oyEvPHPK5Yu84glksDXoU/5ggdeBkh18="));
				log.info(headers.get("Bes-usuario"));
				log.info(headers.get("Bes-password"));
				context.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
				System.out.println("Se agregan en el encabezado HTTP los valores: ");
				for(Map.Entry<String, List<String>> e : headers.entrySet()) {
					System.out.println(e.getKey()+" "+e.getValue().get(0));
				}
				SOAPMessage message = context.getMessage();
				message.writeTo(System.out);
				System.out.println("");
			} else {
				SOAPMessage message = context.getMessage();
				message.writeTo(System.out);
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outboundProperty;
	}

	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	public void close(MessageContext context) {

	}

	public Set<QName> getHeaders() {
		return null;
	}

}
