import java.io.Serializable

data class Article(
    val title: String,
    val overview: String,
    val image: Int
) : Serializable
