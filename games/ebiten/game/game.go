package game

import (
	"image/color"
	"math/rand"
	"time"

	"github.com/hajimehoshi/ebiten/v2"
	"github.com/hajimehoshi/ebiten/v2/inpututil"
	"github.com/hajimehoshi/ebiten/v2/vector"
)

const (
	screenWidth  = 640
	screenHeight = 480
	squareSize   = 20
)

type Position struct {
	X float64
	Y float64
}

type Game struct {
	square Position
	target Position
	color  color.RGBA
}

func NewGame() *Game {
	rand.Seed(time.Now().UnixNano())
	return &Game{
		square: Position{X: screenWidth / 2, Y: screenHeight / 2},
		target: Position{X: rand.Float64() * (screenWidth - squareSize), Y: rand.Float64() * (screenHeight - squareSize)},
		color:  randomColor(),
	}
}

func randomColor() color.RGBA {
	return color.RGBA{
		R: uint8(rand.Intn(256)),
		G: uint8(rand.Intn(256)),
		B: uint8(rand.Intn(256)),
		A: 0xff,
	}
}

func (g *Game) Update() error {
	// Movimiento del cuadrado principal
	if inpututil.IsKeyJustPressed(ebiten.KeyRight) && g.square.X+squareSize < screenWidth {
		g.square.X += float64(squareSize)
	}
	if inpututil.IsKeyJustPressed(ebiten.KeyLeft) && g.square.X > 0 {
		g.square.X -= float64(squareSize)
	}
	if inpututil.IsKeyJustPressed(ebiten.KeyDown) && g.square.Y+squareSize < screenHeight {
		g.square.Y += float64(squareSize)
	}
	if inpututil.IsKeyJustPressed(ebiten.KeyUp) && g.square.Y > 0 {
		g.square.Y -= float64(squareSize)
	}

	// Verificar colisión con el objetivo
	if g.square.X < g.target.X+squareSize &&
		g.square.X+squareSize > g.target.X &&
		g.square.Y < g.target.Y+squareSize &&
		g.square.Y+squareSize > g.target.Y {
		// Cambiar la posición del objetivo a una nueva posición aleatoria
		g.target.X = rand.Float64() * (screenWidth - squareSize)
		g.target.Y = rand.Float64() * (screenHeight - squareSize)
		// Cambiar el color del objetivo
		g.color = randomColor()
	}

	return nil
}

func (g *Game) Draw(screen *ebiten.Image) {
	// Dibujar el cuadrado principal
	vector.DrawFilledRect(screen, float32(g.square.X), float32(g.square.Y), squareSize, squareSize, color.RGBA{0x80, 0xa0, 0xc0, 0xff}, false)

	// Dibujar el objetivo
	vector.DrawFilledRect(screen, float32(g.target.X), float32(g.target.Y), squareSize, squareSize, g.color, false)
}

func (g *Game) Layout(outsideWidth, outsideHeight int) (int, int) {
	return screenWidth, screenHeight
}
