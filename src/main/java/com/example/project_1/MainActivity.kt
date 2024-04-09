package com.example.project_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.project_1.databinding.ActivityMainBinding
import java.util.Locale
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.time.times
import android.text.Editable
import android.text.TextUtils
import android.util.Log
import kotlin.math.abs


private val Nothing?.size: Int
    get() {
        TODO("Not yet implemented")
    }

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Replace ActivityMainBinding with the actual type of your binding class

    private var totalDistance: Double = 0.0
    private var totalStops: Int = 0
    private var i:Int=0



    private fun setupListeners() {
        binding.switch1.setOnCheckedChangeListener { _, _ ->
            set()
        }
    }

    private fun set() {
        val dist = mapOf(
            "delhi" to 0, "alwar" to 22, "jaipur" to 32, "kota" to 45, "ratlam" to 51,
            "ahmedabad" to 67, "vadoara" to 69, "surut" to 75, "vapi" to 87, "nashik" to 98,
            "mumbai" to 110, "pune" to 125, "goa" to 151
        )
        val dis1 = binding.editTextText.text.toString().toLowerCase(Locale.ROOT)
        val dis2 = binding.editTextText2.text.toString().toLowerCase(Locale.ROOT)

        if (dist.containsKey(dis1) && dist.containsKey(dis2)) {
            val distance1 = dist[dis1] ?: 0
            val distance2 = dist[dis2] ?: 0
            val minusDistance = abs(distance2 - distance1)

            totalDistance = if (binding.switch1.isChecked) {
                // Convert kilometers to miles with decimal precision
                val miles = minusDistance * 0.621371
                miles
            } else {
                // Display distance in kilometers
                minusDistance.toDouble()
            }

            // Set the total distance
            binding.editTextText3.text = Editable.Factory.getInstance().newEditable("$totalDistance km")

            // Intermediate stations logic
            val start = min(distance1, distance2)
            val end = max(distance1, distance2)
            val inter = dist.filter { it.value in (start + 1) until end }
                .toList().sortedBy { it.second }

            // Calculate total stops
            totalStops = inter.size

            // Set the number of intermediate stations
            binding.editTextText4.setText("$totalStops")
        } else {
            // Handle invalid input
            binding.editTextText3.text = Editable.Factory.getInstance().newEditable("Invalid input")
            binding.editTextText4.text = Editable.Factory.getInstance().newEditable("")
        }
    }




    private var totalDistanceCovered: Int = 0


    private fun updateRemainingDistanceAndStops() {
        val dist = mapOf(
            "delhi" to 0, "alwar" to 22, "jaipur" to 32, "kota" to 45, "ratlam" to 51,
            "ahmedabad" to 67, "vadoara" to 69, "surut" to 75, "vapi" to 87, "nashik" to 98,
            "mumbai" to 110, "pune" to 125, "goa" to 151
        )

        // Get the current and next stations
        val currentStation = binding.editTextText.text.toString().toLowerCase(Locale.ROOT)
        val nextStation = binding.editTextText2.text.toString().toLowerCase(Locale.ROOT)

        // Check if the stations are valid
        if (dist.containsKey(currentStation) && dist.containsKey(nextStation)) {
            val currentDistance = dist[currentStation] ?: 0
            val nextDistance = dist[nextStation] ?: 0

            // Calculate the distance covered from the current to the next station
            val distanceCovered = abs(nextDistance - currentDistance)

            // Update the total distance covered
            totalDistanceCovered += distanceCovered

            // Update the covered distance (from delhi to next station)
            val coveredDistance .= abs(nextDistance - dist["delhi"]!!)

            // Update the total stops
            val totalStops1 = totalStops++

            // Update the remaining distance and stops EditTexts
            val remainingDistance = dist[nextStation]!! - totalDistanceCovered
            val remainingStops = dist.size - totalStops
            binding.editTextText6.setText("$remainingDistance")
            binding.editTextText8.setText("$coveredDistance")
            binding.editTextText7.setText("$remainingStops")
        } else {
            // Handle invalid input
            Log.e("MainActivity", "Invalid station input")
        }
    }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button1.setOnClickListener {
            set()
        }
        binding.button2.setOnClickListener {
            updateRemainingDistanceAndStops()
        }

        // Calculate initial total distance
        calculateInitialTotalDistance()

        // Setup listeners after initializing total distance
        setupListeners()
    }


    private fun calculateInitialTotalDistance() {
        val dist = mapOf(
            "delhi" to 0, "alwar" to 22, "jaipur" to 32, "kota" to 45, "ratlam" to 51,
            "ahmedabad" to 67, "vadoara" to 69, "surut" to 75, "vapi" to 87, "nashik" to 98,
            "mumbai" to 110, "pune" to 125, "goa" to 151
        )

        val dis1 = binding.editTextText.text.toString().toLowerCase(Locale.ROOT)
        val dis2 = binding.editTextText2.text.toString().toLowerCase(Locale.ROOT)

        if (dist.containsKey(dis1) && dist.containsKey(dis2)) {
            val distance1 = dist[dis1] ?: 0
            val distance2 = dist[dis2] ?: 0
            totalDistance = abs(distance1-distance2).toDouble()
            binding.editTextText6.setText("$totalDistance")
        } else {
            Log.e("MainActivity", "Invalid station input")
        }
    }








}