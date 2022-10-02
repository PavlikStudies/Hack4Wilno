package com.yuyakaido.android.cardstackview.sample

import kotlin.collections.ArrayList

class ListSpots {

    fun createSpots(): List<Spot> {
        val spots = ArrayList<Spot>()
        spots.add(Spot(name = "St. Anne's Church (Vilniaus Šv. Onos bažnyčia)", address = "Maironio g. 8", longlat = "54.6832700263921,25.293039727141306", types = listOf(SpotType.CULTURAL), tags = listOf(SpotKeywords.Historic, SpotKeywords.Monuments),
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/St._Anne%27s_Church_Exterior_3%2C_Vilnius%2C_Lithuania_-_Diliff.jpg/375px-St._Anne%27s_Church_Exterior_3%2C_Vilnius%2C_Lithuania_-_Diliff.jpg"))
        spots.add(Spot(name = "Operos ir baleto teatras", address = "A. Vienuolio g. 1", longlat = "54.68900259596128,25.278454898305593", types = listOf(SpotType.CULTURAL),  tags = listOf(SpotKeywords.Educational),
            url = "https://s1.15min.lt/images/photos/2008/09/17/original/1221659960operhauzas.jpg"))
        spots.add(Spot(name = "Valdovų rūmai", address = "Katedros a. 4, Vilnius", longlat = "54.686036308489314,25.289120427141413", types = listOf(SpotType.CULTURAL, SpotType.SIGHTSEEING), tags = listOf(SpotKeywords.Historic, SpotKeywords.Outdoor, SpotKeywords.Monuments, SpotKeywords.Museum, SpotKeywords.Educational),
            url =  "https://www.vle.lt/uploads/_CGSmartImage/116437_1-8bc01002313f7749cf98b5b2c300ffe8.jpg"))
        spots.add(Spot(name = "Energetikos ir technikos muziejus", address = "Rinktinės g. 2, Vilnius", longlat = "54.69060421116387,25.288232000156928", types = listOf(SpotType.CULTURAL, SpotType.SIGHTSEEING), tags = listOf(SpotKeywords.Educational, SpotKeywords.Museum),
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Energetikos_ir_technikos_muziejus.jpg/1200px-Energetikos_ir_technikos_muziejus.jpg"))
        spots.add(Spot(name = "Vilniaus senasis teatras", address = "Jono Basanavičiaus g. 13", longlat = "54.681135632913886,25.27326404248473", types = listOf(SpotType.CULTURAL), tags = listOf(SpotKeywords.Historic, SpotKeywords.Educational),
            url = "https://upload.wikimedia.org/wikipedia/commons/9/94/Rusdramis_by_Augustas_Didzgalvis.jpg"))



        spots.add(Spot(name = "Saulės Jėgainė", address = "Kauno g. 5", longlat = "54.67333948358332,25.277771486663827", types = listOf(SpotType.NIGHTLIFE), tags = listOf(SpotKeywords.Nightclub, SpotKeywords.Bar),
                url = "https://www.lrt.lt/img/2020/01/08/580359-706868-1287x836.jpg" ))
        spots.add(Spot(name = "Opium Club", address = "Islandijos g. 4", longlat = "54.684447233482665,25.27762759830539", types = listOf(SpotType.NIGHTLIFE), tags = listOf(SpotKeywords.Nightclub, SpotKeywords.Bar),
                url = "https://www.zmones.lt/photo/2be96ed9-1db8-11ea-9890-aa000054c883/1920x1080sp26561747/vilniaus-naktinis-klubas-opium-tautvydo-stuko-nuotrauka-5df3a5a755a772-52312677.jpeg"    ))
        spots.add(Spot(name = "Lukiškių kalėjimas", address = "Lukiškių skg. 6", longlat = "54.69222969901324,25.267209682962193", types = listOf(SpotType.NIGHTLIFE, SpotType.CULTURAL), tags = listOf(SpotKeywords.Historic, SpotKeywords.Educational, SpotKeywords.Museum),
                url = "https://s1.15min.lt/static/cache/OTcweDU4MCwsNjE2MzQ0LG9yaWdpbmFsLCxpZD00NTUzNDUwJmRhdGU9MjAxOSUyRjAzJTJGMTQsODI5Nzc0MjA2/lenta-kurioje-pareigunams-suteikiama-informacija-apie-kalinciuju-ypatybes-5c8a63303e0c8.jpg"))
        spots.add(Spot(name = "Bix baras", address = "Etmonų g. 6", longlat = "54.676732326501636,25.286751269469242", types = listOf(SpotType.NIGHTLIFE), tags = listOf(SpotKeywords.Bar, SpotKeywords.Outdoor),
                url = "https://www.vilniusgo.lt/wp-content/uploads/2018/09/Roko-baras-Bix-3.jpg"))
        spots.add(Spot(name = "Plus Plus Plus Gastrobaras", address = "Gedimino pr. 9", longlat = "54.686973906340505,25.281910940633747", types = listOf(SpotType.NIGHTLIFE), tags = listOf(SpotKeywords.Bar),
                url = "https://www.vz.lt/apps/pbcsi.dll/storyimage/VZ/20190226/PREMIUM/190229687/AR/0/AR-190229687.jpg?exactW=800&AlignV=middle&imageversion=Horizontalus&lu=89"))
        spots.add(Spot(name = "Vijokliai beer garden", address = "Pylimo g. 66", longlat = "54.672297195880525,25.28738484248441", types = listOf(SpotType.NIGHTLIFE), tags = listOf(SpotKeywords.Bar),
                url = "https://nukaip.lt/wp-content/uploads/2016/06/vijok-f-.jpg"))



        spots.add(Spot(name = "Subačiaus apžvalgos aikštelė", address = "Subačiaus g.", longlat = "54.67764934674044,25.300551098305156", types = listOf(SpotType.SIGHTSEEING), tags = listOf(SpotKeywords.Outdoor),
                url = "https://www.govilnius.lt/images/5e0f13395225304133d7a3a0?w=750&h=500"))
        spots.add(Spot(name = "Trijų kryžių kalnas", address = "Kalnų parkas", longlat = "54.68694292394984,25.29761771364905", types = listOf(SpotType.SIGHTSEEING), tags = listOf(SpotKeywords.Outdoor),
                url = "https://www.govilnius.lt/images/5e216356882dbe523e5b08db?w=750&h=500"))
        spots.add(Spot(name = "Televizijos bokštas", address = "Sausio 13-osios g. 10", longlat = "54.688480010471864,25.215137096454427", types = listOf(SpotType.SIGHTSEEING), tags = listOf(SpotKeywords.Outdoor, SpotKeywords.Historic),
                url = "https://sa.lt/wp-content/uploads/2021/08/vilniaus-tv-bokstas.jpg"))
        spots.add(Spot(name = "Sereikiškių parko Bernardinų sodas", address = "Barboros Radvilaitės g. 8A", longlat = "54.68455203308244,25.295404082961888", types = listOf(SpotType.SIGHTSEEING), tags = listOf(SpotKeywords.Outdoor),
                url = "https://www.govilnius.lt/images/5e0f257e0cc3d9528c0d4985?w=750&h=500"))

        return spots
    }

    fun filterByEnum(spots: List<Spot>, spotType: SpotType): List<Spot> {
        return spots.filter { spot -> spot.types!!.contains(spotType) }
    }
}