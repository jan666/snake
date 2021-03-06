package de.htwg.snake.uis.gui.themes
import java.awt.Color

class NokiaTheme extends Theme {

  def backgroundColor: Color = {
    new Color(183, 223, 160)
  }

  def snakeColor: Color = {
    Color.BLACK;
  }

  def barricadeColor: Color = {
    Color.BLACK
  }

  def foodColor: Color = {
    Color.GRAY
  }
  
  def extraFoodColor: Color = {
    Color.RED
  }

}