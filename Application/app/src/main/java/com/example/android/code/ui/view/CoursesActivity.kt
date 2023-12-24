package com.example.android.code.ui.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.R
import com.example.android.code.presentation.CoursesViewModel
import com.example.android.code.ui.list.CoursesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_courses.*

@AndroidEntryPoint
class CoursesActivity : AppCompatActivity() {

    // Courses view model
    private val viewModel: CoursesViewModel by viewModels()
    // Courses adapter that could be initialized lazily in future
    private val adapter by lazy { CoursesAdapter() }
    // By default the night mode is not active
    private var nightModeActive = false

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        initCourseList()
        subscribeToData()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        viewModel.apply {
            if (item.itemId == R.id.dayNightMode) {
                toggleNightMode()
            }
        }
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.apply {
            if (nightModeActive) {
                findItem(R.id.dayNightMode)?.setIcon(R.drawable.icn_night_mode)
            } else {
                findItem(R.id.dayNightMode)?.setIcon(R.drawable.icn_light_mode)
            }
        }
        return true
    }

    /**
     * Initializing the course list UI only
     */
    private fun initCourseList() {
        courseList.layoutManager = LinearLayoutManager(this)
        courseList.itemAnimator = DefaultItemAnimator()
        courseList.adapter = adapter
    }

    /**
     * Subscribing to the view model
     */
    private fun subscribeToData() {

        // Subscribe to get the data of courses from view model
        viewModel.courses.observe(this) {
          it?.let {coursesList -> adapter.setCourses(coursesList) }
        }

        // Subscribing to the view model for check if the theme is dark/light theme
        viewModel.darkThemeEnabled.observe(this) { nightModeActive ->
            this.nightModeActive = nightModeActive as Boolean
            toggleNightMode(nightModeActive)
        }
    }

    private fun toggleNightMode(nightModeActive: Boolean) {
        val defaultMode = if (nightModeActive) {
            // Night mode
            AppCompatDelegate.MODE_NIGHT_YES
        } else {
            // Day mode
            AppCompatDelegate.MODE_NIGHT_NO
        }
        // Notify the UI to know if it is light mode or dark mode
        AppCompatDelegate.setDefaultNightMode(defaultMode)
    }

}
