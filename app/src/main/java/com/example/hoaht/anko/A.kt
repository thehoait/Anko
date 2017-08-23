                        package com.example.hoaht.anko

                        import java.security.Provider

                        /**
                         * A.
                         *
                         * @author HoaHT
                         */
                        class A1(x: Int) {
                            val y: Int? = 2

                            companion object {
                                @JvmStatic fun main(args: Array<String>) {
                                    val a: A? = A(1)
                                    a?.y?.let {
                                        print(it)
                                    }
                                }
                            }
                        }

                        open class A(x: Int) {
                            open val y: Int = x
                        }

                        interface B {
                            fun xyz(){}
                        }

                        interface D{
                            fun xyz(){}
                        }

                        val ab: A = object : A(1), B, D {
                            override val y = 15

                            override fun xyz() {
                                super<B>.xyz()
//                                super<D>.xyz()
                            }
                        }

                        fun foo() {
                            val adHoc = object {
                                var x: Int = 0
                                var y: Int = 0
                            }
                            print(adHoc.x + adHoc.y)
                        }

                        class C {
                            // Private function, so the return type is the anonymous object type
                            private fun foo() = object {
                                val x: String = "x"
                            }

                            // Public function, so the return type is Any
                            fun publicFoo() = object {
                                val x: String = "x"
                            }

                            fun bar() {
                                val x1 = foo().x        // Works
                        //        val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
                        //        DataProviderManager.registerDataProvider(Provider())
                                DataProviderManager.allDataProviders

                        //        Singleton.instance.init()
                            }


                            object DataProviderManager {
                                fun registerDataProvider(provider: Provider) {
                                    // ...
                                }

                                val allDataProviders: Collection<Provider>? = null
                                    get
                            }

                        }