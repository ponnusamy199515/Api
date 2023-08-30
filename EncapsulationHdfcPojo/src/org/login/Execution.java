package org.login;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Execution {
	public static void main(String[] args) {
		HomePageHdfcPojo h = new HomePageHdfcPojo();
		h.setCustomerId(123);
		h.setPassword("Ravi@123");

		HomePageHdfcPojo h1 = new HomePageHdfcPojo();
		h1.setCustomerId(321);
		h1.setPassword("Ram@321");

		HomePageHdfcPojo h2 = new HomePageHdfcPojo();
		h2.setCustomerId(456);
		h2.setPassword("Babu@456");

		HomePageHdfcPojo h3 = new HomePageHdfcPojo();
		h3.setCustomerId(234);
		h3.setPassword("Test");

		System.out.println("===============User Defined List================");
//Iterate the object
// collection -List , set,map
//List - user defined class name
// List -Generics -similar datatype- wrapper class - pre difined class
// List - Generics - Similar datatype - wrapper class - user difined class

		List<HomePageHdfcPojo> li = new ArrayList<>();
		li.add(h);
		li.add(h1);
		li.add(h2);
		li.add(h3);

//Iterate
		for (int i = 0; i < li.size(); i++) {
			// Individual object

			HomePageHdfcPojo homePageHdfcPojo = li.get(i);

			System.out.println(homePageHdfcPojo.getCustomerId());
			System.out.println(homePageHdfcPojo.getPassword());

		}
		System.out.println("============User Defined set =============");

		// User defined set

		Set<HomePageHdfcPojo> si = new LinkedHashSet();
		si.addAll(li);
		
		for (HomePageHdfcPojo s : si) {
			System.out.println(s.getCustomerId());
			System.out.println(s.getPassword());
		}
		
		System.out.println("=========User Defined Map==============");
		// key -Integer value - HemoPageHdfcPojo
		
		Map<Integer, HomePageHdfcPojo> m = new LinkedHashMap<Integer, HomePageHdfcPojo>();
		m.put(10, h);
		m.put(20, h1);
		m.put(30, h2);
		m.put(40, h3);
		
		Collection<HomePageHdfcPojo> values = m.values();
		
		for (HomePageHdfcPojo v : values) {
			System.out.println(v.getCustomerId());
			System.out.println(v.getPassword());
			
		}

	}

}
