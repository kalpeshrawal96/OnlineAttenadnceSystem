/*
 * This file is generated by jOOQ.
 */
package jooq.entities.tables.records;


import jooq.entities.tables.Student;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
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
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record8<UUID, String, String, String, Integer, Boolean, Boolean, Long> {

    private static final long serialVersionUID = 537602074;

    /**
     * Setter for <code>public.student.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.student.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.student.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.student.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.student.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.student.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.student.mac_id</code>.
     */
    public void setMacId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.student.mac_id</code>.
     */
    public String getMacId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.student.roll_number</code>.
     */
    public void setRollNumber(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.student.roll_number</code>.
     */
    public Integer getRollNumber() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.student.unaccounted</code>.
     */
    public void setUnaccounted(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.student.unaccounted</code>.
     */
    public Boolean getUnaccounted() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.student.verified</code>.
     */
    public void setVerified(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.student.verified</code>.
     */
    public Boolean getVerified() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.student.class_fid</code>.
     */
    public void setClassFid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.student.class_fid</code>.
     */
    public Long getClassFid() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<UUID, String, String, String, Integer, Boolean, Boolean, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<UUID, String, String, String, Integer, Boolean, Boolean, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Student.STUDENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Student.STUDENT.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Student.STUDENT.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Student.STUDENT.MAC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Student.STUDENT.ROLL_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Student.STUDENT.UNACCOUNTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Student.STUDENT.VERIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return Student.STUDENT.CLASS_FID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMacId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getRollNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getUnaccounted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getVerified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getClassFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMacId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRollNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getUnaccounted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getVerified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getClassFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value4(String value) {
        setMacId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value5(Integer value) {
        setRollNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value6(Boolean value) {
        setUnaccounted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value7(Boolean value) {
        setVerified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value8(Long value) {
        setClassFid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord values(UUID value1, String value2, String value3, String value4, Integer value5, Boolean value6, Boolean value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(UUID id, String firstName, String lastName, String macId, Integer rollNumber, Boolean unaccounted, Boolean verified, Long classFid) {
        super(Student.STUDENT);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, macId);
        set(4, rollNumber);
        set(5, unaccounted);
        set(6, verified);
        set(7, classFid);
    }
}
