import java.io.*;
/*
  A board is the gameBoardModel where scrabble is played.
  A new board can be made
  Tiles will be replaced after letter selection is complete
*/
public class GameBoardModel{

  private Tile[][] gameBoardModel;
  private TileCollection tileCollection;

  public GameBoardModel(){
    this.tileCollection = new TileCollection();
    this.gameBoardModel = new Tile[6][6];
    this.gameBoardModel = this.makeGameBoard();
  }

  public Tile[][] makeGameBoard(){
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        this.gameBoardModel[i][j] = this.tileCollection.removeOne();
      }
    }
    return this.gameBoardModel;
  }

  public String toString(){
    String gameBoardString = "";
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        gameBoardString += this.gameBoardModel[i][j].toString() + ' ';
      }
      gameBoardString += '\n';
    }
    return gameBoardString;
  }
  public static void main(String[] args) {
    GameBoardModel gameBoardModel = new GameBoardModel();
    System.out.println(gameBoardModel.toString());
  }
}
