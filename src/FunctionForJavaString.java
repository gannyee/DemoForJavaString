import java.util.Arrays;


public class FunctionForJavaString {
	public static void main(String[] args){
		
		//����һ���ַ�����ѧϰJAVA��̡���
		String str = "ѧϰ JAVA ���";
		//��ӡ���ַ����ĳ���
		System.out.println("�ַ�������:" + str.length());
		//���ַ�'��'��λ��
		char c = '��';
		System.out.println("�ַ�'��'��λ�ã�" + str.indexOf(c));
		
		//����'JAVA'��λ��
		System.out.println("�ַ���JAVA��λ��" + str.indexOf("JAVA"));
		
		//�����ַ���imooc��λ�ã��Ҳ����ͷ���-1
		System.out.println("�ַ���'imooc'��λ�ã�" + str.indexOf("imooc"));
		
		//���ո��ַ����ֳ�һ�����飬���������Ԫ��
		String[] arr = str.split(" ");
		System.out.println("���ո��ֵ����飺" + Arrays.toString(arr));
		System.out.println("arr[0]" + arr[0]);
		System.out.println("arr[1]" + arr[1]);		
		System.out.println("arr[2]" + arr[2]);		
		System.out.println();
		
		//��ȡ����λ�ã�3��7��֮����Ӵ�
		System.out.println("��ȡ��3��7�����Ӵ�  " + str.substring(3,7));
		
		
		//���ַ���תΪСд
		System.out.println("תΪСд:" + str.toLowerCase());
		
		//��ȡ������Ϊ1���ַ�
		System.out.println("��ȡ������Ϊ1���ַ�:" + str.charAt(1));
		//���ַ���תΪbyte[]������ӡ���
		byte[] b = str.getBytes();
		for(int i = 0;i < b.length;i ++){
			System.out.print(b[i] + "  ");
		}
		
		System.out.println();
		
		//����һ�ַ���"ѧϰ JAVA ���"���бȽ�
		String str2 = new String("ѧϰ JAVA ���");
		System.out.println("str��str2�����ݵ�ַ��ͬ��" + (str == str2));		
		System.out.println("str��str2��������ͬ��" + str.equals(str2));		
	}

}
