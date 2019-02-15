
	import java.util.ArrayList;

	public class contactlist {
		private String name;
		
		public contactlist(String name) {
			this.name=name;
			
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private ArrayList<String> friendNames=new ArrayList<String>();
		private  ArrayList<String> phoneNumbers=new ArrayList();
		
		
		public boolean addFriend(String name,String number) {
			friendNames.add(name);
			phoneNumbers.add(number);
			return true;
			}
		

		public boolean modifyNumber(String name,String phoneNum) {
			for(int i=0;i<friendNames.size();i++) {
				if(name.equals(friendNames.get(i))) {
					phoneNumbers.set(i,phoneNum);
					return true;
				}
			}
			return false;
			
		}
		
		public String fndSearch(String name) {
			for(int i=0;i<friendNames.size();i++) {
				if(name.equals(friendNames.get(i))) {
				 return phoneNumbers.get(i);
				}
			}
			return null;
			
		}

	

}
