/**
 * Very stupid-simple message class.  By implementing the Serializble
 * interface, objects of this class can be serialized automatically by
 * Java to be sent across IO streams.  
 *
 * @author Adam J. Lee (adamlee@cs.pitt.edu) 
 *
 */
public class Message implements java.io.Serializable
{
    /** The text string encoded in this Message object */
    public String theMessage;

    /**
     * Constructor.
     *
     * @param _msg The string to be encoded in this Message object
     *
     */
    public Message(String _msg){
	theMessage = _msg;
    }

}  //-- End class Message