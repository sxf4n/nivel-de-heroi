// DIO Code Challenge - Hero Level Classifier.     User: https://dio.me/users/brian
enum class HeroClass {WARRIOR, MAGE, ROGUE, PRIEST, BARBARIAN}
enum class HeroRank {IRON, BRONZE, SILVER, GOLD, PLATINUM, DIAMOND, IMMORTAL, RADIANT}

data class HeroStatus(val name: String, val experience: Int, val character: HeroClass) {
    val rank = getRank(experience)
}

fun getRank (experience: Int): HeroRank {
    return when (experience) {
        in 0..2000 -> HeroRank.IRON
        in 2001..3000 -> HeroRank.BRONZE
        in 3001..4000 -> HeroRank.SILVER
        in 4001..5000 -> HeroRank.GOLD
        in 5001..6000 -> HeroRank.PLATINUM
        in 6001..7000 -> HeroRank.DIAMOND
        in 7001..8000 -> HeroRank.IMMORTAL
        else -> HeroRank.RADIANT
    }
}

fun main() {
    println("HERO INFORMATION")
    val heroes = listOf(
        HeroStatus("Gandalf", 6969, HeroClass.MAGE),
        HeroStatus("Maximus", 9200, HeroClass.WARRIOR),
        HeroStatus("Duncan", 7444, HeroClass.BARBARIAN),
        HeroStatus("Stefan", 12668, HeroClass.ROGUE),
        HeroStatus("Vega", 5501, HeroClass.PRIEST)
    )

    for (hero in heroes) {
        println("Name: ${hero.name}  |  Class: ${hero.character}  |  " +
                "Exp: ${hero.experience}  |  Rank: ${hero.rank}")
    }
}