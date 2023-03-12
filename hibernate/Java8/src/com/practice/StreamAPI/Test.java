package com.practice.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> list1=List.of(12,13,15,16);
      
      List<Integer> list2=new ArrayList<>();
      list2.add(1);
      list2.add(9);
      list2.add(6);
      list2.add(18);
      list2.add(3);
      list2.add(1);
      
      List<Integer> list3=Arrays.asList(91,910,131,4,5,10);
      
//      List<Integer> list4=new ArrayList<>();
//      
//      for(Integer i:list1) {
//    	  if(i%2==0) {
//    		  list4.add(i);
//    	  }
//      }
//      System.out.println(list4);
      
//      Stream<Integer> stream=list1.stream();
//      List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//      System.out.println(newList);
//      
      
      List<Integer> newList1=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
      System.out.println(newList1);
      
	}

}
