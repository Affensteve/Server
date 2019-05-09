import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import kom.feuerwehr.gui.GuiS;

public class TextServerHandler implements Runnable {
	private Socket clientSocket;
	private GuiS gui;
	private int anzahl;

	public TextServerHandler(Socket _clientSocket, GuiS gui, int anzahl) {
		this.clientSocket = _clientSocket;
		this.gui = gui;
		this.anzahl = anzahl;
	}

	@Override
	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			String strInput = null;
			while ((strInput = in.readLine()) != null) {
				gui.setSettings(strInput.split("\\s")[0],
						Integer.valueOf(strInput.split("\\s")[1]));
			}
			int current = anzahl - 1;
			gui.setOffeneVerbindungen(current);
		} catch (IOException ioEx) {
			System.out.println("Fehler beim Schreiben:" + ioEx.getMessage());
		}
	}
}