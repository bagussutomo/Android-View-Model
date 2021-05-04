package com.ksm.submissionviewmodel.data

import com.ksm.submissionviewmodel.R

object DataMovie {

    private val nameMovie = arrayOf(
            "The Godfather",
            "The Shawshank Redemption",
            "Schindler's List",
            "Raging Bull",
            "Casablanca",
            "Citizen Kane",
            "Gone with the Wind",
            "The Wizard of Oz",
            "One Flew Over the Cuckoo's Nest",
            "Lawrence of Arabia"
    )

    private val fotoMovie = intArrayOf(
            R.drawable.movie1,
            R.drawable.movie2,
            R.drawable.movie3,
            R.drawable.movie4,
            R.drawable.movie5,
            R.drawable.movie6,
            R.drawable.movie7,
            R.drawable.movie8,
            R.drawable.movie9,
            R.drawable.movie10
    )

    private val scoreMovie = arrayOf(
            "Score: 9.2",
            "Score: 9.3",
            "Score: 8.9",
            "Score: 8.2",
            "Score: 8.5",
            "Score: 8.3",
            "Score: 8.1",
            "Score: 8",
            "Score: 8.7",
            "Score: 8.3"
    )

    private val genreMovie = arrayOf(
            "Genre: Crime, Drama",
            "Genre: Drama",
            "Genre: Biography, Drama, History",
            "Genre: Biography, Drama, Sport",
            "Genre: Drama, Romance, War",
            "Genre: Drama, Mystery",
            "Genre: Drama, History, Romance",
            "Genre: Adventure, Family, Fantasy",
            "Genre: Drama",
            "Genre: Adventure, Biography, Drama"
    )

    private val synopsisMovie = arrayOf(
            "Synopsis: \nThe Godfather \"Don\" Vito Corleone is the head of the Corleone mafia family in New York. He is at the event of his daughter's wedding. Michael, Vito's youngest son and a decorated WW II Marine is also present at the wedding. Michael seems to be uninterested in being a part of the family business. Vito is a powerful man, and is kind to all those who give him respect but is ruthless against those who do not. But when a powerful and treacherous rival wants to sell drugs and needs the Don's influence for the same, Vito refuses to do it. What follows is a clash between Vito's fading old values and the new ways which may cause Michael to do the thing he was most reluctant in doing and wage a mob war against all the other mafia families which could tear the Corleone family apart.",
            "Synopsis: \nChronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man's unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red.",
            "Synopsis: \nOskar Schindler is a vain and greedy German businessman who becomes an unlikely humanitarian amid the barbaric German Nazi reign when he feels compelled to turn his factory into a refuge for Jews. Based on the true story of Oskar Schindler who managed to save about 1100 Jews from being gassed at the Auschwitz concentration camp, it is a testament to the good in all of us.",
            "Synopsis: \nWhen Jake LaMotta steps into a boxing ring and obliterates his opponent, he's a prizefighter. But when he treats his family and friends the same way, he's a ticking time bomb, ready to go off at any moment. Though LaMotta wants his family's love, something always seems to come between them. Perhaps it's his violent bouts of paranoia and jealousy. This kind of rage helped make him a champ, but in real life, he winds up in the ring alone.",
            "Synopsis: \nThe story of Rick Blaine, a cynical world-weary ex-patriate who runs a nightclub in Casablanca, Morocco during the early stages of WWII. Despite the pressure he constantly receives from the local authorities, Rick's cafe has become a kind of haven for refugees seeking to obtain illicit letters that will help them escape to America. But when Ilsa, a former lover of Rick's, and her husband, show up to his cafe one day, Rick faces a tough challenge which will bring up unforeseen complications, heartbreak and ultimately an excruciating decision to make.",
            "Synopsis: \nA group of reporters are trying to decipher the last word ever spoken by Charles Foster Kane, the millionaire newspaper tycoon: \"Rosebud\". The film begins with a news reel detailing Kane's life for the masses, and then from there, we are shown flashbacks from Kane's life. As the reporters investigate further, the viewers see a display of a fascinating man's rise to fame, and how he eventually fell off the top of the world.",
            "Synopsis: \nScarlett is a woman who can deal with a nation at war, Atlanta burning, the Union Army carrying off everything from her beloved Tara, the carpetbaggers who arrive after the war. Scarlett is beautiful. She has vitality. But Ashley, the man she has wanted for so long, is going to marry his placid cousin, Melanie. Mammy warns Scarlett to behave herself at the party at Twelve Oaks. There is a new man there that day, the day the Civil War begins. Rhett Butler. Scarlett does not know he is in the room when she pleads with Ashley to choose her instead of Melanie.",
            "Synopsis: \nWhen a tornado rips through Kansas, Dorothy and her dog, Toto, are whisked away in their house to the magical land of Oz. They follow the Yellow Brick Road toward the Emerald City to meet the Wizard, and en route they meet a Scarecrow that needs a brain, a Tin Man missing a heart, and a Cowardly Lion who wants courage. The wizard asks the group to bring him the broom of the Wicked Witch of the West to earn his help.",
            "Synopsis: \nMcMurphy has a criminal past and has once again gotten himself into trouble and is sentenced by the court. To escape labor duties in prison, McMurphy pleads insanity and is sent to a ward for the mentally unstable. Once here, McMurphy both endures and stands witness to the abuse and degradation of the oppressive Nurse Ratched, who gains superiority and power through the flaws of the other inmates. McMurphy and the other inmates band together to make a rebellious stance against the atrocious Nurse.",
            "Synopsis: \nDue to his knowledge of the native Bedouin tribes, British Lieutenant T.E. Lawrence is sent to Arabia to find Prince Faisal and serve as a liaison between the Arabs and the British in their fight against the Turks. With the aid of native Sherif Ali, Lawrence rebels against the orders of his superior officer and strikes out on a daring camel journey across the harsh desert to attack a well-guarded Turkish port."
    )

    val listMovie : ArrayList<EntityFilm>
        get() {
            val list = arrayListOf<EntityFilm>()
            for (position in nameMovie.indices) {
                val movie = EntityFilm(
                        nameMovie[position],
                        scoreMovie[position],
                        genreMovie[position],
                        fotoMovie[position]
                )
                list.add(movie)
            }
            return list
        }

    val detailMovie : ArrayList<DetailFilm>
        get() {
            val list = arrayListOf<DetailFilm>()
            for (position in nameMovie.indices) {
                val movie = DetailFilm(
                        nameMovie[position],
                        scoreMovie[position],
                        genreMovie[position],
                        fotoMovie[position],
                        synopsisMovie[position]
                )
                list.add(movie)
            }
            return list
        }

}