
public class Example05 {
	static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		for(String str: strs) {
			System.out.println(str);
			str="ddd";
			System.out.println(str);
		}
		System.out.println("foreach 循环修改:"+strs[0]+","+strs[1]+","+strs[2]);
		
		for(int i=0;i<strs.length;i++) {
			strs[i]="ddd";
		}
		System.out.println("普通循环修改:"+strs[0]+","+strs[1]+","+strs[2]);

	}

}
