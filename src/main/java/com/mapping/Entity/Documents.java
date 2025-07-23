package com.mapping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Documents {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId; //101 -PK
	
	private long aadharNo; //1234
	
	private String panNo;//accb123

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "Documents [docId=" + docId + ", aadharNo=" + aadharNo + ", panNo=" + panNo + "]";
	}
	
	
	

}
