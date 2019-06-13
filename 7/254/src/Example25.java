class cachePool<T>{
	T temp;
	public void save(T temp) {
		this.temp=temp;
	}
	public T get() {
		return temp;
	}
}
public class Example25 {
	public static void main(String[] args) {
		cachePool<Integer> pool=new cachePool <Integer> ();
		pool.save(new Integer(1));
		Integer temp=pool.get();
		System.out.println(temp);
		
		cachePool<String> ceshi=new cachePool <String>();

		ceshi.save(new String("jianhanke"));
		
		String str=ceshi.get();
		
		System.out.println(str);
	}
}
