package resources;

public class myQuries {
public final static String totaByType = "select sum(transaction_value), count(*)" +
		"from CDW_SAPP_CREDITCARD " +
		"where TRANSACTION_TYPE = ? " +
		"GROUP by TRANSACTION_TYPE";

public static String displayTransactionsQuery = "select FIRST_NAME, LAST_NAME, SSN, c.CREDIT_CARD_NO, CUST_ZIP,cd.* from cdw_sapp_customer  c  left join cdw_sapp_creditcard cd on" + 
		" c.SSN=cd.CUST_SSN " + 
		" where c.cust_zip= ? and cd.year = ? and cd.month = ?   order by cd.day desc";

public static String totalByBranch="select count(*), sum(cd.transaction_value) from cdw_sapp_creditcard cd left join cdw_sapp_branch br on "+
									" cd.branch_code=br.branch_code "+
		                            " where br.branch_state = ? "+
									" group by br.branch_state";


public static String infoCustomer="select FIRST_NAME,LAST_NAME,SSN,CREDIT_CARD_NO,CUST_ZIP,CUST_EMAIL from cdw_sapp_customer where ssn= ? ";
public static String infoCustomer_cc="select FIRST_NAME,LAST_NAME,SSN,CREDIT_CARD_NO,CUST_ZIP,CUST_EMAIL from cdw_sapp_customer where credit_card_no= ? ";
public static String infoCustomerUpdate="UPDATE cdw_sapp_customer SET FIRST_NAME=?, LAST_NAME=?,CUST_EMAIL=? where ssn= ? ";
public static String infoCustomerUpdate_fn="UPDATE cdw_sapp_customer SET FIRST_NAME=? where ssn= ? ";
public static String infoCustomerUpdate_ln="UPDATE cdw_sapp_customer SET LAST_NAME=? where ssn= ? ";
public static String infoCustomerUpdate_eml="UPDATE cdw_sapp_customer SET CUST_EMAIL=? where ssn= ? ";

public static String infoTransactions="select transaction_id,day,month,year,credit_card_no,cust_ssn,branch_code,TRANSACTION_TYPE,TRANSACTION_VALUE from cdw_sapp_creditcard where CREDIT_CARD_NO=?  and year=? and month=?";

public static final String getTransactionByDates = "SELECT * from "
		+ " ( SELECT TRANSACTION_ID, TRANSACTION_VALUE, concat(YEAR, \"-\", LPAD(MONTH,2,'0'), \"-\", LPAD(DAY,2,'0')) as TRANSACTION_DATE, "
		+ "FIRST_NAME, LAST_NAME, SSN from cdw_sapp_creditcard cc join cdw_sapp_customer cust "
		+ "on cust.SSN = cc.CUST_SSN) as customer_transactions "
		+ "where (TRANSACTION_DATE BETWEEN ? AND ?) AND SSN = ? "
		+ "ORDER BY TRANSACTION_DATE DESC";

}
