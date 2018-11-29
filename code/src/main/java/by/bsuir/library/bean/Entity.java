package by.bsuir.library.bean;

/**
 * Abstract class for entity
 * @author Svetlana Reznichenko
 */

public abstract class Entity {
	
	/** Int variable for */
	private int id;

	/** Default constructor for abstract class Entity*/
	public Entity() {
		super();

	}

	/** Constructor with parameters for Entity class*/
	public Entity(final int ID) {
		super();
		this.id = ID;
	}

	public int getId() {
		return id;
	}

	public void setId(final int ID) {
		this.id = ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(final Object OBJ) {
		if (this == OBJ) {
			return true;
		}
		if (OBJ == null) {
			return false;
		}
		if (getClass() != OBJ.getClass()) {
			return false;
		}
		final Entity OTHER = (Entity) OBJ;
		if (id != OTHER.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + "]";
	}

}
