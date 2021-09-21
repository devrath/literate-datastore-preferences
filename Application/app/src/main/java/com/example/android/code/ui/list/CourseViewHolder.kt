package com.example.android.code.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.R
import com.example.android.code.data.model.Course
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.course_list_item.view.*

class CourseViewHolder(
  override val containerView: View
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

  fun bind(course: Course) = with(containerView) {
    courseName.text = course.name
    courseDescription.text = course.description
  }

  companion object {
    fun create(parent: ViewGroup): CourseViewHolder {
      val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.course_list_item, parent, false)
      return CourseViewHolder(view)
    }
  }
}