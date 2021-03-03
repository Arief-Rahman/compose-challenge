/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

object Fake {
    val liveStocks = listOf(
        LiveStock(0, "Milk Model Cow", R.drawable.normal_cow),
        LiveStock(1, "Tanned Cow", R.drawable.tanned_cow),
        LiveStock(2, "Just-Give-Me-a-Reason Cow", R.drawable.justgivemeareason_cow),
        LiveStock(3, "Asian Cow", R.drawable.asian_cow),
        LiveStock(4, "Cotton Candy", R.drawable.cotton_candy),
        LiveStock(5, "Taller Cotton Candy", R.drawable.taller_cotton_candy),
        LiveStock(6, "Masked Chicken", R.drawable.normal_chicken),
        LiveStock(7, "Tanned Chicken", R.drawable.tanned_chicken),
        LiveStock(8, "Puppy", R.drawable.puppy),
    )
}

data class LiveStock(val id: Int, val name: String, val imageId: Int)
