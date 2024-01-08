package com.example.demo;

import java.util.List;
import java.util.Set;

public class Pou {
	private String creditAgreementNumber;
	private String clientName;
	private List<Rbs> rbsList;

	public String getCreditAgreementNumber() {
		return creditAgreementNumber;
	}

	public void setCreditAgreementNumber(String creditAgreementNumber) {
		this.creditAgreementNumber = creditAgreementNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public List<Rbs> getRbsList() {
		return rbsList;
	}

	public void setRbsList(List<Rbs> rbsList) {
		this.rbsList = rbsList;
	}

	public Pou(String creditAgreementNumber, String clientName, List<Rbs> rbsList) {
		this.creditAgreementNumber = creditAgreementNumber;
		this.clientName = clientName;
		this.rbsList = rbsList;
	}
}
