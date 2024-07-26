case class Player(name: String)

def duckDuckGoose(players: Seq[Player], goose: Int): String = {

  var chosen = ""
  val allPlayers =  players.length
  if (goose < allPlayers) {
    chosen = players.apply(goose - 1).name
  }

  if (goose > allPlayers && goose % allPlayers != 0) {
    chosen = players.apply(goose % allPlayers - 1).name
  }

  if (goose % allPlayers == 0) {
    chosen = players.last.name
  }

  chosen
}