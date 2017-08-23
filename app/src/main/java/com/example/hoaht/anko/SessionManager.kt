                    package com.example.hoaht.anko

                    /**
                     * Singleton.

                     * @author HoaHT
                     */

                    object Singleton {
                        val instance = Singleton

                        object A{

                        }
                    }

                    fun a() {

                        MyClass.create()

                    }

                    class MyClass1 {
                        companion object {
                        }
                    }

                    val x = MyClass1.Companion

                    class MyClass {
                        companion object Factory {
                            fun create(): MyClass = MyClass()
                        }
                    }

                    interface Factory<T> {
                        fun create(): T
                    }


                    class MyClass2 {
                        companion object : Factory<MyClass2> {
                            override fun create(): MyClass2 = MyClass2()
                        }
                    }

