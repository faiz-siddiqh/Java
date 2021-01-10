package CollectionFrameworkMemberManipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Library {
	private static List<Member> memberList = new ArrayList<Member>();

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	} 
	public boolean isEmpty(){
        return memberList.isEmpty();
    }
	 public void addMember(Member memberObj) {
		memberList.add(memberObj); 
	 }
	 public List<Member> viewAllMembers(){
		 
		 return memberList;
	 }
	 public List<Member> viewMembersByAddress(String address){
		 
		 List <Member> membersbyAddress=new ArrayList();
			Iterator itr=memberList.iterator();
			while(itr.hasNext()) {
				Member member=(Member) itr.next();
				if(member.getAddress().equalsIgnoreCase(address)) {
					membersbyAddress.add(member);
				}
				
				
			}
		 return membersbyAddress;
	 }
	 
}
