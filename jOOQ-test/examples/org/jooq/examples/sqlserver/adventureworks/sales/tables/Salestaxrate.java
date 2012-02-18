/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Salestaxrate extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord> {

	private static final long serialVersionUID = -430116521;

	/**
	 * The singleton instance of SalesTaxRate
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate SALESTAXRATE = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.lang.Integer> SALESTAXRATEID = createField("SalesTaxRateID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesTaxRate_StateProvince_StateProvinceID
	 * FOREIGN KEY (StateProvinceID)
	 * REFERENCES Person.StateProvince (StateProvinceID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.lang.Integer> STATEPROVINCEID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.lang.Byte> TAXTYPE = createField("TaxType", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.math.BigDecimal> TAXRATE = createField("TaxRate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Salestaxrate() {
		super("SalesTaxRate", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Salestaxrate(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_SALESTAXRATE;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SALESTAXRATE_SALESTAXRATEID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SALESTAXRATE_SALESTAXRATEID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SALESTAXRATE_STATEPROVINCE_STATEPROVINCEID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate(alias);
	}
}
