package hackerearth.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysMemorizeMe {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        //String size = sc.nextLine();
        String intArray = sc.nextLine();
        int queryNo = Integer.parseInt(sc.nextLine());
      
        List<String> queryList = new ArrayList<>();
        
        while(queryNo > 0) {
            queryList.add(sc.nextLine());
            queryNo--;
        }
        System.out.println("queryList  " + queryList);
        String[] toMemorize = intArray.split(" ");
        System.out.println("toMemorize  " + toMemorize.length + intArray);
        List<String> intArrayList = Arrays.asList(toMemorize);
        
        for(int i=0; i< queryList.size(); i++) {
            long count = 0;
            char[] toBeSearched = queryList.get(i).toCharArray();
            
           for(int j=0; j<intArrayList.size(); j++) {
        	   count = intArrayList.get(j).chars().filter(p -> p==(int)toBeSearched[0]).count();
        	   System.out.println(count);
           }
        }
	}
}
