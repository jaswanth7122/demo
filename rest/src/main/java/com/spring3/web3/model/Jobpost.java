package com.spring3.web3.model;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Jobpost {
		private int postid;
	    private String postprofile;
	    private String postdescription;
	    private int experience;
		public Jobpost(int i, String string, String string2, int j) {
			// TODO Auto-generated constructor stub
		}
		public int getPostid() {
			return postid;
		}
		public void setPostid(int postid) {
			this.postid = postid;
		}
		public String getPostprofile() {
			return postprofile;
		}
		public void setPostprofile(String postprofile) {
			this.postprofile = postprofile;
		}
		public String getPostdescription() {
			return postdescription;
		}
		public void setPostdescription(String postdescription) {
			this.postdescription = postdescription;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
	   
	}
	

