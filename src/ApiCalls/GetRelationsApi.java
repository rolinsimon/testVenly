package ApiCalls;

import Entities.Relation;
import Repository.RelationRepository;

public class GetRelationsApi {

	private final String RELATION_FILTER_NAME = "filterRelation";
	private final String OPTION_REVERS_NAME = "reverse";

	private String relationFilter = null;
	private boolean reverseRequired = false;

	public static void main(String[] args) {
		try {
			GetRelationsApi getRelationApi = new GetRelationsApi(args);

			System.out.println();
			System.out.println(getRelationApi.getCallResult());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public GetRelationsApi(String[] args) {
		if (args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
				String[] arg = args[i].split(":");
				
				System.out.println(arg[0]);
				System.out.println(this.RELATION_FILTER_NAME);
				System.out.println(arg[0] == this.RELATION_FILTER_NAME);

				if (arg[0].equals(this.RELATION_FILTER_NAME)) {
					System.out.println("PASS FILTER");
					this.relationFilter = arg[1];
					
				} else if (arg[0].equals(this.OPTION_REVERS_NAME)) {
					System.out.println("PASS OPTION");
					this.reverseRequired = true;
				}
			}
		}
	}

	public String getCallResult() {
		String returnString = "";
		Relation[] relations = new Relation[] {};
		System.out.println(this.relationFilter);
		System.out.println(this.reverseRequired);

		if (this.relationFilter != null) {
			relations = RelationRepository.getRelationFilterByRelation(this.relationFilter);
		} else {
			relations = RelationRepository.getAllRelation();

		}

		for (int i = 0; i < relations.length; i++) {
			Relation relation = relations[i];
			returnString = returnString + relation.getWord1() + " " + relation.getWord2() + " "
					+ relation.getRelation();

			if (this.reverseRequired == true) {
				returnString = returnString + " no";
			}
			returnString = returnString + "\n";
		}
		if (this.reverseRequired == true) {
			for (int i = 0; i < relations.length; i++) {
				Relation relation = relations[i];
				returnString = returnString + relation.getWord2() + " " + relation.getWord1() + " "
						+ relation.getRelation() + " yes\n";

			}
		}

		return returnString;

	}
}
