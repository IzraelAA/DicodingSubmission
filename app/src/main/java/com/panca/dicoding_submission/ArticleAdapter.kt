import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.panca.dicoding_submission.ItemClickListener
import com.panca.dicoding_submission.R

class ArticleAdapter(
    private val articles: List<Article>, private val itemClickListener: ItemClickListener
) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles[position]
        holder.bind(article)

        holder.itemView.setOnClickListener {
            itemClickListener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    fun getItemAtPosition(position: Int): Article {
        return articles[position]
    }

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.titleItemTextView)
        private val overviewTextView: TextView = itemView.findViewById(R.id.overviewItemTextView)
        private val imageView: ImageView = itemView.findViewById(R.id.imageItemArticle)

        fun bind(article: Article) {
            titleTextView.text = article.title
            titleTextView.maxLines = 2
            overviewTextView.text = article.overview
            overviewTextView.maxLines = 3
            overviewTextView.ellipsize = android.text.TextUtils.TruncateAt.END
            imageView.setImageResource(article.image)
        }
    }
}
