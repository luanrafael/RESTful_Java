package Repository;
/*
* Copyright 2014 Giuliano Bertoti 
* Released under the MIT license 
* github.com/giulianobertoti
*/

import Model.Phone;
import Model.Specification;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class Store {
	
	ObjectContainer phones = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "./bd.db4o");
	
	
	public void addPhone(Phone cel){
		phones.store(cel);
	}
	
	public ObjectSet<Phone> searchPhone(Specification specification){
		
		Query query=phones.query();
		query.descend("spec").constrain(specification);
	    ObjectSet<Phone> result = query.execute();
		return result;
		
	}
	
	public ObjectSet<Phone> searchPhoneByOS(String system){
		
		Query query=phones.query();
		query.descend("os").constrain(system);
	    ObjectSet<Phone> result = query.execute();
		return result;
		
	}
	
	
	public void delPhone(Specification spec){
		ObjectSet<Phone> list = searchPhone(spec);
		if(!list.isEmpty()){
			Phone cel = (Phone) list.next();
			phones.delete(cel);
		}
			
	}

}