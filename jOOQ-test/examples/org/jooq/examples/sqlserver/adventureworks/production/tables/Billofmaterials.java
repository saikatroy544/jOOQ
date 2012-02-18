/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Billofmaterials extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord> {

	private static final long serialVersionUID = -1969503055;

	/**
	 * The singleton instance of BillOfMaterials
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials BILLOFMATERIALS = new org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.lang.Integer> BILLOFMATERIALSID = createField("BillOfMaterialsID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ProductAssemblyID
	 * FOREIGN KEY (ProductAssemblyID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.lang.Integer> PRODUCTASSEMBLYID = createField("ProductAssemblyID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ComponentID
	 * FOREIGN KEY (ComponentID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.lang.Integer> COMPONENTID = createField("ComponentID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.sql.Timestamp> STARTDATE = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.sql.Timestamp> ENDDATE = createField("EndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_UnitMeasure_UnitMeasureCode
	 * FOREIGN KEY (UnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.lang.String> UNITMEASURECODE = createField("UnitMeasureCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.lang.Short> BOMLEVEL = createField("BOMLevel", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.math.BigDecimal> PERASSEMBLYQTY = createField("PerAssemblyQty", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Billofmaterials() {
		super("BillOfMaterials", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Billofmaterials(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_BILLOFMATERIALS;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_BILLOFMATERIALS_BILLOFMATERIALSID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_BILLOFMATERIALS_BILLOFMATERIALSID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_BILLOFMATERIALS_PRODUCT_PRODUCTASSEMBLYID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_BILLOFMATERIALS_PRODUCT_COMPONENTID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_BILLOFMATERIALS_UNITMEASURE_UNITMEASURECODE);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials(alias);
	}
}
