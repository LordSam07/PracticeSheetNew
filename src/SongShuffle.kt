import kotlin.random.Random

class SongShuffle {

    fun shuffle(listOfSongs :List<String>){

        val  cachedSongs = ArrayList<String>()
        var allSongsPlayed = false
        var randomIndex :Int

        while (!allSongsPlayed){

            randomIndex = Random.nextInt(0, listOfSongs.size)

            if (!cachedSongs.contains(listOfSongs[randomIndex])){
                println("Playing :${listOfSongs[randomIndex]}")
                cachedSongs.add(listOfSongs[randomIndex])
            }

            if (cachedSongs.size == listOfSongs.size)
                allSongsPlayed  = true
        }

    }
}