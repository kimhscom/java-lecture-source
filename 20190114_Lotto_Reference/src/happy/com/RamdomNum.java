package happy.com;

public class RamdomNum {
	
	private String cellNum;
	
	public RamdomNum() {
		cellNum = outPutNum();
	}
	
	private String outPutNum() {
		String strTemp = String.valueOf(((int)(Math.random()*45)+1));
		return toStringCnt(strTemp);
	}
	
	// "1"->"01"
	private String toStringCnt(String strTemp) {
		String re = "";
		if (strTemp.length()<2) {
			re = "0"+strTemp;
		} else {
			re = strTemp;
		}
		return re;
	}

	public String getCellNum() {
		return cellNum;
	}

	@Override
	public String toString() {
		return "[" + cellNum + "]";
	}

	@Override
	public int hashCode() {
		return cellNum.hashCode()+137;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		RamdomNum rn = (RamdomNum)obj;
		if (cellNum.equals(rn.getCellNum())) {
			isc = true;
		}
			return isc;		
	}	

}
