package com.beanautowiring.beans;

public class SalesOrder {
	
	/*
	 * private Distributor distributor; private TransportType transportType;
	 * 
	 * public SalesOrder(Distributor distributor) { super(); this.distributor =
	 * distributor; }
	 * 
	 * public void setDistributor(Distributor distributor) {
	 * System.out.println("setDistributor(Distributor distributor)");
	 * this.distributor = distributor; }
	 * 
	 * @Override public String toString() { return "SalesOrder [distributor=" +
	 * distributor + "]"; }
	 */
	private Distributor distributor;
	private TransportType transportType;
	
	public SalesOrder(TransportType transportType) {
		super();
		System.out.println("SalesOrder(TransportType transportType)");
		this.transportType = transportType;
	}

	public SalesOrder(Distributor distributor) {
		super();
		System.out.println("SalesOrder(Distributor distributor)");
		this.distributor = distributor;
	}
	
	/*
	 * public SalesOrder(Distributor distributor, TransportType transportType) {
	 * super(); System.out.
	 * println("SalesOrder(Distributor distributor, TransportType transportType)");
	 * this.distributor = distributor; this.transportType = transportType; }
	 */

	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}

	public void setDistributor(Distributor distributor) {
		System.out.println("setDistributor(Distributor distributor)");
		this.distributor = distributor;
	}

	@Override
	public String toString() {
		return "SalesOrder [distributor=" + distributor + ", transportType=" + transportType + "]";
	}

}
