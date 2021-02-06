package insuranceBazaar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Bazaar {
	
	private Map <Integer,String> policyMap;
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}
	
	public void addPolicyDetails(int policyId,String policyName) {
		
		getPolicyMap().put(policyId, policyName);
		
	}
	
	public List<Integer> searchBasedOnPolicy(String policyType){
		List<Integer>list=new ArrayList<Integer>();
		for (Entry<Integer, String> entry : getPolicyMap().entrySet()) {
			if(entry.getValue().contains(policyType)) {
				list.add(entry.getKey());
			}
			return list;
		}
			
			//System.out.println(entry.getValue());
		
		return null;
	}
}
