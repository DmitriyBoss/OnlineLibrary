package by.bsuir.library.bean;

/**
 * Entity class for order
 * @author Svetlana Reznichenko
 */

public class Order extends Entity {

	/** String variable for taking date*/
    private String dateTaking;
    /** String variable for book's name*/
    private String book;
    /** Int variable for booking's id*/
    private int bookingId;
    /** Int variable isReturned value*/
    private int isReturned;
    /** String variable for user's name*/
    private String name;
    /** String variable for surname's name*/
    private String surname;
    
    /** Default constructor for class Order*/
    public Order() {
    	super();
    }
    
    /** Constructor with parameters for class Order*/
    public Order(final String DATE, final int BOOKING_ID, final int IS_RETURNED) {
    	this.dateTaking = DATE;
    	this.bookingId = BOOKING_ID;
    	this.isReturned = IS_RETURNED;
    }

    public String getName() {
		return name;
	}
    
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(final int BOOKING_ID) {
		this.bookingId = BOOKING_ID;
	}

	public void setName(final String NAME) {
		this.name = NAME;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String SURNAME) {
		this.surname = SURNAME;
	}

	public String getDateTaking() {
        return dateTaking;
    }

    public String getBook() {
        return book;
    }

    public int getIsReturned() {
        return isReturned;
    }

    public void setDateTaking(final String DATE_TAKING) {
        this.dateTaking = DATE_TAKING;
    }

    public void setBook(final String BOOK) {
        this.book = BOOK;
    }

    public void setIsReturned(final int IS_RETURNED) {
        this.isReturned = IS_RETURNED;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dateTaking == null) ? 0 : dateTaking.hashCode());
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        result = prime * result + isReturned;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + bookingId;
        return result;
    }

    @Override
    public boolean equals(final Object OBJ) {
        if (this == OBJ) {
        	return true;
        }
        if (!super.equals(OBJ)) {
        	return false;
        }
        if (getClass() != OBJ.getClass()) {
        	return false;
        }
        final Order ORDER = (Order) OBJ;
        if (dateTaking == null) {
            if (ORDER.dateTaking != null) {
            	return false;
            }
        } else if (!dateTaking.equals(ORDER.dateTaking)) {
        	return false;
        }
        if (book == null) {
            if (ORDER.book != null) {
            	return false;
            }
        } else if (!book.equals(ORDER.book)) {
        	return false;
        }
        if (isReturned != ORDER.isReturned) {
        	return false;
        }
        if (name == null) {
            if (ORDER.name != null) {
            	return false;
            }
        } else if (!name.equals(ORDER.name)) {
        	return false;
        }
        if (surname == null) {
            if (ORDER.surname != null) {
            	return false;
            }
        } else if (!surname.equals(ORDER.surname)) {
        	return false;
        }
        if (bookingId != ORDER.bookingId) {
        	return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dateTaking: " + dateTaking + "; book: " + book + "; isReturned: " + isReturned;
    }
}
