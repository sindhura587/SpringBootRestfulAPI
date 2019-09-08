package com.cts.dto;

import java.util.Set;

public class Subject {
	
	 private long subjectId;
	    private String subTitle;
	    private int durationInHours;
	    private Set<Book> references;
		public long getSubjectId() {
			return subjectId;
		}
		public void setSubjectId(long subjectId) {
			this.subjectId = subjectId;
		}
		public String getSubTitle() {
			return subTitle;
		}
		public void setSubTitle(String subTitle) {
			this.subTitle = subTitle;
		}
		public int getDurationInHours() {
			return durationInHours;
		}
		public void setDurationInHours(int durationInHours) {
			this.durationInHours = durationInHours;
		}
		public Set<Book> getReferences() {
			return references;
		}
		public void setReferences(Set<Book> references) {
			this.references = references;
		}
	    
	    

}
