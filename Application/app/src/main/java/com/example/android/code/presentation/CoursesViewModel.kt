package com.example.android.code.presentation

import androidx.lifecycle.*
import com.example.android.code.data.getCourseList
import com.example.android.code.data.prefsStore.PrefsStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoursesViewModel @Inject constructor(
  private val prefsStore: PrefsStore
) : ViewModel() {

  // Get the data as live-data from prefs-store interface
  val darkThemeEnabled = prefsStore.isNightMode().asLiveData()
  // Get the course list as live data
  val courses = getCourseList().asLiveData()

  /**
   * Toggle live data with interface abstraction
   */
  fun toggleNightMode() {
    viewModelScope.launch {
      prefsStore.toogleNightMode()
    }
  }
}