package org.setmap;
import java.util.LinkedHashSet;
	import java.util.Set;

	public class hashset {

		public static void main(String[] args) {
				
				Set<Integer> se=new LinkedHashSet<Integer>();
				
				se.add(10);
				se.add(20);
				se.add(30);
				se.add(40);
				se.add(50);
				se.add(10);
				
				System.out.println(se);
				
				//size
				int size=se.size();
				System.out.println(size);
				
				//to rempove the val from set
				se.remove(30);
				System.out.println(se);
				
				//to check particular val is present or not
				boolean co=se.contains(20);
				System.out.println(co);
				
				//isempty
				boolean em=se.isEmpty();
				System.out.println(em);
				
				//clear
				se.clear();
				System.out.println(se);
			}
			
			

		}
