// join()�� StringJoiner
import java.util.StringJoiner;

public class Ex9_9 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");		// ���ڿ��� ','�� ������ �迭�� ����
		
		System.out.println(String.join("-", arr));	// �迭�� ','�� '-'�� �ٲ㼭 ����
		
		StringJoiner sj = new StringJoiner("/","[","]"); 	// ���ڿ��� �����ϴ� java.util.StringJoinerŬ����
		
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}

}
