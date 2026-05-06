package Collections;

import java.util.Objects;

public class Key
{
	int id;
	
	public Key(int id) {
		this.id=id;	
	}

	@Override
	public int hashCode() {
		return 1; // FORCING collision (all keys go to same bucket)
	}


	@Override
    public String toString() {
        return String.valueOf(id);
    }
	
}
