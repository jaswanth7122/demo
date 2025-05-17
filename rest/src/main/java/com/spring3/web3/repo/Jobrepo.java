package com.spring3.web3.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring3.web3.model.Jobpost;

@Repository
public class Jobrepo {
    List<Jobpost> jobs = new ArrayList<>(Arrays.asList(
        new Jobpost(1, "Java Developer", "Must know how to build webpages", 4),
        new Jobpost(2, "Python Developer", "Must know data science", 3),
        new Jobpost(3, "JS Developer", "Must know how to build webpages", 4),
        new Jobpost(4, "UI/UX Developer", "Must know frontend design", 1)
    ));

    public List<Jobpost> getalljobs() {
        return jobs;
    }

    public void addjob(Jobpost job) {
        jobs.add(job);
        System.out.println(jobs);
    }

	public Jobpost getJob(int postid) {
		for(Jobpost job:jobs) {
			if(job.getPostid()== postid) {
				return job;
			}
		}
		return null;
	}
}
