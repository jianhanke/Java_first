public class Example12{
	public static void main(String[] args){
		
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器个数:"+rt.availableProcessors()+"个");
		System.out.println("空闲内存数量:"+rt.freeMemory()/1024/1024+"M");
		System.out.println("最大空间内存:"+rt.maxMemory()/1024/1024+"M");
	}
		
}