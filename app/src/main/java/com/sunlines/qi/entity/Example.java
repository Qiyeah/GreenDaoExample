package com.sunlines.qi.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by temporary on 2017-01-05.
 */
@Entity
public class Example {
    @Id(autoincrement = true)
    private long id;
    private String example1;
    private int example2;
    private float example3;
    private double example4;
    private boolean example5;
    private short example6;
    @Generated(hash = 1873844291)
    public Example(long id, String example1, int example2, float example3,
            double example4, boolean example5, short example6) {
        this.id = id;
        this.example1 = example1;
        this.example2 = example2;
        this.example3 = example3;
        this.example4 = example4;
        this.example5 = example5;
        this.example6 = example6;
    }
    @Generated(hash = 646563864)
    public Example() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getExample1() {
        return this.example1;
    }
    public void setExample1(String example1) {
        this.example1 = example1;
    }
    public int getExample2() {
        return this.example2;
    }
    public void setExample2(int example2) {
        this.example2 = example2;
    }
    public float getExample3() {
        return this.example3;
    }
    public void setExample3(float example3) {
        this.example3 = example3;
    }
    public double getExample4() {
        return this.example4;
    }
    public void setExample4(double example4) {
        this.example4 = example4;
    }
    public boolean getExample5() {
        return this.example5;
    }
    public void setExample5(boolean example5) {
        this.example5 = example5;
    }
    public short getExample6() {
        return this.example6;
    }
    public void setExample6(short example6) {
        this.example6 = example6;
    }
}
