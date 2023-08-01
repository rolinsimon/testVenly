package Repository;

import Entities.Relation;

public class RelationRepository {

	public static void insertRelation(Relation relation) {
		
		// INSERT INTO public.relation(w1,w2,r) VALUES (relation.getWord1(),
		// relation.getWord2(),relation.getRelation());
	}

	public static Relation[] getAllRelation() {
		// SELECT * FROM public.relation

		// for test as I have no JPA
		return new Relation[] { new Relation("son", "daughter", "antonym"), new Relation("road", "street", "synonym"),
				new Relation("road", "avenuz", "related"), new Relation("synonym", "match", "related"),
				new Relation("antonym", "synonym", "antonym") };
	}

	public static Relation[] getRelationFilterByRelation(String relationString) {
		// SELECT * FROM public.relation r WHERE r.relation = relationString;

		return new Relation[] { new Relation("road", "avenuz", "related"),
				new Relation("synonym", "match", "related") };
	}

	public static boolean relationAlreadyExist(Relation relation) {
		// SELECT count(*) FROM public.relation r WHERE 
		// r.word1 = relation.getWord1() AND r.word2 = relation.getWord2() and r.relation = relation.getRelation()

		return false;
	}

	public static boolean relationReverseAlreadyExist(Relation relation) {
		// SELECT count(*) FROM public.relation r WHERE 
		// r.word2 = relation.getWord1() AND r.word1 = relation.getWord2() and r.relation = relation.getRelation()

		return false;
	}
}
