package main

import (
	"fmt"
	"image/color"
	"log"

	"github.com/hajimehoshi/ebiten/v2"
	"github.com/hajimehoshi/ebiten/v2/inpututil"
	"github.com/hajimehoshi/ebiten/v2/vector"
)

const (
	screenWidth        = 640
	screenHeight       = 480
	gridSize           = 10
	xGridCountInScreen = screenWidth / gridSize
	yGridCountInScreen = screenHeight / gridSize
)

type Position struct {
	X int
	Y int
}

type Game struct {
	moveDirection int
	snakeBody     []Position
	apple         Position
	timer         int
	moveTime      int
	score         int
	bestScore     int
	level         int
}

const (
	dirNone = iota
	dirLeft
	dirRight
	dirDown
	dirUp
)

func (g *Game) Update() error {
	if inpututil.IsKeyJustPressed(ebiten.KeyRight) {
		fmt.Println("HELO")
		g.snakeBody[0].X++
	}
	return nil
}

func (g *Game) Draw(screen *ebiten.Image) {
	for _, v := range g.snakeBody {
		vector.DrawFilledRect(screen, float32(v.X*gridSize), float32(v.Y*gridSize), gridSize, gridSize, color.RGBA{0x80, 0xa0, 0xc0, 0xff}, false)
	}
}

func (g *Game) Layout(outsideWidth, outsideHeight int) (screenWidth, screenHeight int) {
	return 320, 240
}

func main() {
	ebiten.SetWindowSize(640, 480)
	ebiten.SetWindowTitle("Hello, World!")
	if err := ebiten.RunGame(&Game{snakeBody: make([]Position, 1)}); err != nil {
		log.Fatal(err)
	}
}
