/*
 * This file is generated by jOOQ.
 */
package jooq.entities.tables.records;


import jooq.entities.tables.Subject;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class SubjectRecord extends UpdatableRecordImpl<SubjectRecord> implements Record4<Long, Boolean, String, Long> {

    private static final long serialVersionUID = 637752226;

    /**
     * Setter for <code>public.subject.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.subject.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.subject.elective</code>.
     */
    public void setElective(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.subject.elective</code>.
     */
    public Boolean getElective() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>public.subject.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.subject.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.subject.course_fid</code>.
     */
    public void setCourseFid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.subject.course_fid</code>.
     */
    public Long getCourseFid() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Boolean, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Boolean, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Subject.SUBJECT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Subject.SUBJECT.ELECTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Subject.SUBJECT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Subject.SUBJECT.COURSE_FID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getElective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCourseFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getElective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCourseFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubjectRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubjectRecord value2(Boolean value) {
        setElective(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubjectRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubjectRecord value4(Long value) {
        setCourseFid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubjectRecord values(Long value1, Boolean value2, String value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubjectRecord
     */
    public SubjectRecord() {
        super(Subject.SUBJECT);
    }

    /**
     * Create a detached, initialised SubjectRecord
     */
    public SubjectRecord(Long id, Boolean elective, String name, Long courseFid) {
        super(Subject.SUBJECT);

        set(0, id);
        set(1, elective);
        set(2, name);
        set(3, courseFid);
    }
}
