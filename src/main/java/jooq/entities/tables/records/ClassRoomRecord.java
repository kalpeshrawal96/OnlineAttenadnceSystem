/*
 * This file is generated by jOOQ.
 */
package jooq.entities.tables.records;


import jooq.entities.tables.ClassRoom;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ClassRoomRecord extends UpdatableRecordImpl<ClassRoomRecord> implements Record6<Long, String, Integer, String, Integer, Long> {

    private static final long serialVersionUID = 1340919591;

    /**
     * Setter for <code>public.class_room.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.class_room.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.class_room.division</code>.
     */
    public void setDivision(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.class_room.division</code>.
     */
    public String getDivision() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.class_room.minimum_subjects</code>.
     */
    public void setMinimumSubjects(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.class_room.minimum_subjects</code>.
     */
    public Integer getMinimumSubjects() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.class_room.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.class_room.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.class_room.semester</code>.
     */
    public void setSemester(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.class_room.semester</code>.
     */
    public Integer getSemester() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.class_room.course_fid</code>.
     */
    public void setCourseFid(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.class_room.course_fid</code>.
     */
    public Long getCourseFid() {
        return (Long) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Integer, String, Integer, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Integer, String, Integer, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ClassRoom.CLASS_ROOM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ClassRoom.CLASS_ROOM.DIVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ClassRoom.CLASS_ROOM.MINIMUM_SUBJECTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ClassRoom.CLASS_ROOM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ClassRoom.CLASS_ROOM.SEMESTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return ClassRoom.CLASS_ROOM.COURSE_FID;
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
    public String component2() {
        return getDivision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getMinimumSubjects();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSemester();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
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
    public String value2() {
        return getDivision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMinimumSubjects();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSemester();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getCourseFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassRoomRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassRoomRecord value2(String value) {
        setDivision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassRoomRecord value3(Integer value) {
        setMinimumSubjects(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassRoomRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassRoomRecord value5(Integer value) {
        setSemester(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassRoomRecord value6(Long value) {
        setCourseFid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassRoomRecord values(Long value1, String value2, Integer value3, String value4, Integer value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassRoomRecord
     */
    public ClassRoomRecord() {
        super(ClassRoom.CLASS_ROOM);
    }

    /**
     * Create a detached, initialised ClassRoomRecord
     */
    public ClassRoomRecord(Long id, String division, Integer minimumSubjects, String name, Integer semester, Long courseFid) {
        super(ClassRoom.CLASS_ROOM);

        set(0, id);
        set(1, division);
        set(2, minimumSubjects);
        set(3, name);
        set(4, semester);
        set(5, courseFid);
    }
}
