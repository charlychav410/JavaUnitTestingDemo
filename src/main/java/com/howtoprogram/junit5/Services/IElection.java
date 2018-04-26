package com.howtoprogram.junit5.Services;

public interface IElection {
	String getCandidateNameByParty(String party);
	int getNumberOfVotesByParty(String party);
}
