package com.neebalgurukul.day23;

public class StockGameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StockGame[] stockTraders = {new StockGame("Xander", "/home/pratik/Documents/TraderOneMoves.txt"),
			new StockGame("Afua", "/home/pratik/Documents/TraderTwoMoves.txt")};
			for (int i = 0; i < stockTraders.length; i++) {
			stockTraders[i].start();
			}
			for (int i = 0; i < stockTraders.length; i++) {
			stockTraders[i].join();
			}

;			} catch (Exception ex) {
			ex.printStackTrace();
			return;
			}
	}

}
