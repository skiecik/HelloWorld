package week2.day4.mysql.modify;

public class ModifyTickets {

	private String queryMod1 = "ALTER TABLE Tickets ADD priceUSD DECIMAL (6,2)";
	private String queryMod2 = "ALTER TABLE Movies ADD director VARCHAR(80)";
	private String queryMod3 = "ALTER TABLE Movies MODIFY COLUMN director VARCHAR(50)";
	private String queryMod4 = "ALTER TABLE Tickets DROP COLUMN priceUSD";
}
