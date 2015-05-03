public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "192.168.1.108", ip2 = "192.168.0.154";
		int content1 = -1, content2 =-1, content3 = -1, content4 = -1;
		int dian1, dian2, dian3;
		dian1 = ip.indexOf(".", 0);
		dian2 = ip.indexOf(".", dian1 + 1);
		dian3 = ip.indexOf(".", dian2 + 1);
		// ip.indexOf(".", 3); 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
		// 注意索引是从零开始的。
		System.out.println("这是第一个.的位置" + (dian1 + 1));
		System.out.println("这是第二个.的位置" + (dian2 + 1));
		System.out.println("这是第三个.的位置" + (dian3 + 1));
		// 从第开始个索引到第结束个索引取开始到结束前一个的子串;
		try {
			content1 = Integer.parseInt(ip.substring(0, dian1));
			content2 = Integer.parseInt(ip.substring(dian1 + 1, dian2));
			content3 = Integer.parseInt(ip.substring(dian2 + 1, dian3));
			content4 = Integer.parseInt(ip.substring(dian3 + 1, ip.length()));
		} catch (Exception e) {
			System.out.println("您输入的ip不符合规范");
			return;
		}

		if (panduan(content1, content2, content3, content4)) {
			System.out.println("ip正常通过");
		}
		else {
			System.out.println("您输入的ip有误请重新输入");
		}
		

	}

	private static boolean panduan(int content1, int content2, int content3,
			int content4) {
		if (content1 > 254 || content1 < 0 || content2 > 254 || content2 < 0
				|| content3 > 254 || content3 < 0 || content4 > 254
				|| content4 < 0) {
			return false;
		} else {
			return true;
		}

	}

}
