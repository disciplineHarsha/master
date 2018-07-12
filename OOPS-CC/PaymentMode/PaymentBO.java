package com.encapsulation.cc;

public class PaymentBO {

	boolean validateCreditCard(CreditCard creditCard) {
		if ((creditCard.getCardName().contains("American Express")) && (creditCard.getCardNumber().length() == 16)
				&& ((creditCard.getCardNumber().startsWith("34")) || (creditCard.getCardNumber().startsWith("37"))))

			return true;

		else if ((creditCard.getCardName().contains("Diner's Club / International"))
				&& (creditCard.getCardNumber().length() == 16) && (creditCard.getCardNumber().startsWith("36")))

			return true;

		else if ((creditCard.getCardName().contains("Visa")) && (creditCard.getCardNumber().length() == 16)
				&& (creditCard.getCardNumber().startsWith("4")))

			return true;

		else
			;

		return false;

	}

	boolean validateCheque(Cheque cheque) {
		//String regexStr = "^[0-9]{9}$";

		if ((cheque.getBankName().equalsIgnoreCase("CapitalOne"))
				&& ((cheque.getChequeNumber().length() == 9) && (cheque.getChequeNumber().startsWith("031176110"))))
			return true;

		else if ((cheque.getBankName().equalsIgnoreCase("HSBC"))
				&& ((cheque.getChequeNumber().length() == 9) && (cheque.getChequeNumber().startsWith("021001088"))))
			return true;

		else if ((cheque.getBankName().equalsIgnoreCase("Citi bank"))
				&& ((cheque.getChequeNumber().length() == 9) && (cheque.getChequeNumber().startsWith("021000089"))))

			return true;

		else if ((cheque.getBankName().equalsIgnoreCase("Bank of America"))
				&& ((cheque.getChequeNumber().length() == 9) && (cheque.getChequeNumber().startsWith("122101706"))))
			

			return true;
		else
			;
		return false;
		

	}

}
