/**
 * @ClassName:     gcd
 * @Description:   ���������Ǹ�����p��q�����Լ��
 * 
 * @author         thinkclaves
 * @version        V1.0  
 * @Date           2017/06/20 
 * @reference      Algorithms Fouth Edition
 */
public class gcd {

	public static int gcd(int p, int q)
	{
		if(q==0)return p;
		int r = p%q;
		return gcd(q, r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(99,66));
	}

}
