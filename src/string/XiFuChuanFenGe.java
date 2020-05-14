package string;

public class XiFuChuanFenGe {
	public static void main(String[] args) {
		String str = "dfsdgfeasdafaasgdf";
		String[] stemp ;
		String delLim = "a";
		stemp = str.split(delLim);
		for(int i=0;i<stemp.length;i++) {
			System.out.println(stemp[i]);			
		}
		for (String stro : stemp) {
			System.out.println(stro);
		}
	}
}
