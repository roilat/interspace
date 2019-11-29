import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestFinal {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int a = 100;
		class A{
			A(){}
			public void doSomething(){
				System.out.println("doSomeThing"+a);
			}
		}
		//a = 200;//虽然不用声明final，但是还是不能修改
		new A().doSomething();
		String s = "abc";
		new C(){
			@Override
			public void doSomething() {
				System.out.println(s);
			}
			
		}.doSomething();
		
		TestGenericTypes.method(null);//method A
		TestGenericTypes.method(new ArrayList<>());//method A
		TestGenericTypes.method(new ArrayList<String>());//method A
		try {
			//试着获取java长泛型的类型，因为擦除法只去掉方法表中的泛型信息，但是元数据区中问题仍然保存着
			System.out.println((Class<Integer>)new TestGenericTypes<Integer>().getClass().getGenericSuperclass());
			//System.out.println(((ParameterizedType)new TestGenericTypes<Integer>().getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
			//Method m = TestGenericTypes.class.getMethod("hello", new Class<?>[]{String.class});
			//System.out.println(m.getGenericParameterTypes()[0]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int n = 0;
		List<Integer> ints = Arrays.asList(1,2,3,4);//自动装箱，变长参数，泛型
		for (Integer integer : ints) {//遍历循环
			n += integer;//自己拆箱，泛型
		}
		System.out.println(n);
		
		Integer inta = 1;
		Integer intb = 2;
		Integer intc = 3;
		Integer intd = 3;
		Integer inte = 312;
		Integer intf = 312;
		Long longg = 3L;
		System.out.println(intc == intd);//true，自动装箱，但是在小于127以内
		System.out.println(inte == intf);//false，是两个对象。不在-128~127之间
		System.out.println(intc == (inta + intb));//true，算术运算会被迫进行拆箱
		System.out.println(intc.equals(inta + intb));//true，是两个对象进行比较，Integer.equals是值相等比较。
		System.out.println(longg == inta + intb);// true，不同类型比较时进行了拆箱操作
		System.out.println(longg.equals(inta + intb));//false，这里对象比较，所以Long.equals要求是Long对象才进行拆箱比较，所以返回false
		/*Integer localObject = Integer.valueOf(1);
	    Integer localInteger1 = Integer.valueOf(2);
	    Integer localInteger2 = Integer.valueOf(3);
	    Integer localInteger3 = Integer.valueOf(3);
	    Integer localInteger4 = Integer.valueOf(312);
	    Integer localInteger5 = Integer.valueOf(312);
	    Long localLong = Long.valueOf(3L);
	    System.out.println(localInteger2 == localInteger3);
	    System.out.println(localInteger4 == localInteger5);
	    System.out.println(localInteger2.intValue() == ((Integer)localObject).intValue() + localInteger1.intValue());
	    System.out.println(localInteger2.equals(Integer.valueOf(((Integer)localObject).intValue() + localInteger1.intValue())));
	    System.out.println(localLong.longValue() == ((Integer)localObject).intValue() + localInteger1.intValue());
	    System.out.println(localLong.equals(Integer.valueOf(((Integer)localObject).intValue() + localInteger1.intValue())));*/
		
		
		
	}
}
interface C{
	public void doSomething();
}
class TestGenericTypes<T>{
	public static <T> void hello(T t){
		
	}
	public static String method(List<String> lists){
		System.out.println("method A");
		return "";
	}
	/**
	 * 不能重载，会报如下错误，书上说，返回类型不一致，也可以重载（class文件可以这么干，但是javac编译器不同意），但是实际上个似乎不可以
	 * Erasure of method method(List<String>) is the same as another method in type TestGenericTypes
	 */
/*	public static int method(List<Integer> lists){
		System.out.println("method B");
		return 1;
	}*/
}