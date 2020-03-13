package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box extends Component {
	List<Component> components = new ArrayList<>();
	
	public Box(String name) {
		super(name);
	}

	public void add(Component cp) {
		this.components.add(cp);
	}
	
	public void remove(Component cp) {
		this.components.remove(cp);
	}
	
	
}
