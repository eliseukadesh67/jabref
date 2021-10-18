package org.jabref.model.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FalseStudy {
    public String name;
    public boolean enabled;

    public FalseStudy(String name, boolean enabled){
        this.name = name;
        this.enabled = enabled;
    }
}

public class StudyDatabaseTest {

    private String name;
    private boolean enabled;

    @BeforeEach

    void setup(){
        name = "Study";
        enabled = true;
    }

    @Test

    void objectIsNullAndSameClassTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        StudyDatabase db2 = null;
        assertEquals(false, db.equals(db2));
    }

    @Test

    void objectIsNullAndClassObjectIsNotEqualTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        FalseStudy db2 = null;
        assertEquals(false, db.equals(db2));
    }

    @Test

    void objectIsNotNullAndClassObjectIsNotEqualTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        FalseStudy db2 = new FalseStudy("Study", true);
        assertEquals(false, db.equals(db2));
    }

    @Test

    void nameIsNotEqualTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        StudyDatabase db2 = new StudyDatabase("Not Study", true);
        assertEquals(false, db.equals(db2));
    }

    @Test

    void enableIsNotEqualTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        StudyDatabase db2 = new StudyDatabase("Study", false);
        assertEquals(false, db.equals(db2));
    }

    @Test

    void enableAndNameIsNotEqualTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        StudyDatabase db2 = new StudyDatabase("Not Study", false);
        assertEquals(false, db.equals(db2));
    }

    @Test

    void enableAndNameIsEqualTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        StudyDatabase db2 = new StudyDatabase("Study", true);
        assertEquals(true, db.equals(db2));
    }

    @Test
    void nameIsNullButNotEqualTest(){
        StudyDatabase db = new StudyDatabase(name, enabled);
        StudyDatabase db2 = new StudyDatabase(null, true);
        assertEquals(false, db.equals(db2));
    }

    @Test
    void nameIsNullButEqualTest(){
        StudyDatabase db = new StudyDatabase(null, enabled);
        StudyDatabase db2 = new StudyDatabase(null, true);
        assertEquals(true, db.equals(db2));
    }
}
