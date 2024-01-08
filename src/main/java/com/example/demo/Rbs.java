package com.example.demo;

public class Rbs {
	private String agreementClauseNumber;
	private String descriptionCondition;

	public Rbs(String agreementClauseNumber, String descriptionCondition) {
		this.agreementClauseNumber = agreementClauseNumber;
		this.descriptionCondition = descriptionCondition;
	}

	public String getAgreementClauseNumber() {
		return agreementClauseNumber;
	}

	public void setAgreementClauseNumber(String agreementClauseNumber) {
		this.agreementClauseNumber = agreementClauseNumber;
	}

	public String getDescriptionCondition() {
		return descriptionCondition;
	}

	public void setDescriptionCondition(String descriptionCondition) {
		this.descriptionCondition = descriptionCondition;
	}
}
