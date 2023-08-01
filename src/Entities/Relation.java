package Entities;

import java.util.function.Function;

public class Relation {
	private String word1;
	private String word2;
	private String relation;

	public Relation(String word1, String word2, String relation) {
		this.setWord1(word1);
		this.setWord2(word2);
		this.setRelation(relation);
	}

	public String getWord1() {
		return this.word1;
	}

	public void setWord1(String word) {
		this.word1 = word.toLowerCase();
	}

	public String getWord2() {
		return this.word2;
	}

	public void setWord2(String word) {
		this.word2 = word.toLowerCase();
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation.toLowerCase();
	}
}
