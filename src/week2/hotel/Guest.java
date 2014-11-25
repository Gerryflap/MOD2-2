package week2.hotel;

/**
 * Hotel guest.
 * @author Gerben Meijer
 * @version $Revision 1.0 $
 */

public class Guest {
    private String name;
    private Room room;

    /**
     * Creates a <code>Guest</code> with the given name.
     * @param name name of the new <code>Guest</code>.
     */
    public Guest(String name){
        this.name = name;
    }

    /**
     * Checks this <code>Guest</code> in into a <code>Room</code>.
     * @param room the room where our <code>Guest</code> checks in to.
     * @return if the checkin was succesfull.
     */
    public boolean checkin(Room room){

    	if (room.getGuest()==null){
	        this.room = room;
	        this.room.setGuest(this);
	        return true;
    	} else {
    		return false;
    	}
    }

    /**
     * @return if the checkout was succesfull.
     */
    public boolean checkout(){

    	if (this.room != null){
	    	this.room.setGuest(null);
	        this.room = null;
	        return true;
    	} else {
    		return false;
    	}
    }

    /**
     * @return the name of this <code>Guest</code>.
     */
    public String getName(){

        return this.name;
    }

    /**
     * @return the <code>Room</code> this <code>Guest</code> is in. null if there is no room.
     */
    public Room getRoom(){

        return this.room;
    }


    public String toString(){
    	return "Guest " + this.getName();
    }
}
