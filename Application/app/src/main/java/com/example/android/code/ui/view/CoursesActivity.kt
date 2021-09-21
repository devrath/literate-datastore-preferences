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
  private val viewModel: CoursesViewModel by viewModels()
  private val adapter by lazy { CoursesAdapter() }
  private var nightModeActive = false

  override fun onCreate(savedInstanceState: Bundle?) {
    setTheme(R.style.AppTheme)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_courses)

    initCourseList()
    subscribeToData()
    observeFilterChanges()
  }

  private fun initCourseList() {
    courseList.layoutManager = LinearLayoutManager(this)
    courseList.itemAnimator = DefaultItemAnimator()
    courseList.adapter = adapter
  }

  private fun subscribeToData() {
    // Subscribe to get the data from the ViewModel
    viewModel.courses.observe(this) {
      adapter.setCourses(it)
    }
    viewModel.darkThemeEnabled.observe(this){ nightModeActive ->
      this.nightModeActive = nightModeActive
      toggleNightMode(nightModeActive)
    }
  }

  private fun toggleNightMode(nightModeActive: Boolean) {
    val defaultMode = if (nightModeActive) {
      AppCompatDelegate.MODE_NIGHT_YES
    } else {
      AppCompatDelegate.MODE_NIGHT_NO
    }
    AppCompatDelegate.setDefaultNightMode(defaultMode)
  }

  private fun observeFilterChanges() {
    viewModel.apply {
      filterBeginner.setOnCheckedChangeListener { _, isChecked -> enableBeginnerFilter(isChecked) }
      filterAdvanced.setOnCheckedChangeListener { _, isChecked -> enableAdvancedFilter(isChecked) }
      filterCompleted.setOnCheckedChangeListener { _, isChecked -> enableCompletedFilter(isChecked) }
    }
  }

//  private fun updateFilter(filter: FilterOption.Filter) {
//    filterBeginner.isChecked = filter == FilterOption.Filter.BEGINNER ||
//        filter == FilterOption.Filter.BEGINNER_ADVANCED ||
//        filter == FilterOption.Filter.BEGINNER_COMPLETED ||
//        filter == FilterOption.Filter.ALL
//
//    filterAdvanced.isChecked = filter == FilterOption.Filter.ADVANCED ||
//        filter == FilterOption.Filter.ADVANCED_COMPLETED ||
//        filter == FilterOption.Filter.BEGINNER_ADVANCED ||
//        filter == FilterOption.Filter.ALL
//
//    filterCompleted.isChecked = filter == FilterOption.Filter.COMPLETED ||
//        filter == FilterOption.Filter.BEGINNER_COMPLETED ||
//        filter == FilterOption.Filter.ADVANCED_COMPLETED ||
//        filter == FilterOption.Filter.ALL
//  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.overflow_menu, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    viewModel.apply {
      if (item.itemId == R.id.dayNightMode) { toggleNightMode() }
    }
    return true
  }

  override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
    menu?.apply {
      if (nightModeActive) { findItem(R.id.dayNightMode)?.setIcon(R.drawable.icn_night_mode) }
      else { findItem(R.id.dayNightMode)?.setIcon(R.drawable.icn_light_mode) }
    }

    return true
  }
}
