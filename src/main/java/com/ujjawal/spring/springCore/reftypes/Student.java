package com.ujjawal.spring.springCore.reftypes;

public class Student {
	private Scores scores;

	@Override
	public String toString() {
		return "Student [scores=" + scores + "]";
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}
}
