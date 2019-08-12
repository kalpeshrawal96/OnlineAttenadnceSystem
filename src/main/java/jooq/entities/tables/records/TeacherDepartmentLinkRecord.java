/*
 * This file is generated by jOOQ.
 */
package jooq.entities.tables.records;


import jooq.entities.tables.TeacherDepartmentLink;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TeacherDepartmentLinkRecord extends UpdatableRecordImpl<TeacherDepartmentLinkRecord> implements Record2<UUID, Long> {

    private static final long serialVersionUID = -1331450888;

    /**
     * Setter for <code>public.teacher_department_link.teacher_fid</code>.
     */
    public void setTeacherFid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.teacher_department_link.teacher_fid</code>.
     */
    public UUID getTeacherFid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.teacher_department_link.department_fid</code>.
     */
    public void setDepartmentFid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.teacher_department_link.department_fid</code>.
     */
    public Long getDepartmentFid() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<UUID, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UUID, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UUID, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return TeacherDepartmentLink.TEACHER_DEPARTMENT_LINK.TEACHER_FID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TeacherDepartmentLink.TEACHER_DEPARTMENT_LINK.DEPARTMENT_FID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getTeacherFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDepartmentFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getTeacherFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDepartmentFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherDepartmentLinkRecord value1(UUID value) {
        setTeacherFid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherDepartmentLinkRecord value2(Long value) {
        setDepartmentFid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherDepartmentLinkRecord values(UUID value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeacherDepartmentLinkRecord
     */
    public TeacherDepartmentLinkRecord() {
        super(TeacherDepartmentLink.TEACHER_DEPARTMENT_LINK);
    }

    /**
     * Create a detached, initialised TeacherDepartmentLinkRecord
     */
    public TeacherDepartmentLinkRecord(UUID teacherFid, Long departmentFid) {
        super(TeacherDepartmentLink.TEACHER_DEPARTMENT_LINK);

        set(0, teacherFid);
        set(1, departmentFid);
    }
}
