/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                startActivity(restaurantIntent);
            }
        });

        // Find the View that shows the celebrities category
        TextView celebrities = (TextView) findViewById(R.id.celebrities);

        // Set a click listener on that View
        celebrities.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent celebritiyIntent = new Intent(MainActivity.this, CelebritiesActivity.class);
                startActivity(celebritiyIntent);
            }
        });

        TextView places = (TextView) findViewById(R.id.places);

        // Set a click listener on that View
        places.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {

                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);

                // Start the new activity
                startActivity(placesIntent);
            }
        });

        TextView events = (TextView) findViewById(R.id.events);

        // Set a click listener on that View
        events.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(eventsIntent);
            }
        });
    }
}