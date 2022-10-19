package java8features;

import java.util.Base64;

public class BaseEncodeDecode {
public static void main(String[] args) {
	
    Base64.Encoder encoder = Base64.getEncoder(); 
    Base64.Decoder decoder = Base64.getDecoder(); 
    
    // Encoding string  
    String name="Jeevan";
    System.out.println("byte code..."+name.getBytes());
    
    String str = encoder.encodeToString(name.getBytes());  
    System.out.println("Encoded string: "+str); 

    // Decoding string  
    byte[] b=decoder.decode(str);
    String dStr = new String(b);  
    
    System.out.println("Decoded string: "+dStr);  
}
}
