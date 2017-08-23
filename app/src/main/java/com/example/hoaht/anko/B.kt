package com.example.hoaht.anko

import android.app.Application
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlin.properties.Delegates

/**
 * B.
 *
 * @author HoaHT
 */
class User {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("$prop -> $old -> $new")
    }
    var name1: String by Delegates.vetoable("<co name>", { prop, old, new ->
        println("$prop -> $old -> $new")
        false
    })
}

fun main(args: Array<String>) {
    val user = User()
//    user.name = "first"
//    user.name = "second"
//    user.name1 = "first1"
//    user.name1 = "second2"
    aaaa(2) { k, _ -> k }
}

fun aaaa(y: Int, body: (Int, String) -> Int) {
    val s = body(y, "")
    print("aaaaaaaaaaaaaaa: $s")
}

class User1(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
    val address: String by map

    val user = User1(mapOf(
            "name" to "Hoa",
            "age" to 26,
            "address" to "Da Nang"
    ))
}

class Foo {
    fun isValid(): Boolean {
        return true
    }

    fun doSomething() {

    }
}

fun example(computeFoo: () -> Foo) {
    val someCondition = false
    val foo = Foo()
    val memoizedFoo by lazy(computeFoo)

    if (someCondition && memoizedFoo.isValid()) {
        memoizedFoo.doSomething()
    }
}

class App : Application() {
    val context: Context? = null
    val myDb = MyDatabaseHelper(context)
    val db by lazy {
        myDb
    }
}

fun <T> abc(): List<T> {
    val list: List<T>? = null
    return list!!
}

class MyDatabaseHelper(context: Context?) : SQLiteOpenHelper(context, "", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}