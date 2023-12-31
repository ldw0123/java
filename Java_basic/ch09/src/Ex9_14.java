// 래퍼 클래스
public class Ex9_14 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ? "+(i==i2)); 	// 주소 비교
		System.out.println("i.equals(i2) ? "+i.equals(i2)); 	// 내용 비교
		System.out.println("i.compareTo(i2)="+i.compareTo(i2)); 	// 같으면 0
		System.out.println("i.toString()="+i.toString());
		
		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE="+Integer.SIZE+"bits");
		System.out.println("SIZE="+Integer.BYTES+"bytes");
		System.out.println("TYPE="+Integer.TYPE);
	}

}
