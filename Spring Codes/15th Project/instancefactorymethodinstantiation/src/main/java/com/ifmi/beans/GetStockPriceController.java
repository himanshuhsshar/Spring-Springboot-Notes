package com.ifmi.beans;

import com.ifmi.ejb.StockTradeManager;
import com.ifmi.helper.AgentTradingSystemServiceLocator;

public class GetStockPriceController {
	private StockTradeManager stockTradeManager;
	
	public double findStockPrice(String stockName)
	{
		double price = 0;
//		AgentTradingSystemServiceLocator agentTradingSystemServiceLocator = null;
//		agentTradingSystemServiceLocator = new AgentTradingSystemServiceLocator();
//		stockTradeManager = (StockTradeManager) agentTradingSystemServiceLocator
//				.lookupAgentTradingSystemServiceLocator("java://bseStockTradeManager");
		price = stockTradeManager.getStockPrice(stockName);
		return price;
	}

	public void setStockTradeManager(StockTradeManager stockTradeManager) {
		this.stockTradeManager = stockTradeManager;
	}
	

}
