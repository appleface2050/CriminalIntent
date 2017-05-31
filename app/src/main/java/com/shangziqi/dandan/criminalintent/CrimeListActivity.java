package com.shangziqi.dandan.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by andy-bst on 2017/5/31.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
