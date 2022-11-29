package ManagerCandidates;

import java.util.ArrayList;
import java.util.List;

public class ManagerCadidates {
	// ở đây t có thể để list vào contructor nhằm mục đích tránh việc new lại đối tượng liên tục
//	List<Candidates> listCandidates = new ArrayList<Candidates>();
	List<Candidates> listCandidates;
	
	public ManagerCadidates() {
		listCandidates = new ArrayList<Candidates>();
	}
	
	public void addCandidates(Candidates candidates) {
		listCandidates.add(candidates);
	}
	
	public void showCandidates() {
		for (Candidates listCandidates : listCandidates) {
			listCandidates.output();//đầu tiên m,uốn làm gì?
		}
		
	}
	
	public void removeCandidates(String id) {
//		 cach 1
		for(int i = 0 ; i< listCandidates.size(); i++) {
			if (id.equals(listCandidates.get(i).getIdCandidates())) {
				listCandidates.remove(i);
			}
		}
		
		//cach 2
//		Candidates candidates = null;
//		for (Candidates candidate : listCandidates) {			
//			if(candidate.getIdCandidates().equals(id)) {
//				candidates = candidate;
//				break;//thử lại thử
//			}
//		}
//		listCandidates.remove(candidates);
	}
	
	public void searchCadidates(String id) {
		for (Candidates searchCandidates : listCandidates) {
				if(id.equals(searchCandidates.getIdCandidates())){	
					searchCandidates.output();
				}
		}
	}
	
	
}
