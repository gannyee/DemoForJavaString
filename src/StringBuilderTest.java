
public class StringBuilderTest {
	public static void main(String[] args){
		//����StringBuilder���󣬴洢�ַ���
		StringBuilder str = new StringBuilder("hello");
		str.append(" imooc");//��ԭ�ȵ��ַ�����׷���ַ���
		str.append(520);//���ַ�����׷������
		System.out.println("�ַ�������: " + str.length());//�ַ�������
		System.out.println("����ǰ: " + str);
		
		str.insert(11, "!");//��ָ��λ�ò�������
		String str2 = str.toString();//תΪString����
		System.out.println("�����: " + str2);
	}

}
