import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import kom.feuerwehr.gui.GuiS;

public class SocketServer {

	static ServerSocket myServerSocket;
	static int offeneVerbindungen = 0;
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		GuiS guiS = new GuiS();
		// An Port 13000 binden:
		try {
			serverSocket = new ServerSocket(13112);
		} catch (IOException e) {
			System.out.println("Binden an Port  13000 schlug fehl: "
					+ e.getMessage());
			System.exit(-1);
		}

		// In einer Endlosschleife auf eingehende Anfragen warten.
		while (true) {
			try {
				// Blocken, bis eine Anfrage kommt:
				Socket clientSocket = serverSocket.accept();

				// Wenn die Anfrage da ist, dann wird ein Thread gestartet, der
				// die weitere Verarbeitung �bernimmt.
				offeneVerbindungen++;
				Thread threadHandler = new Thread(new TextServerHandler(clientSocket, guiS, offeneVerbindungen));
				guiS.setOffeneVerbindungen(offeneVerbindungen);
				threadHandler.start();
			} catch (IOException e) {
				System.out.println("'accept' auf Port 13000 fehlgeschlagen");
				System.exit(-1);
			}
		}
	}
}