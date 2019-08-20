package jp.kirin3.listview_kotlin


import android.content.Context
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item.view.*


class UserAdapter(private val context: Context, private val user_list:List<UserModel>) : BaseAdapter() {

    val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


    override fun getCount(): Int = user_list.size

    override fun getItem(position: Int): Any? = user_list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = layoutInflater.inflate(R.layout.list_item, parent, false)
        val user = user_list.get(position)
        view.uname.text = user.Name
        view.uage.text = user.Age.toString()

        return view
    }
}
