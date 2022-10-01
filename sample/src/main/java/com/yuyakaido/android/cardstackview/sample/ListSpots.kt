package com.yuyakaido.android.cardstackview.sample

import kotlin.collections.ArrayList

class ListSpots {

    public fun createSpots(): List<Spot> {
        val spots = ArrayList<Spot>()
        spots.add(Spot(name = "St. Anne's Church (Vilniaus Šv. Onos bažnyčia)", address = "Maironio g. 8", types = listOf(SpotType.CULTURAL),
                url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/St._Anne%27s_Church_Exterior_3%2C_Vilnius%2C_Lithuania_-_Diliff.jpg/375px-St._Anne%27s_Church_Exterior_3%2C_Vilnius%2C_Lithuania_-_Diliff.jpg"))
        spots.add(Spot(name = "Operos ir baleto teatras", address = "A. Vienuolio g. 1", types = listOf(SpotType.CULTURAL),
                url = "https://s1.15min.lt/images/photos/2008/09/17/original/1221659960operhauzas.jpg"))


        spots.add(Spot(name = "Lukiškių kalėjimas", address = "Lukiškių skg. 6", types = listOf(SpotType.NIGHTLIFE, SpotType.CULTURAL),
                url = "https://s1.15min.lt/static/cache/OTcweDU4MCwsNjE2MzQ0LG9yaWdpbmFsLCxpZD00NTUzNDUwJmRhdGU9MjAxOSUyRjAzJTJGMTQsODI5Nzc0MjA2/lenta-kurioje-pareigunams-suteikiama-informacija-apie-kalinciuju-ypatybes-5c8a63303e0c8.jpg"))
        spots.add(Spot(name = "Bix baras", address = "Etmonų g. 6", types = listOf(SpotType.NIGHTLIFE),
                url = "https://www.vilniusgo.lt/wp-content/uploads/2018/09/Roko-baras-Bix-3.jpg"))
        spots.add(Spot(name = "Plus Plus Plus Gastrobaras", address = "Gedimino pr. 9", types = listOf(SpotType.NIGHTLIFE),
                url = "https://www.vz.lt/apps/pbcsi.dll/storyimage/VZ/20190226/PREMIUM/190229687/AR/0/AR-190229687.jpg?exactW=800&AlignV=middle&imageversion=Horizontalus&lu=89"))
        spots.add(Spot(name = "Vijokliai beer garden", address = "Pylimo g. 66", types = listOf(SpotType.NIGHTLIFE),
                url = "https://nukaip.lt/wp-content/uploads/2016/06/vijok-f-.jpg"))

        spots.add(Spot(name = "Subačiaus apžvalgos aikštelė", address = "Subačiaus g.", types = listOf(SpotType.SIGHTSEEING),
                url = "https://www.govilnius.lt/images/5e0f13395225304133d7a3a0?w=750&h=500"))
        spots.add(Spot(name = "Trijų kryžių kalnas", address = "Kalnų parkas", types = listOf(SpotType.SIGHTSEEING),
                url = "https://www.govilnius.lt/images/5e216356882dbe523e5b08db?w=750&h=500"))
        spots.add(Spot(name = "Televizijos bokštas", address = "Sausio 13-osios g. 10", types = listOf(SpotType.SIGHTSEEING),
                url = "https://sa.lt/wp-content/uploads/2021/08/vilniaus-tv-bokstas.jpg"))
        return spots
    }
}