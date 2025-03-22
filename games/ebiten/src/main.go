package main

import (
	"log"

	"github.com/hajimehoshi/ebiten/v2"
	"github.com/playing-with/games/ebiten/game"
)

func main() {
	ebiten.SetWindowSize(640, 480)
	ebiten.SetWindowTitle("Square Game")
	if err := ebiten.RunGame(game.NewGame()); err != nil {
		log.Fatal(err)
	}
}
