package Services;

import com.howtoprogram.junit5.Services.IElection;

public class ElectionMock implements IElection {

	@Override
	public String getCandidateNameByParty(String party) {
		
		return "Elmer Homero";
	}

	@Override
	public int getNumberOfVotesByParty(String party) {
		
		return 50;
	}

	}

