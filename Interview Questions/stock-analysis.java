//Stock Analysis


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] sources = {{"P1:x","P2:y","P5:z"},{"P1:b","P5:a","P3:w"}};
		
		String[]result = computeParameterValues(sources);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);

	}

	private static String[] computeParameterValues(String[][] sources) {
		HashMap<String,String> stockMap = new LinkedHashMap<String,String>();
		//ArrayList<String> values = new ArrayList<String>();
		// TODO Auto-generated method stub
		for(int x = 0; x<sources.length; x++) {
			String[] source = sources[x];
			for(int y = 0;y<source.length;y++) {
				String[] data = source[y].split(":");
				
				stockMap.put(data[0], data[1]);
			
			}
		}
		
		List<String> valueList = new ArrayList<String>(stockMap.values());
		
		return valueList.toArray(new String[0]);
	}

}
