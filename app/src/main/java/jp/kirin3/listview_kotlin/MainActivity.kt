package jp.kirin3.listview_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ListViewオブジェクトを取得。
        val myList = findViewById<ListView>(R.id.myListView)

        //データをリストビューに入れる
        val user_list = mutableListOf<UserModel>()
        for(value in UserData.values()) {
            user_list.add(UserModel(value.Name,value.Age))
        }

        // ListViewにアダプターを設定
        myList.adapter = UserAdapter(applicationContext,user_list)
    }
}
