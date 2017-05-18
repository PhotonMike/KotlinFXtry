package kotlintry

import javafx.scene.Scene
import javafx.scene.layout.GridPane
import javafx.stage.Stage

/**
 * Created by 2013.A on 2017. 05. 18..
 */
class KotlinMain {
    fun start () {
        val stage = Stage();
        val grid = GridPane();
        stage.title="Kotlin!"
        stage.scene= Scene(grid, 300.0, 275.0)
        stage.show()
    }
}