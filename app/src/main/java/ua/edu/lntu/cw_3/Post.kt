package ua.edu.lntu.cw_3

class Post(val day: Int, val title: String = "Title $day", val description: String = "This is description $day.") {
    val randomImageRes = listOf(
        R.drawable.p123,
        R.drawable.images,
        R.drawable.people_doing_outdoor_activities_collection_free_vector,
    ).random()
}
