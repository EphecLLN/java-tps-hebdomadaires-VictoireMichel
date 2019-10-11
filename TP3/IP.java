/**
 * 
 */
package TP3;

/**
 * @author Victoire
 *
 */
public class IP {

private int octet1, octet2, octet3, octet4;
	
	public IP(int o1, int o2, int o3, int o4) {
		octet1 = o1;
		octet2 = o2;
		octet3 = o3;
		octet4 = o4;
	}
	
	public String toString() {
		String s = this.octet1 + "." + this.octet2 + "." + this.octet3 + "." + this.octet4;
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IP ip = new IP(192,16,1,0);
		System.out.println(ip);
	}

	public int getOctet1() {
		return octet1;
	}

	public void setOctet1(int octet1) {
		this.octet1 = octet1;
	}

	public int getOctet2() {
		return octet2;
	}

	public void setOctet2(int octet2) {
		this.octet2 = octet2;
	}

	public int getOctet3() {
		return octet3;
	}

	public void setOctet3(int octet3) {
		this.octet3 = octet3;
	}

	public int getOctet4() {
		return octet4;
	}

	public void setOctet4(int octet4) {
		this.octet4 = octet4;
	}

}
