package pieces;

import game.Piece;
import game.Player;
import game.Menu;
import game.Space;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class QueenPiece extends Piece {
	
	private BufferedImage image;
	
	/**
	 * Constructs a Queen with the passed player and sets the image
	 * 
	 * @param player the player of the piece
	 */
	public QueenPiece(Player player) {
		super(player);
		
		if(player == Menu.blackPlayer) {
			try {                
				image = ImageIO.read(new File("src/images/queen_black.png"));
			} catch (IOException ex) {
				System.out.println("File Not Found!");
			}
		} else if(player.equals(Menu.whitePlayer)) {
			try {                
				image = ImageIO.read(new File("src/images/queen_white.png"));
			} catch (IOException ex) {
				System.out.println("File Not Found!");
			}
		}
		
		setImage(image);
	}
	
	public String toString() {
		return "Queen";
	}

	@Override
	public ArrayList<Space> getMoves() {
		// TODO Auto-generated method stub
		return null;
	}
}
