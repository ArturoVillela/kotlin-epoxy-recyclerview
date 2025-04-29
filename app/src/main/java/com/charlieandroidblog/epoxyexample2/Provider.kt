package com.charlieandroidblog.epoxyexample2

class Provider {

    companion object {
        fun getRandomValues(): ArrayList<Pair<String, String>> {
            val al = ArrayList<Pair<String,String>>()
            al.add(Pair("teemo","pekenyo demonio"))
            al.add(Pair("kait","adc mayor rango"))
            al.add(Pair("ash","good poke with slow"))
            al.add(Pair("varus","good poke with letality"))
            al.add(Pair("dogi","max magic damage possile..."))
            al.add(Pair("miss fortuna","great speed and one of the best rs in game"))
            return al
        }
    }
}