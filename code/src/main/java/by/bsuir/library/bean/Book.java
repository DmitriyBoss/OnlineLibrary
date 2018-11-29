package by.bsuir.library.bean;

/**
 * Entity class for book
 * @author Svetlana Reznichenko
 */

public class Book extends Entity {

	/** String variable for name*/
	private String name;
	/** Int variable for bokk's amount*/
    private int amount;
    /** String variable for author's name*/
    private String author;
    /** Int variable for author's id*/
    private int authorId;
    
    /** Default constructor for class Book*/
    public Book() {
    	super();
    }
    
    /** Constructor with parameters for class Book*/
    public Book(final String NAME, final int AUTHOR_ID, final int AMOUNT) {
    	super();
    	this.name = NAME;
    	this.authorId = AUTHOR_ID;
    	this.amount = AMOUNT;
    }
    
    /** Constructor with parameters for class Book*/
    public Book(final String NAME, final String AUTHOR, final int AMOUNT) {
    	super();
    	this.name = NAME;
    	this.author = AUTHOR;
    	this.amount = AMOUNT;
    }

    public String getName() {
        return name;
    }
    
    public int getAuthorId() {
        return authorId;
    }

    public int getAmount() {
        return amount;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(final String NAME) {
        this.name = NAME;
    }

    public void setAmount(final int AMOUNT) {
        this.amount = AMOUNT;
    }

    public void setAuthor(final String AUTHOR) {
        this.author = AUTHOR;
    }
    
    public void setAuthorId(final int AUTHOR_ID) {
        this.authorId = AUTHOR_ID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + amount;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + authorId;
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
        final Book OTHER = (Book) OBJ;
        if (name == null) {
            if (OTHER.name != null) {
            	return false;
            }
        } else if (!name.equals(OTHER.name)) {
        	return false;
        }
        if (amount != OTHER.amount)
        	return false;
        if (author == null) {
            if (OTHER.author != null) {
            	return false;
            }
        } else if (!author.equals(OTHER.author)) {
        	return false;
        }
        if (authorId != OTHER.authorId) {
        	return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "name: " + name + "; amount" + amount + "; author" + author;
    }

}
