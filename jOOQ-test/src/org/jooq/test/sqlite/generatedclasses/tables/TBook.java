/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -946132479;

	/**
	 * The singleton instance of t_book
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.sqlite.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> __RECORD_TYPE = org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.LONGVARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.LONGVARBINARY, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book");
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK_ID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK_ID);
	}
}
