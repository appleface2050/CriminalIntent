package com.shangziqi.dandan.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by andy-bst on 2017/5/27.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public int getRequiresPolice() {
        return mRequiresPolice;
    }

    public void setRequiresPolice(int requiresPolice) {
        mRequiresPolice = requiresPolice;
    }

    private int mRequiresPolice = 0;


    public Crime() {
        this.mDate = new Date();
        this.mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
