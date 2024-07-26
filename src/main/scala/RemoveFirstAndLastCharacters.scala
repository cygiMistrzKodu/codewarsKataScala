case class Player(name: String)

def duckDuckGoose(players: Seq[Player], goose: Int): String = {

  val index = (goose - 1) % players.size
  players(index).name
}