package by.bsuir.library.bean;

/**
 * Entity class for author
 * @author Svetlana Reznichenko
 */

public class Author extends Entity {

	/** String variable for author's name*/
    private String name;
    /** String variable for author's birthday*/
    private String birthDate;
    
    /** Default constructor for class Author*/
    public Author() {
    	super();
    }
    
    /** Constructor with parameters for class Author*/
    public Author(final String NAME, final String BIRTH_DATE) {
    	super();
    	this.name = NAME;
    	this.birthDate = BIRTH_DATE;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setName(final String NAME) {
        this.name = NAME;
    }

    public void setBirthDate(final String BIRTH_DATE) {
        this.birthDate = BIRTH_DATE;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
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
        final Author OTHER = (Author) OBJ;
        if (name == null) {
            if (OTHER.name != null) {
            	return false;
            }
        } else if (!name.equals(OTHER.name)) {
        	return false;
        }
        if (birthDate == null) {
            if (OTHER.birthDate != null) {
            	return false;
            }
        } else if (!birthDate.equals(OTHER.birthDate)) {
        	return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "name: " + name + "; birthDate: " + birthDate;
    }
}
