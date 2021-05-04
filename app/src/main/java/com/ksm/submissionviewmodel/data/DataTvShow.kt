package com.ksm.submissionviewmodel.data

import com.ksm.submissionviewmodel.R

object DataTvShow {

    private val nameTvShow = arrayOf(
            "Shadow and Bone",
            "Mare of Easttown",
            "Them",
            "The Nevers",
            "Line of Duty",
            "Game of Thrones",
            "Invicible",
            "Grey's Anatomy",
            "The Walking Dead",
            "The Crown"
    )

    private val scoreTvShow = arrayOf(
            "Score: 8.0",
            "Score: 8.3",
            "Score: 7.2",
            "Score: 7.2",
            "Score: 8.7",
            "Score: 9.3",
            "Score: 8.9",
            "Score: 7.6",
            "Score: 8.2",
            "Score: 8.7"
    )

    private val genreTvShow = arrayOf(
            "Genre: Action, Adventure, Drama",
            "Genre: Crime, Drama, Mystery",
            "Genre: Drama, Horror, Thriller",
            "Genre: Action, Drama, Fantasy",
            "Genre: Crime, Drama, Mystery",
            "Genre: Action, Adventure, Drama",
            "Genre: Animation, Action, Adventure",
            "Genre: Drama, Romance",
            "Genre: Drama, Horror, Thriller",
            "Genre: Biography, Drama, History"
    )

    private val fotoTvShow = intArrayOf(
            R.drawable.tv_show1,
            R.drawable.tv_show2,
            R.drawable.tv_show3,
            R.drawable.tv_show4,
            R.drawable.tv_show5,
            R.drawable.tv_show6,
            R.drawable.tv_show7,
            R.drawable.tv_show8,
            R.drawable.tv_show9,
            R.drawable.tv_show10
    )

    private val synopsisTvShow = arrayOf(
            "Synopsis: \nIn a world where dark forces have taken over a young mapmaker, Alina Starkov accidentally discovers that she has the power to change the fate of war. She is the only one who has the power to summon light and this will make her play a key role in this war.",
            "Synopsis: \nA detective in a small Pennsylvania town investigates a local murder while trying to keep her life from falling apart.",
            "Synopsis: \nA limited anthology series that explores terror in America. The first season, 1950s-set \"Covenant\" centers around a Black family who move from North Carolina to an all-white Los Angeles neighborhood during the period known as The Great Migration. The family's idyllic home becomes ground zero where malevolent forces, next door and otherworldly, threaten to taunt, ravage and destroy them.",
            "Synopsis: \nAn epic tale following a gang of Victorian women who find themselves with unusual abilities, relentless enemies, and a mission that might change the world.",
            "Synopsis: \nLine of Duty follows Detective Seargent Steven \"Steve\" Arnott (Martin Compston), a former authorized firearms officer who led an operation to catch an Islamic terrorist intending to detonate a bomb, but the strike team mistakenly entered the wrong apartment and shot dead an unarmed innocent man. In the subsequent investigation, Arnott refused to cover up negligence in the planning and execution of the raid and unable to work in his unit anymore, Arnott receives a transfer to AC-12, a unit tasked with uncovering police corruption. Arnott is partnered with Detective Constable Kathrine \"Kate\" Fleming (Vicky McClure), a highly commended undercover officer with a keen investigative instinct. They work under the supervision of Superintendent Edward \"Ted\" Hastings (Adrian Dunbar), who is one of several Senior Investigating Officers responsible for uncovering corruption within the police force. Throughout the series, AC-12 investigate seemingly disparate cases involving seemingly corrupt",
            "Synopsis: \nIn the mythical continent of Westeros, several powerful families fight for control of the Seven Kingdoms. As conflict erupts in the kingdoms of men, an ancient enemy rises once again to threaten them all. Meanwhile, the last heirs of a recently usurped dynasty plot to take back their homeland from across the Narrow Sea.",
            "Synopsis: \nThe son of Earth's most powerful superhero is about to become something greater than himself: something bold, something universal, something - Invincible. From the comics to the screen, Invincible follows Mark Grayson's journey of becoming Earth's next great defender after his father, Nolan Grayson: also known as Omni-Man.",
            "Synopsis: \nA medical based drama centered around Meredith Grey, an aspiring surgeon and daughter of one of the best surgeons, Dr. Ellis Grey. Throughout the series, Meredith goes through professional and personal challenges along with fellow surgeons at Seattle Grace Hospital.",
            "Synopsis: \nSheriff Deputy Rick Grimes gets shot and falls into a coma. When awoken he finds himself in a Zombie Apocalypse. Not knowing what to do he sets out to find his family, after he's done that, he gets connected to a group to become the leader. He takes charge and tries to help this group of people survive, find a place to live and get them food. This show is all about survival, the risks and the things you'll have to do to survive.",
            "Synopsis: \nThis show focuses on Queen Elizabeth II as a young newlywed faced with leading the world's most famous monarchy, while forging a relationship with legendary Prime Minister Sir Winston Churchill. The British Empire is in decline, the political world is in disarray, but a new era is dawning. Peter Morgan's masterfully researched scripts reveal the Queen's private journey behind the public façade with daring frankness. Prepare to see into the coveted world of power and privilege behind the locked doors of Westminster and Buckingham Palace.",
    )

    val listTvShow : ArrayList<EntityFilm>
        get() {
            val list = arrayListOf<EntityFilm>()
            for (position in nameTvShow.indices) {
                val tvShow = EntityFilm(
                        nameTvShow[position],
                        scoreTvShow[position],
                        genreTvShow[position],
                        fotoTvShow[position]
                )
                list.add(tvShow)
            }
            return list
        }

    val detailTvShow : ArrayList<DetailFilm>
        get() {
            val list = arrayListOf<DetailFilm>()
            for (position in nameTvShow.indices) {
                val movie = DetailFilm(
                        nameTvShow[position],
                        scoreTvShow[position],
                        genreTvShow[position],
                        fotoTvShow[position],
                        synopsisTvShow[position]
                )
                list.add(movie)
            }
            return list
        }

}