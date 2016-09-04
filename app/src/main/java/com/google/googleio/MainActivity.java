// Copyright 2016 Google Inc.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//      http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.googleio;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_update);

        /*ConstraintLayout constraintLayout = new ConstraintLayout(this);
        constraintLayout.setId( R.id.constraintLayout );
        ConstraintLayout.LayoutParams lpCl = new ConstraintLayout.LayoutParams( ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT );
        constraintLayout.setLayoutParams( lpCl );

        ImageView imageView = new ImageView(this);
        imageView.setId( R.id.imageView );
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(R.drawable.singapore);
        lpCl = new ConstraintLayout.LayoutParams( ConstraintLayout.LayoutParams.WRAP_CONTENT, dpToPx(186) );
        lpCl.topToTop = constraintLayout.getId();
        lpCl.leftToLeft = constraintLayout.getId();
        lpCl.rightToRight = constraintLayout.getId();
        imageView.setLayoutParams(lpCl);
        constraintLayout.addView(imageView);

        TextView textView = new TextView(this);
        textView.setText("This week at Google I/O 2016 we launched Android Studio 2.2 Preview. This release is a large update that builds upon our focus to create");
        textView.setPadding( dpToPx(16), 0, 0, 0 );
        lpCl = new ConstraintLayout.LayoutParams( dpToPx(126), ConstraintLayout.LayoutParams.WRAP_CONTENT );
        lpCl.topToBottom = imageView.getId();
        lpCl.leftToLeft = constraintLayout.getId();
        lpCl.setMargins(0, dpToPx(8), 0, 0);
        textView.setLayoutParams(lpCl);
        constraintLayout.addView(textView);

        setContentView(constraintLayout);*/
    }

    private int dpToPx(int dp){
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
