import java.util.Arrays;


public class FunctionForJavaString {
	public static void main(String[] args){
		
		//定义一个字符串“学习JAVA编程”‘
		String str = "学习 JAVA 编程";
		//打印出字符串的长度
		System.out.println("字符串长度:" + str.length());
		//求字符'编'的位置
		char c = '编';
		System.out.println("字符'编'的位置：" + str.indexOf(c));
		
		//查找'JAVA'的位置
		System.out.println("字符串JAVA的位置" + str.indexOf("JAVA"));
		
		//查找字符串imooc的位置，找不到就返回-1
		System.out.println("字符串'imooc'的位置：" + str.indexOf("imooc"));
		
		//按空格将字符串分成一个数组，并输出数组元素
		String[] arr = str.split(" ");
		System.out.println("按空格拆分的数组：" + Arrays.toString(arr));
		System.out.println("arr[0]" + arr[0]);
		System.out.println("arr[1]" + arr[1]);		
		System.out.println("arr[2]" + arr[2]);		
		System.out.println();
		
		//获取数组位置（3，7）之间的子串
		System.out.println("获取（3，7）的子串  " + str.substring(3,7));
		
		
		//将字符串转为小写
		System.out.println("转为小写:" + str.toLowerCase());
		
		//获取索引号为1的字符
		System.out.println("获取索引号为1的字符:" + str.charAt(1));
		//将字符串转为byte[]，并打印输出
		byte[] b = str.getBytes();
		for(int i = 0;i < b.length;i ++){
			System.out.print(b[i] + "  ");
		}
		
		System.out.println();
		
		//和另一字符串"学习 JAVA 编程"进行比较
		String str2 = new String("学习 JAVA 编程");
		System.out.println("str和str2的内容地址相同？" + (str == str2));		
		System.out.println("str和str2的内容相同？" + str.equals(str2));		
	}

}
