package com.capgemini.inheritanceperhierarchy.enity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")  
public class ContractEmployee extends Employee{

	@Column(name="hour")
	private float payPerHour;
	
	@Column(name="peroid")
	private String contractPeriod;

	public ContractEmployee(int id, String name,float payPerHour, String contractPeriod) {
		super(id,name);
		this.payPerHour = payPerHour;
		this.contractPeriod = contractPeriod;
	}

	public ContractEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", contractPeriod=" + contractPeriod + "]";
	}

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	
	
}
