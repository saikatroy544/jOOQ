/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Salesorderheadersalesreason extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord> {

	private static final long serialVersionUID = -2011121685;

	/**
	 * The singleton instance of SalesOrderHeaderSalesReason
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason SALESORDERHEADERSALESREASON = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesOrderHeaderSalesReason_SalesOrderHeader_SalesOrderID
	 * FOREIGN KEY (SalesOrderID)
	 * REFERENCES Sales.SalesOrderHeader (SalesOrderID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord, java.lang.Integer> SALESORDERID = createField("SalesOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesOrderHeaderSalesReason_SalesReason_SalesReasonID
	 * FOREIGN KEY (SalesReasonID)
	 * REFERENCES Sales.SalesReason (SalesReasonID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord, java.lang.Integer> SALESREASONID = createField("SalesReasonID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Salesorderheadersalesreason() {
		super("SalesOrderHeaderSalesReason", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Salesorderheadersalesreason(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SALESORDERHEADERSALESREASON_SALESORDERID_SALESREASONID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SALESORDERHEADERSALESREASON_SALESORDERID_SALESREASONID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SALESORDERHEADERSALESREASON_SALESORDERHEADER_SALESORDERID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SALESORDERHEADERSALESREASON_SALESREASON_SALESREASONID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason(alias);
	}
}
