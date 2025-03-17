package com.sheesha.ruqya.model

object VersesBasedOnCategory {



    val generalRuqya = listOf(
        Pair(1, 1),  // Surah Al-Fatihah, Ayah 1
        Pair(1, 2),  // Surah Al-Fatihah, Ayah 2
        Pair(1, 3),  // Surah Al-Fatihah, Ayah 3
        Pair(1, 4),  // Surah Al-Fatihah, Ayah 4
        Pair(1, 5),  // Surah Al-Fatihah, Ayah 5
        Pair(1, 6),  // Surah Al-Fatihah, Ayah 6
        Pair(1, 7),  // Surah Al-Fatihah, Ayah 7
        Pair(2, 102), // Surah Al-Baqarah, Ayah 102
        Pair(2, 255), // Surah Al-Baqarah, Ayah 255 (Ayat-ul-Kursi)
        Pair(2, 285), // Surah Al-Baqarah, Ayah 285
        Pair(2, 286), // Surah Al-Baqarah, Ayah 286
        Pair(7, 117), // Surah Al-A'raf, Ayah 117
        Pair(7, 118), // Surah Al-A'raf, Ayah 118
        Pair(7, 119), // Surah Al-A'raf, Ayah 119
        Pair(7, 120), // Surah Al-A'raf, Ayah 120
        Pair(7, 121), // Surah Al-A'raf, Ayah 121
        Pair(7, 122), // Surah Al-A'raf, Ayah 122
        Pair(10, 81), // Surah Yunus, Ayah 81
        Pair(10, 82), // Surah Yunus, Ayah 82
        Pair(20, 68), // Surah Taha, Ayah 68
        Pair(20, 69), // Surah Taha, Ayah 69
        Pair(20, 70), // Surah Taha, Ayah 70
        Pair(23, 97), // Surah Al-Mu’minun, Ayah 97
        Pair(23, 98), // Surah Al-Mu’minun, Ayah 98
        Pair(37, 1),  // Surah As-Saffat, Ayah 1
        Pair(37, 2),  // Surah As-Saffat, Ayah 2
        Pair(37, 3),  // Surah As-Saffat, Ayah 3
        Pair(37, 4),  // Surah As-Saffat, Ayah 4
        Pair(37, 5),  // Surah As-Saffat, Ayah 5
        Pair(37, 6),  // Surah As-Saffat, Ayah 6
        Pair(37, 7),  // Surah As-Saffat, Ayah 7
        Pair(37, 8),  // Surah As-Saffat, Ayah 8
        Pair(37, 9),  // Surah As-Saffat, Ayah 9
        Pair(37, 10), // Surah As-Saffat, Ayah 10
        Pair(112, 1), // Surah Al-Ikhlas, Ayah 1
        Pair(112, 2), // Surah Al-Ikhlas, Ayah 2
        Pair(112, 3), // Surah Al-Ikhlas, Ayah 3
        Pair(112, 4), // Surah Al-Ikhlas, Ayah 4
        Pair(113, 1), // Surah Al-Falaq, Ayah 1
        Pair(113, 2), // Surah Al-Falaq, Ayah 2
        Pair(113, 3), // Surah Al-Falaq, Ayah 3
        Pair(113, 4), // Surah Al-Falaq, Ayah 4
        Pair(113, 5), // Surah Al-Falaq, Ayah 5
        Pair(114, 1), // Surah An-Nas, Ayah 1
        Pair(114, 2), // Surah An-Nas, Ayah 2
        Pair(114, 3), // Surah An-Nas, Ayah 3
        Pair(114, 4), // Surah An-Nas, Ayah 4
        Pair(114, 5)  // Surah An-Nas, Ayah 5
    )

    val burningAndPunishments = listOf(
        Pair(2, 39),    // Surah Al-Baqarah, Ayah 39
        Pair(2, 161),   // Surah Al-Baqarah, Ayah 161
        Pair(3, 10),    // Surah Aal-E-Imran, Ayah 10
        Pair(3, 12),    // Surah Aal-E-Imran, Ayah 12
        Pair(4, 56),    // Surah An-Nisa, Ayah 56
        Pair(5, 37),    // Surah Al-Ma'idah, Ayah 37
        Pair(6, 93),    // Surah Al-An'am, Ayah 93
        Pair(7, 41),    // Surah Al-A'raf, Ayah 41
        Pair(7, 45),    // Surah Al-A'raf, Ayah 45
        Pair(7, 51),    // Surah Al-A'raf, Ayah 51
        Pair(9, 68),    // Surah At-Tawbah, Ayah 68
        Pair(9, 70),    // Surah At-Tawbah, Ayah 70
        Pair(10, 52),   // Surah Yunus, Ayah 52
        Pair(14, 27),   // Surah Ibrahim, Ayah 27
        Pair(14, 50),   // Surah Ibrahim, Ayah 50
        Pair(15, 43),   // Surah Al-Hijr, Ayah 43
        Pair(15, 44),   // Surah Al-Hijr, Ayah 44
        Pair(16, 29),   // Surah An-Nahl, Ayah 29
        Pair(22, 19),   // Surah Al-Hajj, Ayah 19
        Pair(22, 20),   // Surah Al-Hajj, Ayah 20
        Pair(22, 21),   // Surah Al-Hajj, Ayah 21
        Pair(22, 22),   // Surah Al-Hajj, Ayah 22
        Pair(25, 11),   // Surah Al-Furqan, Ayah 11
        Pair(25, 12),   // Surah Al-Furqan, Ayah 12
        Pair(26, 91),   // Surah Ash-Shu'ara, Ayah 91
        Pair(26, 94),   // Surah Ash-Shu'ara, Ayah 94
        Pair(32, 20),   // Surah As-Sajdah, Ayah 20
        Pair(37, 62),   // Surah As-Saffat, Ayah 62
        Pair(38, 57),   // Surah Sad, Ayah 57
        Pair(41, 19),   // Surah Fussilat, Ayah 19
        Pair(44, 43),   // Surah Ad-Dukhan, Ayah 43
        Pair(44, 44)    // Surah Ad-Dukhan, Ayah 44
    )



    val loveMagic = listOf(
        Pair(2, 102),  // Surah Al-Baqarah, Ayah 102
        Pair(3, 14),   // Surah Aal-E-Imran, Ayah 14
        Pair(4, 27),   // Surah An-Nisa, Ayah 27
        Pair(5, 54),   // Surah Al-Ma'idah, Ayah 54
        Pair(7, 188),  // Surah Al-A'raf, Ayah 188
        Pair(9, 24),   // Surah At-Tawbah, Ayah 24
        Pair(12, 30),  // Surah Yusuf, Ayah 30
        Pair(12, 31),  // Surah Yusuf, Ayah 31
        Pair(16, 57),  // Surah An-Nahl, Ayah 57
        Pair(24, 26)   // Surah An-Nur, Ayah 26
    )

    val separationMagic = listOf(
        Pair(2, 102),  // Surah Al-Baqarah, Ayah 102
        Pair(3, 64),   // Surah Aal-E-Imran, Ayah 64
        Pair(4, 34),   // Surah An-Nisa, Ayah 34
        Pair(5, 64),   // Surah Al-Ma'idah, Ayah 64
        Pair(9, 61),   // Surah At-Tawbah, Ayah 61
        Pair(12, 100), // Surah Yusuf, Ayah 100
        Pair(33, 53),  // Surah Al-Ahzab, Ayah 53
        Pair(41, 6),   // Surah Fussilat, Ayah 6
        Pair(42, 13),  // Surah Ash-Shura, Ayah 13
        Pair(66, 10)   // Surah At-Tahrim, Ayah 10
    )


    val madnessMagic = listOf(
        Pair(2, 275),  // Surah Al-Baqarah, Ayah 275
        Pair(3, 72),   // Surah Aal-E-Imran, Ayah 72
        Pair(4, 88),   // Surah An-Nisa, Ayah 88
        Pair(5, 44),   // Surah Al-Ma'idah, Ayah 44
        Pair(6, 108),  // Surah Al-An'am, Ayah 108
        Pair(7, 191),  // Surah Al-A'raf, Ayah 191
        Pair(10, 11),  // Surah Yunus, Ayah 11
        Pair(12, 15),  // Surah Yusuf, Ayah 15
        Pair(16, 24),  // Surah An-Nahl, Ayah 24
        Pair(21, 5)    // Surah Al-Anbiya, Ayah 5
    )

    val sicknessMagic = listOf(
        Pair(2, 155),  // Surah Al-Baqarah, Ayah 155
        Pair(2, 216),  // Surah Al-Baqarah, Ayah 216
        Pair(3, 174),  // Surah Aal-E-Imran, Ayah 174
        Pair(6, 42),   // Surah Al-An'am, Ayah 42
        Pair(7, 130),  // Surah Al-A'raf, Ayah 130
        Pair(9, 51),   // Surah At-Tawbah, Ayah 51
        Pair(10, 80),  // Surah Yunus, Ayah 80
        Pair(12, 64),  // Surah Yusuf, Ayah 64
        Pair(13, 11),  // Surah Ar-Ra'd, Ayah 11
        Pair(16, 69)   // Surah An-Nahl, Ayah 69
    )

    val lethargyMagic = listOf(
        Pair(2, 268),  // Surah Al-Baqarah, Ayah 268
        Pair(3, 60),   // Surah Aal-E-Imran, Ayah 60
        Pair(7, 45),   // Surah Al-A'raf, Ayah 45
        Pair(9, 80),   // Surah At-Tawbah, Ayah 80
        Pair(10, 56),  // Surah Yunus, Ayah 56
        Pair(11, 15),  // Surah Hud, Ayah 15
        Pair(12, 11),  // Surah Yusuf, Ayah 11
        Pair(13, 11),  // Surah Ar-Ra'd, Ayah 11
        Pair(16, 107), // Surah An-Nahl, Ayah 107
        Pair(40, 74)   // Surah Ghafir, Ayah 74
    )
    val badDreamsMagic = listOf(
        Pair(2, 255),  // Surah Al-Baqarah, Ayah 255 (Ayat-ul-Kursi)
        Pair(4, 115),  // Surah An-Nisa, Ayah 115
        Pair(7, 205),  // Surah Al-A'raf, Ayah 205
        Pair(13, 11),  // Surah Ar-Ra'd, Ayah 11
        Pair(16, 13),  // Surah An-Nahl, Ayah 13
        Pair(18, 110), // Surah Al-Kahf, Ayah 110
        Pair(41, 37),  // Surah Fussilat, Ayah 37
        Pair(48, 10),  // Surah Al-Fath, Ayah 10
        Pair(56, 85),  // Surah Al-Waqi'ah, Ayah 85
        Pair(78, 22)   // Surah An-Naba, Ayah 22
    )


    val illusionMagic = listOf(
        Pair(7, 116),  // Surah Al-A'raf, Ayah 116
        Pair(7, 117),  // Surah Al-A'raf, Ayah 117
        Pair(10, 81),  // Surah Yunus, Ayah 81
        Pair(10, 82),  // Surah Yunus, Ayah 82
        Pair(11, 8),   // Surah Hud, Ayah 8
        Pair(12, 15),  // Surah Yusuf, Ayah 15
        Pair(20, 69),  // Surah Taha, Ayah 69
        Pair(26, 44),  // Surah Ash-Shu'ara, Ayah 44
        Pair(27, 39),  // Surah An-Naml, Ayah 39
        Pair(37, 106)  // Surah As-Saffat, Ayah 106
    )


    val bleedingMagic = listOf(
        Pair(2, 222),  // Surah Al-Baqarah, Ayah 222
        Pair(4, 43),   // Surah An-Nisa, Ayah 43
        Pair(5, 6),    // Surah Al-Ma'idah, Ayah 6
        Pair(7, 5),    // Surah Al-A'raf, Ayah 5
        Pair(16, 106), // Surah An-Nahl, Ayah 106
        Pair(33, 35),  // Surah Al-Ahzab, Ayah 35
        Pair(35, 10),  // Surah Fatir, Ayah 10
        Pair(41, 4),   // Surah Fussilat, Ayah 4
        Pair(53, 45),  // Surah An-Najm, Ayah 45
        Pair(65, 4)    // Surah At-Talaq, Ayah 4
    )


    val marriageImpedanceMagic = listOf(
        Pair(2, 217),  // Surah Al-Baqarah, Ayah 217
        Pair(3, 14),   // Surah Aal-E-Imran, Ayah 14
        Pair(4, 1),    // Surah An-Nisa, Ayah 1
        Pair(9, 71),   // Surah At-Tawbah, Ayah 71
        Pair(24, 3),   // Surah An-Nur, Ayah 3
        Pair(33, 49),  // Surah Al-Ahzab, Ayah 49
        Pair(65, 2),   // Surah At-Talaq, Ayah 2
        Pair(65, 3),   // Surah At-Talaq, Ayah 3
        Pair(73, 20),  // Surah Al-Muzzammil, Ayah 20
        Pair(104, 2)   // Surah Al-Humazah, Ayah 2
    )


    val erectileDysfunctionMagic = listOf(
        Pair(2, 223),  // Surah Al-Baqarah, Ayah 223
        Pair(24, 30),  // Surah An-Nur, Ayah 30
        Pair(24, 31),  // Surah An-Nur, Ayah 31
        Pair(7, 26),   // Surah Al-A'raf, Ayah 26
        Pair(23, 5),   // Surah Al-Mu’minun, Ayah 5
        Pair(17, 32),  // Surah Al-Isra, Ayah 32
        Pair(66, 6),   // Surah At-Tahrim, Ayah 6
        Pair(2, 187),  // Surah Al-Baqarah, Ayah 187
        Pair(4, 24),   // Surah An-Nisa, Ayah 24
        Pair(23, 1),   // Surah Al-Mu’minun, Ayah 1
        Pair(33, 59),  // Surah Al-Ahzab, Ayah 59
        Pair(25, 68),  // Surah Al-Furqan, Ayah 68
        Pair(7, 55),   // Surah Al-A'raf, Ayah 55
        Pair(2, 222),  // Surah Al-Baqarah, Ayah 222
        Pair(4, 25)    // Surah An-Nisa, Ayah 25
    )



    val jinnBotheringVerses = listOf(
        Pair(2, 255),  // Surah Al-Baqarah, Ayah 255 (Ayat-ul-Kursi) - The Throne Verse
        Pair(72, 1),   // Surah Al-Jinn, Ayah 1
        Pair(72, 2),   // Surah Al-Jinn, Ayah 2
        Pair(72, 3),   // Surah Al-Jinn, Ayah 3
        Pair(72, 6),   // Surah Al-Jinn, Ayah 6
        Pair(55, 33),  // Surah Ar-Rahman, Ayah 33
        Pair(55, 34),  // Surah Ar-Rahman, Ayah 34
        Pair(72, 9),   // Surah Al-Jinn, Ayah 9
        Pair(51, 56),  // Surah Adh-Dhariyat, Ayah 56 - Allah’s purpose of creating jinn
        Pair(113, 1),  // Surah Al-Falaq, Ayah 1 (Protection from evil)
        Pair(113, 2),  // Surah Al-Falaq, Ayah 2 (Protection from jinn and evil)
        Pair(114, 1),  // Surah An-Nas, Ayah 1 (Seeking refuge from harmful jinn)
        Pair(114, 4),  // Surah An-Nas, Ayah 4 (Protection from jinn whispering evil)
        Pair(114, 5)   // Surah An-Nas, Ayah 5 (Protection from the jinn's evil whispers)
    )



    val heartLocksAndKnots = listOf(
        Pair(66, 3),   // Surah At-Tahrim, Ayah 3
        Pair(83, 14),  // Surah Al-Mutaffifin, Ayah 14
        Pair(2, 10),   // Surah Al-Baqarah, Ayah 10
        Pair(7, 100),  // Surah Al-A'raf, Ayah 100
        Pair(2, 7),    // Surah Al-Baqarah, Ayah 7
        Pair(13, 11),  // Surah Ar-Ra’d, Ayah 11
        Pair(26, 10),  // Surah Ash-Shu'ara, Ayah 10
        Pair(58, 5),   // Surah Al-Mujadila, Ayah 5
        Pair(47, 24),  // Surah Muhammad, Ayah 24
        Pair(8, 24),   // Surah Al-Anfal, Ayah 24
        Pair(7, 57),   // Surah Al-A’raf, Ayah 57
        Pair(9, 93),   // Surah At-Tawbah, Ayah 93
        Pair(59, 14),  // Surah Al-Hashr, Ayah 14
        Pair(58, 9),   // Surah Al-Mujadila, Ayah 9
        Pair(9, 75)    // Surah At-Tawbah, Ayah 75
    )



    val christianJinnVerses = listOf(
        Pair(3, 64),   // Surah Aal-E-Imran, Ayah 64 (Common word between Muslims, Christians, and Jews)
        Pair(5, 72),   // Surah Al-Ma'idah, Ayah 72 (Regarding the belief of the Christians about the Trinity)
        Pair(5, 73),   // Surah Al-Ma'idah, Ayah 73 (The Christian belief about God)
        Pair(9, 30),   // Surah At-Tawbah, Ayah 30 (Refers to the Christians and Jews)
        Pair(3, 55),   // Surah Aal-E-Imran, Ayah 55 (Call for the help of Allah in matters of belief)
        Pair(5, 116),  // Surah Al-Ma'idah, Ayah 116 (The day when Allah will question the Christians about their beliefs)
        Pair(2, 62),   // Surah Al-Baqarah, Ayah 62 (The People of the Book - Christians included)
        Pair(4, 171),  // Surah An-Nisa, Ayah 171 (Denunciation of the belief of Christians about divinity)
        Pair(5, 111),  // Surah Al-Ma'idah, Ayah 111 (Testifying to the truth for the Christians)
        Pair(43, 57),  // Surah Az-Zukhruf, Ayah 57 (Jesus in relation to the divinity of Allah)
    )

    val muslimJinnVerses = listOf(
        Pair(72, 1),   // Surah Al-Jinn, Ayah 1 (Jinn acknowledging the faith in Islam)
        Pair(72, 2),   // Surah Al-Jinn, Ayah 2 (Jinn admitting belief in Allah and His Messenger)
        Pair(72, 3),   // Surah Al-Jinn, Ayah 3 (Muslim jinn worship Allah alone)
        Pair(72, 4),   // Surah Al-Jinn, Ayah 4 (Jinn confessing the goodness of the message of Islam)
        Pair(72, 5),   // Surah Al-Jinn, Ayah 5 (Jinn warning others not to harm Muslims)
        Pair(72, 6),   // Surah Al-Jinn, Ayah 6 (Jinn avoid misleading Muslims)
        Pair(72, 7),   // Surah Al-Jinn, Ayah 7 (Muslim jinn being blessed with guidance)
        Pair(72, 8),   // Surah Al-Jinn, Ayah 8 (Jinn guarding the way for Muslims)
        Pair(72, 9),   // Surah Al-Jinn, Ayah 9 (Muslim jinn protecting their own faith)
        Pair(72, 10),  // Surah Al-Jinn, Ayah 10 (Muslim jinn being obedient to Allah's command)
    )

    val jewishJinnVerses = listOf(
        Pair(2, 62),   // Surah Al-Baqarah, Ayah 62 (Jews, Christians, and Muslims being People of the Book)
        Pair(5, 59),   // Surah Al-Ma'idah, Ayah 59 (Referring to the Jews and their misunderstanding of Allah's message)
        Pair(9, 30),   // Surah At-Tawbah, Ayah 30 (Jews, Christians, and idolaters are criticized for their beliefs)
        Pair(4, 160),  // Surah An-Nisa, Ayah 160 (Jews’ betrayal of Allah’s commands and their punishment)
        Pair(5, 78),   // Surah Al-Ma'idah, Ayah 78 (The curse on Jews for rejecting Allah’s signs)
        Pair(7, 159),  // Surah Al-A'raf, Ayah 159 (The Prophet’s address to the Jews for their deviation)
        Pair(2, 120),  // Surah Al-Baqarah, Ayah 120 (Jews and Christians never accepting the belief of others)
        Pair(5, 64),   // Surah Al-Ma'idah, Ayah 64 (Jews and Christians are criticized for their hypocrisy)
        Pair(5, 41),   // Surah Al-Ma'idah, Ayah 41 (Jews’ transgressions and stubbornness in faith)
        Pair(5, 82),   // Surah Al-Ma'idah, Ayah 82 (The Jews' enmity towards the Prophet Muhammad and Islam)
    )

    val otherJinnVerses = listOf(
        Pair(6, 100),  // Surah Al-An'am, Ayah 100 (Jinn believed to be associates of Allah in the paganism)
        Pair(72, 10),  // Surah Al-Jinn, Ayah 10 (Jinn speak about the lies spread by others)
        Pair(55, 35),  // Surah Ar-Rahman, Ayah 35 (Jinn and humans called to heed Allah's commands)
        Pair(55, 56),  // Surah Ar-Rahman, Ayah 56 (Jinn’s obedience to Allah’s commands)
        Pair(72, 18),  // Surah Al-Jinn, Ayah 18 (Jinn worship Allah in specific places)
        Pair(51, 56),  // Surah Adh-Dhariyat, Ayah 56 (Jinn and humans created to worship Allah alone)
        Pair(51, 57),  // Surah Adh-Dhariyat, Ayah 57 (The creation of jinn and their role in worship)
        Pair(37, 158), // Surah As-Saffat, Ayah 158 (Jinn disturbed by the message of the Prophets)
        Pair(2, 275),  // Surah Al-Baqarah, Ayah 275 (Jinn’s evil influence and transaction with humans)
        Pair(72, 11),  // Surah Al-Jinn, Ayah 11 (Jinn’s experience with the heavens)
    )


    val aynAndHasadVerses = listOf(
        // Ayn (Jealousy/Envy)
        Pair(2, 268),  // Surah Al-Baqarah, Ayah 268
        Pair(3, 60),   // Surah Aal-E-Imran, Ayah 60
        Pair(7, 45),   // Surah Al-A'raf, Ayah 45
        Pair(9, 80),   // Surah At-Tawbah, Ayah 80
        Pair(10, 56),  // Surah Yunus, Ayah 56
        Pair(11, 15),  // Surah Hud, Ayah 15
        Pair(12, 11),  // Surah Yusuf, Ayah 11
        Pair(13, 11),  // Surah Ar-Ra'd, Ayah 11
        Pair(16, 107), // Surah An-Nahl, Ayah 107
        Pair(40, 74),  // Surah Ghafir, Ayah 74

        // Hasad (Envy)
        Pair(4, 32),   // Surah An-Nisa, Ayah 32
        Pair(20, 131), // Surah Ta-Ha, Ayah 131
        Pair(41, 26),  // Surah Fussilat, Ayah 26
        Pair(113, 1),  // Surah Al-Falaq, Ayah 1
        Pair(113, 5)   // Surah Al-Falaq, Ayah 5
    )





}