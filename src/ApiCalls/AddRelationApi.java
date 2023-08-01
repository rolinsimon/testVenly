package ApiCalls;

import Entities.Relation;
import Exceptions.ArgumentCountException;
import Exceptions.OnlyCharException;
import Repository.RelationRepository;

public class AddRelationApi {
	public final String REGEX_ONLY_CHAR = "^[a-zA-Z ]+$";

	public static void main(String[] args) {
		try {
			AddRelationApi addRelation = new AddRelationApi(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public AddRelationApi(String[] args) throws Exception {
		if (args.length != 3) {
			throw new ArgumentCountException();
		}
		String word1 = args[0];
		String word2 = args[1];
		String relation = args[2];

		if (false == word1.matches(REGEX_ONLY_CHAR) || false == word2.matches(REGEX_ONLY_CHAR)
				|| false == relation.matches(REGEX_ONLY_CHAR)) {
			throw new OnlyCharException();
		}

		System.out.println(word1 + ' ' + word2 + ' ' + relation);
		Relation newRelation = new Relation(word1, word2, relation);
		
		RelationRepository.insertRelation(newRelation);

		// INSERT INTO public.relation(w1,w2,r) VALUES (word1, word2,relation);
	}

}
