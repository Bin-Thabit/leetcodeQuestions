package StringQuestions;

public class DefanginganIPAddress {
	// https://leetcode.com/problems/defanging-an-ip-address/description/
	// 1108. Defanging an IP Address
	 public String defangIPaddr(String address) {
	       return address.replace(".","[.]");
	    }
}
