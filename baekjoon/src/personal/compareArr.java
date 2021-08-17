package personal;

public class compareArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String targetArr1[] = new String[2];
		String targetArr2[] = new String[2];
		
		targetArr1[0] = "TEST1";
		targetArr2[0] = "TEST1";
		targetArr1[1] = "TEST2";
		targetArr2[1] = "TEST2";
		
		boolean resultFlg = true;
		//길이
		if (targetArr1.length != targetArr2.length) {
			resultFlg = false;
		}
		//길이가 같을 경우
		if (resultFlg) {
			//요소 비교
			for (int i=0;i<targetArr1.length;i++) {
				boolean result = true;
				if (!targetArr1[i].equals(targetArr2[i])) {
					result = false;
				}
				if (!result) {
					resultFlg = false;
					break;
				}
			}
		}
		
		if (resultFlg) {
			System.out.println("두 배열은 같은 배열입니다.");
		} else {
			System.out.println("두 배열은 다른 배열입니다.");
		}
		
	}

}
