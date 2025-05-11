package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.model.Course
import com.example.myapplication.ui.screens.CourseListScreen
import com.example.myapplication.ui.theme.AcademicCoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcademicCoursesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseListScreen(courses = sampleCourses)
                }
            }
        }
    }
}

private val sampleCourses = listOf(
    Course(
        id = "1",
        title = "Introduction to Mechanical Engineering",
        code = "ME101",
        credits = 4,
        description = "Fundamental concepts of mechanical engineering, including statics, dynamics, and material properties.",
        prerequisites = "None"
    ),
    Course(
        id = "2",
        title = "Thermodynamics and Heat Transfer",
        code = "ME201",
        credits = 4,
        description = "Study of energy transfer, heat exchange, and thermodynamic systems in mechanical applications.",
        prerequisites = "ME101"
    ),
    Course(
        id = "3",
        title = "Fluid Mechanics",
        code = "ME301",
        credits = 3,
        description = "Principles of fluid flow, hydraulic systems, and fluid dynamics in engineering applications.",
        prerequisites = "ME201"
    ),
    Course(
        id = "4",
        title = "Machine Design",
        code = "ME401",
        credits = 4,
        description = "Design principles for mechanical systems, stress analysis, and machine component selection.",
        prerequisites = "ME201"
    ),
    Course(
        id = "5",
        title = "Manufacturing Processes",
        code = "ME501",
        credits = 3,
        description = "Modern manufacturing techniques, CNC machining, and production system design.",
        prerequisites = "ME301"
    ),
    Course(
        id = "6",
        title = "Robotics and Control Systems",
        code = "ME601",
        credits = 4,
        description = "Mechanical control systems, robotic mechanisms, and automation in manufacturing.",
        prerequisites = "ME301, ME401"
    ),
    Course(
        id = "7",
        title = "Sustainable Energy Systems",
        code = "ME701",
        credits = 3,
        description = "Study of renewable energy technologies, energy efficiency, and sustainable power systems.",
        prerequisites = "ME401"
    ),
    Course(
        id = "8",
        title = "Advanced Materials Engineering",
        code = "ME801",
        credits = 4,
        description = "Study of advanced materials, composites, and their applications in mechanical systems.",
        prerequisites = "ME301, ME401"
    ),
    Course(
        id = "9",
        title = "Vibration and Noise Control",
        code = "ME901",
        credits = 4,
        description = "Analysis of mechanical vibrations, noise reduction techniques, and system dynamics.",
        prerequisites = "ME201"
    ),
    Course(
        id = "10",
        title = "Advanced CAD/CAM Systems",
        code = "ME1001",
        credits = 3,
        description = "Advanced computer-aided design and manufacturing techniques for mechanical systems.",
        prerequisites = "ME401, ME601"
    )
)


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AcademicCoursesTheme {
        CourseListScreen(courses = sampleCourses)
    }
}