/*
 * Copyright (C) 2015 The SudaMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Calendar;
import android.bluros.lunar.Lunar;
import android.bluros.utils.BlurOSUtils;

public class VietnamDateView extends TextView {
    private static final String TAG = "VietnamDateView";
    private String mLastText;


    private BroadcastReceiver mIntentReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();
            if (Intent.ACTION_TIME_TICK.equals(action)
                    || Intent.ACTION_TIME_CHANGED.equals(action)
                    || Intent.ACTION_TIMEZONE_CHANGED.equals(action)
                    || Intent.ACTION_LOCALE_CHANGED.equals(action)) {

                updateVietnamDate();

            }
        }
    };

    public VietnamDateView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_TIME_TICK);
        filter.addAction(Intent.ACTION_TIME_CHANGED);
        filter.addAction(Intent.ACTION_TIMEZONE_CHANGED);
        filter.addAction(Intent.ACTION_LOCALE_CHANGED);
        getContext().registerReceiver(mIntentReceiver, filter, null, null);

        updateVietnamDate();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().unregisterReceiver(mIntentReceiver);

    }

    protected void updateVietnamDate() {
        Calendar cal = Calendar.getInstance();
        Lunar lunar = new Lunar(cal);

        int YEAR = cal.get(Calendar.YEAR); 
        int MONTH = cal.get(Calendar.MONTH); 
        int DATE = cal.get(Calendar.DATE); 
        cal.set(YEAR,MONTH,DATE);

        final String text = BlurOSUtils.isSupportLanguage(true) ? lunar.toString():"";

       
        if (!text.equals(mLastText)) {
            setText(text);
            mLastText = text;
        }

    }
}
