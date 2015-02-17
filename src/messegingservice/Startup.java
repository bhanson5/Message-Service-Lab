
package messegingservice;

/**
 *
 * @author mbrester1
 */


public class Startup {
    
    
    public static void main(String[] args) {
    
        MessagingService messager = new MessagingService(new GUIMessageOutputStrategy(), new GUIMessageInputStrategy());
    
        
        messager.displayMessage();
        
        
    }
}
