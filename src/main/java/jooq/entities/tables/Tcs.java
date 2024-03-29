/*
 * This file is generated by jOOQ.
 */
package jooq.entities.tables;


import jooq.entities.Indexes;
import jooq.entities.Keys;
import jooq.entities.Public;
import jooq.entities.tables.records.TcsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tcs extends TableImpl<TcsRecord> {

    private static final long serialVersionUID = 611138098;

    /**
     * The reference instance of <code>public.tcs</code>
     */
    public static final Tcs TCS = new Tcs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcsRecord> getRecordType() {
        return TcsRecord.class;
    }

    /**
     * The column <code>public.tcs.id</code>.
     */
    public final TableField<TcsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tcs.class_fid</code>.
     */
    public final TableField<TcsRecord, Long> CLASS_FID = createField("class_fid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tcs.subject_fid</code>.
     */
    public final TableField<TcsRecord, Long> SUBJECT_FID = createField("subject_fid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tcs.teacher_fid</code>.
     */
    public final TableField<TcsRecord, UUID> TEACHER_FID = createField("teacher_fid", org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * Create a <code>public.tcs</code> table reference
     */
    public Tcs() {
        this(DSL.name("tcs"), null);
    }

    /**
     * Create an aliased <code>public.tcs</code> table reference
     */
    public Tcs(String alias) {
        this(DSL.name(alias), TCS);
    }

    /**
     * Create an aliased <code>public.tcs</code> table reference
     */
    public Tcs(Name alias) {
        this(alias, TCS);
    }

    private Tcs(Name alias, Table<TcsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tcs(Name alias, Table<TcsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Tcs(Table<O> child, ForeignKey<O, TcsRecord> key) {
        super(child, key, TCS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TCS_PKEY, Indexes.TCS_UNIQUE_CONSTRAINT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TcsRecord> getPrimaryKey() {
        return Keys.TCS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TcsRecord>> getKeys() {
        return Arrays.<UniqueKey<TcsRecord>>asList(Keys.TCS_PKEY, Keys.TCS_UNIQUE_CONSTRAINT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TcsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TcsRecord, ?>>asList(Keys.TCS__TCS_CLASS_FOREIGN_KEY, Keys.TCS__TCS_SUBJECT_FOREIGN_KEY, Keys.TCS__TCS_TEACHER_FOREIGN_KEY);
    }

    public ClassRoom classRoom() {
        return new ClassRoom(this, Keys.TCS__TCS_CLASS_FOREIGN_KEY);
    }

    public Subject subject() {
        return new Subject(this, Keys.TCS__TCS_SUBJECT_FOREIGN_KEY);
    }

    public Teacher teacher() {
        return new Teacher(this, Keys.TCS__TCS_TEACHER_FOREIGN_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tcs as(String alias) {
        return new Tcs(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tcs as(Name alias) {
        return new Tcs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tcs rename(String name) {
        return new Tcs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tcs rename(Name name) {
        return new Tcs(name, null);
    }
}
