package com.mastertheboss;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class EmployeeRepository {

   private final List<Employee> list;

   public EmployeeRepository() {
      list = new ArrayList<>();
   }

   public void addEmployee(final Employee e) {
      list.add(e);
   }

   public void deleteEmployee(final String name) {
      Employee p = findEmployeeByName(name);
      if (p != null) {
				list.remove(p);
			}
   }

   private Employee findEmployeeByName(final String name) {
      for (Employee e : list) {
         if (name.equals(e.getName())) {
					return e;
				}
      }
      return null;
   }

   public List<Employee> getEmployees() {
      return list;
   }
}
