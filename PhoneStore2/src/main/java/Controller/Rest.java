package Controller;
/*
* Copyright 2014 Giuliano Bertoti 
* Released under the MIT license 
* github.com/giulianobertoti
*/

import static spark.Spark.get;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Model.Brand;
import Model.Car;
import Model.Phone;
import Model.Specification;
import Repository.Store;

import com.db4o.ObjectSet;

public class Rest {
	
	private Store store;
	
	public Rest(){
		store = new Store();
	}
	
	
	public void getPhone() throws JSONException{
		
		get("/phones/:os",(request, response) -> {        	
	        	
	        	 
	     	    ObjectSet<Phone> result = store.searchPhoneByOS(request.params(":os"));
	     		
	     	    JSONArray jsonResult = new JSONArray();
	     	    
	     	    for (Phone phone : result) {
	     	    	jsonResult.put(new JSONObject(phone));
				}
	     	    
	     	    return jsonResult;
	      });
		
	}
	
	public void getCar() {
		
		get("/cars", (req, resp) -> {
			
			Car c = new Car();
			c.setAno(2014);
			c.setFabricante("Fiat");
			return new JSONObject(c);
			
		});
	}
	
	
	public void initializeStore(){
		store.addPhone(new Phone(2000.0, "Silver", "ios", new Specification(Brand.Apple, "iPhone4")));
  		store.addPhone(new Phone(1400.0, "Silver", "android", new Specification(Brand.Samsung, "Galaxy")));
  		store.addPhone(new Phone(1400.0, "Silver", "android", new Specification(Brand.Samsung, "Galaxy")));
	}

}