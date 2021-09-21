package com.example.android.code.presentation

import androidx.lifecycle.*
import com.example.android.code.data.getCourseList
import com.example.android.code.data.preferences.SharedPrefs
import com.example.android.code.prefsstore.PrefsStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoursesViewModel @Inject constructor(
  private val prefsStore: PrefsStore
) : ViewModel() {

  val darkThemeEnabled = prefsStore.isNightMode().asLiveData()

  val courses = getCourseList().asLiveData()

  fun enableBeginnerFilter(enable: Boolean) {
    viewModelScope.launch {
      // Add a call to proto store to enable beginner filter
    }
  }

  fun enableAdvancedFilter(enable: Boolean) {
    viewModelScope.launch {
      // Add a call to proto store to enable advanced filter
    }
  }

  fun enableCompletedFilter(enable: Boolean) {
    viewModelScope.launch {
      // Add a call to proto store to enable completed filter
    }
  }

  fun toggleNightMode() {
    viewModelScope.launch {
      prefsStore.toogleNightMode()
    }
  }
}

//data class CourseUiModel(val courses: List<Course>, val filter: FilterOption.Filter)