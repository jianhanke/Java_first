public class Example08{
	public static void main(String[] args){
		System.out.println("1.添加-------");
		add();
		System.out.println("2.删除----------");
		remove();
		System.out.println("3.修改--------------");
		alter();
		System.out.println("4.Stinrg类测试----------");
		Example08 example=new Example08();
		example.ceshi();
	}
	public static void add(){
		StringBuffer sb=new StringBuffer();
		sb.append("abcdefg");
		System.out.println("append添加的结果"+sb);
		sb.insert(2,"123");
		System.out.println("insert添加结果"+sb);
		System.out.println("反转"+sb.reverse());
		System.out.println("长度为"+sb.length());
		
			
		// System.out.println("大写:"+sb.toLowerCase());
		// System.out.println("小写:"+sb.toUpperCase());  
		//sb为sb为StringBuffer类型，不能写String的一些方法.
	}
	public static void remove(){
		StringBuffer sb=new StringBuffer("abcdefg");
		sb.delete(1,5);
		System.out.println("删除指定位置的结果"+sb);
		sb.deleteCharAt(2);
		System.out.println("删除指定位置的结果"+sb);
		sb.delete(0,sb.length());
		System.out.println("清空缓冲区结果"+sb);
	}
	public static void alter(){
		StringBuffer sb=new StringBuffer("abcdef");
		sb.setCharAt(1,'p');
		System.out.println("修改制定位置字符结果:"+sb);
		sb.replace(1,3,"qq");
		System.out.println("替换制定位置字符串结果"+sb);
		System.out.println("字符翻转的结果"+sb.reverse());
				System.out.println(sb.toString());

	}
	public void ceshi(){
		String sb=new String ("adfaffdfafafg");
		System.out.println("大写:"+sb.toUpperCase());
		System.out.println("小写:"+sb.toLowerCase());  
			
		System.out.println(sb.setCharAt(2,"qq"));
	}
}