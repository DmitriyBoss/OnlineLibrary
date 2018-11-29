package by.bsuir.library.bean;

/**
 * Entity class for booking
 * @author Svetlana Reznichenko
 */

public class Booking extends Entity{
	
	/** String variable for booking's date*/
	private String dateBooking;
	/** Int variable for user's id*/
    private int userId;
    /** Int variable for book's id*/
    private int bookId;
    /** String variable for book's name*/
    private String book;
    /** String variable for approved value*/
    private int isApproved;
    /** String variable for user's name*/
    private String name;
    /** String variable for user's surname*/
    private String surname;
    
    /** Default constructor for class Booking*/
    public Booking() {
    	super();
    }
    
    /** Constructor with variables for class Booking*/
	public Booking(final String DATE, final int USER_ID, final int BOOK_ID, final int IS_APPROVED) {
		super();
		this.dateBooking = DATE;
		this.userId = USER_ID;
		this.bookId = BOOK_ID;
		this.isApproved = IS_APPROVED;
	}

    public String getDateBooking() {
        return dateBooking;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getIsApproved() {
        return isApproved;
    }
    
    public String getBook() {
    	return book;
    }

    public void setDateBooking(final String DATE_BOOKING) {
        this.dateBooking = DATE_BOOKING;
    }

    public void setUserId(final int USER_ID) {
        this.userId = USER_ID;
    }

    public void setBookId(final int BOOK_ID) {
        this.bookId = BOOK_ID;
    }

    public void setIsApproved(final int IS_APPROVED) {
        this.isApproved = IS_APPROVED;
    }
    
    public void setBook(final String BOOK) {
    	this.book = BOOK;
    }

    public String getName() {
		return name;
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

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dateBooking == null) ? 0 : dateBooking.hashCode());
        result = prime * result + userId;
        result = prime * result + bookId;
        result = prime * result + isApproved;
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
        final Booking OTHER = (Booking) OBJ;
        if (dateBooking == null) {
            if (OTHER.dateBooking != null) {
            	return false;
            }
        } else if (!dateBooking.equals(OTHER.dateBooking)) {
        	return false;
        }
        if (userId != OTHER.userId) {
        	return false;
        }
        if (bookId != OTHER.bookId) {
        	return false;
        }
        if (isApproved != OTHER.isApproved) {
        	return false;
        }
        if (book == null) {
            if (OTHER.book != null) {
            	return false;
            }
        } else if (!book.equals(OTHER.book)) {
        	return false;
        }
        if (name == null) {
            if (OTHER.name != null) {
            	return false;
            }
        } else if (!name.equals(OTHER.name)) {
        	return false;
        }
        if (surname == null) {
            if (OTHER.surname != null) {
            	return false;
            }
        } else if (!surname.equals(OTHER.surname)) {
        	return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dateBooking: " + dateBooking + "; userId: " + userId + "; bookId: " + bookId + "; isApproved: " + isApproved;
    }
}
