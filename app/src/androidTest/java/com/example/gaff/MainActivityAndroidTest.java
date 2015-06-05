package com.example.gaff;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

@LargeTest
public class MainActivityAndroidTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityAndroidTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testHasTitle() {
        assertTrue(getActivity().getTitle().equals("Gaff"));
    }
}