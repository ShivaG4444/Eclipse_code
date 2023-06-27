import java.util.LinkedHashMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12;
		int b=14;
		int c= a+b;
		
		System.out.println(c);
		
		String str="this is my world is this";
		
		String[] str1= str.split(" ");
		
		//char[] str1=str.toCharArray();
		
		LinkedHashMap<String, Integer> map= new LinkedHashMap<String, Integer>();
		
		for(String ch: str1 ) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);

	}

	}


