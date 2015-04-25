
public class StringBuilderTest {
	public static void main(String[] args){
		//创建StringBuilder对象，存储字符串
		StringBuilder str = new StringBuilder("hello");
		str.append(" imooc");//在原先的字符串后追加字符串
		str.append(520);//在字符串后追加整数
		System.out.println("字符串长度: " + str.length());//字符串长度
		System.out.println("插入前: " + str);
		
		str.insert(11, "!");//在指定位置插入内容
		String str2 = str.toString();//转为String对象
		System.out.println("插入后: " + str2);
	}

}
